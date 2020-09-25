package graphics;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Renderer {

	private List<Drawable> drawables;
	private Graphics gImage;

	public Renderer(Graphics gImage) {
		drawables = new ArrayList<>();
		this.gImage = gImage;
	}

	public synchronized void render() {
		for (Drawable d : drawables) {
			gImage.setColor(d.getColor());
			d.draw(gImage);
		}
	}

	public synchronized void add(Drawable d) {
		drawables.add(d);
	}

	public synchronized void remove(Drawable d) {
		drawables.remove(d);
	}

}
