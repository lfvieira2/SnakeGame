package core;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import graphics.Renderer;
import scene.Snake;
import util.Constants;

@SuppressWarnings("serial")
public class GameWindow extends JFrame implements KeyListener {
	private Renderer renderer;
	private Snake snake;
	private Image buffer;
	private Graphics gImage;

	public GameWindow(Snake snake) {
		this.snake = snake;

		setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		setResizable(false);
		setTitle(Constants.WINDOW_TITLE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addKeyListener(this);
		setVisible(true);

		buffer = createImage(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
		gImage = buffer.getGraphics();
		renderer = new Renderer(gImage);
	}

	public Renderer getRenderer() {
		return renderer;
	}

	public void paint(Graphics gScreen) {
		if (gImage == null || renderer == null) {
			return;
		}
		renderer.render();
		gScreen.drawImage(buffer, 0, 0, null);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			snake.up();
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			snake.down();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			snake.left();
		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			snake.right();
		} else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

}
