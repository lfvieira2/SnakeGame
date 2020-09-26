package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Rect extends Drawable {
	private Rectangle rect;
	
	public Rect() {
		super(Color.BLACK);
		rect = new Rectangle(0, 0, 0, 0);
	}
	
	public Rect(int x, int y, int width, int height) {
		super(Color.BLACK);
		rect = new Rectangle(x, y, width, height);
	}
	
	public Rect(Point location, Dimension dimension) {
		super(Color.BLACK);
		rect = new Rectangle(location, dimension);
	}

	public Point getLocation() {
		return rect.getLocation();
	}
	
	public void setlocation(Point location) {
		rect.setLocation(location);
	}
	
	public Dimension getDimension() {
		return rect.getSize();
	}
	
	public void setDimension(Dimension dimension) {
		rect.setSize(dimension);
	}
	
	public boolean intersects(Rect other) {
		return rect.intersects(other.rect);
	}

	@Override
	public void draw(Graphics g) {
		g.fillRect((int) rect.getX(), (int) rect.getY(), (int) rect.getWidth(), (int) rect.getHeight());
	}
}
