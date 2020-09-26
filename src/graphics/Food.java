package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

import scene.Snake;
import util.Constants;
import util.GameUtils;

public class Food extends Rect {
	private int eatenTimes;

	public Food(Snake snake, Rectangle drawingArea) {
		setRandomLocation(snake, drawingArea);
		setDimension(new Dimension(Constants.FOOD_SIZE, Constants.FOOD_SIZE));
		setColor(Constants.FOOD_COLOR);
	}

	public void setRandomLocation(Snake snake, Rectangle drawingArea) {
		int offset = 3;
		
		do {
			int x = GameUtils.random((int) drawingArea.getMinX() + offset, (int) drawingArea.getMaxX() - Constants.FOOD_SIZE - offset);
			int y = GameUtils.random((int) drawingArea.getMinY() + offset, (int) drawingArea.getMaxY() - Constants.FOOD_SIZE - offset);
			
			setlocation(new Point(x, y));
		} while(snake.intersects(this));
	}
	
	public void checkIfEaten(Snake snake, Rectangle drawingArea) {
		if (snake.intersects(this)) {
			eatenTimes++;
			setRandomLocation(snake, drawingArea);
			snake.elongate();
		}
	}
	
	public int getEatenTimes() {
		return eatenTimes;
	}
}
