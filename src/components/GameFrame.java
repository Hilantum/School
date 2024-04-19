package components;

import javax.swing.*;

public class GameFrame extends JFrame {	
	public GameFrame(GamePanel panel) {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(panel);
	}
}
