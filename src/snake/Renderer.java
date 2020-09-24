package snake;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Renderer {

	private List<Drawable> drawables;
	
	public Renderer() {
		drawables = new ArrayList<>();
	}
	
	public void render (Graphics g) {
		for (Drawable d : drawables) {
			d.draw(g);
		}
	}

	public void add(Drawable d) {
		drawables.add(d);
	}
	
	public void remove(Drawable d) {
		drawables.remove(d);
	}

}
