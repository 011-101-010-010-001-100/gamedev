package gamedev;

//public class game_panel {
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class game_panel extends JPanel{

    private BufferedImage image;

    public game_panel() {
       try {                
          image = ImageIO.read(new File("C:\\Users\\Subrat\\OneDrive\\Pictures\\mystery-maze.png"));
       } catch (IOException ex) {
    	   Logger.getLogger(game_panel.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        g.drawImage(image, 0, 0, this); // see javadoc for more info on the parameters            
	    }

	
}


