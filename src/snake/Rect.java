package snake;

import java.awt.Color;
import java.awt.Graphics;

public class Rect {
	private Color color;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rect() {
	}
	
	public Rect(Color color, int x, int y, int width, int height) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public Color getColor() {
		return color;
	}

	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
}
