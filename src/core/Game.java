package core;

import graphics.Renderer;
import scene.Background;
import scene.Snake;
import util.GameUtils;

public class Game implements Runnable {
	private GameWindow gameWindow;
	private Snake snake;
	private Renderer renderer;

	public void start() {
		snake = new Snake();
		gameWindow = new GameWindow(snake);
		renderer = gameWindow.getRenderer();

		addElementsToScree();

		new Thread(this).start();
	}

	private void addElementsToScree() {
		renderer.add(new Background());
		renderer.add(snake);
	}

	@Override
	public void run() {
		do {
			gameWindow.repaint();
			snake.move();
			GameUtils.sleep(30);
		} while (!isGameOver());
		
		gameWindow.dispose();
	}

	private boolean isGameOver() {
		return snake.collidesWithItself();
	}
}
