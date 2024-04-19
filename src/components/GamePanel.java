package components;

import javax.swing.*;
import java.awt.*;
import handlers.*;

public class GamePanel extends JPanel {
	public GamePanel() {
		this.addKeyListener(new KeyHandler());
		this.addMouseListener(new MouseHandler());
	}
	
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		
		Graphics2D G2D = (Graphics2D)graphics;
		
	}
}
