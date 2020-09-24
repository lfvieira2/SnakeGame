package snake;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

public class Snake extends Shape {
	
	private Direction direction;

	public Snake() {
		super(Constants.SNAKE_COLOR);
		
		Point location = new Point(Constants.SNAKE_START_X, Constants.SNAKE_START_Y);
		Dimension dimension = new Dimension(Constants.SNAKE_PIACE_SIZE, Constants.SNAKE_PIACE_SIZE);
		Rect rect = new Rect(location, dimension);
		addRect(rect);
		
		for(int i = 1; i < Constants.SNAKE_INITIAL_SIZE; i++) {
			rect = duplicateRect(rect);
			addRect(rect);
		}
	}
	
}
