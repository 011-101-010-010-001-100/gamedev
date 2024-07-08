package gamedev;

public class game {
	
	private game_window gamewindow;
	private game_panel gamePanel;
	//need a constructor
	public game() {
		gamePanel = new game_panel();
		gamewindow = new game_window(gamePanel);
		
	}
	

}
