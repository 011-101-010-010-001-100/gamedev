package gamedev;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class game_window {
	private JFrame jframe;
	
	public game_window(game_panel gamePanel) {
		
		jframe = new JFrame();
		
		jframe.setSize(700,1000);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(gamePanel);
		jframe.setVisible(true);
		
	}
}
