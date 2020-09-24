package snake;

public class Game {
	private GameWindow gameWindow;
	private Snake snake;
	private Renderer renderer;

	public void start() {
		snake = new Snake();
		gameWindow = new GameWindow();
		renderer = gameWindow.getRenderer();

		addElementsToScree();
		run();
	}

	private void addElementsToScree() {
		renderer.add(new Background());
		renderer.add(snake);
	}

	private void run() {
		do {
			gameWindow.repaint();
			
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
			
		} while (!isGameOver());
	}

	private boolean isGameOver() {
		return false;
	}
}
