import java.awt.event.*;
import javax.swing.*;
import components.*;
import java.time.*;
import java.awt.*; 

public class Main implements Runnable {
	private GamePanel panel;
	private GameFrame frame;
	
	public Main() {
		panel = new GamePanel();
		frame = new GameFrame(panel);
		panel.requestFocus();
		
		Thread thread = new Thread(this);
		thread.run();
	}
	
	@Override public void run() {
		double time = 1000000000 / Config.MAX_FPS;
		long lastSecond = System.nanoTime();
		long lastFrame = System.nanoTime();
		int numFrames = 0;
				
		while (true) {
			if (System.nanoTime() - lastFrame >= time) { // If the current nanoTime minus the last nanoTime we checked is greater or equal to our frame duration
				panel.repaint(); // Since it is greater or equal to our frame time, we begin the next frame
				lastFrame = System.nanoTime(); // Reset the time between frames
				numFrames += 1; // Number of frames for this round is increased.
			}
			
			if (System.nanoTime() - lastSecond >= 1000000000) { // Does the above but with to track seconds rather than frames.
				System.out.println("FPS: " + numFrames);
				lastSecond = System.nanoTime();
				numFrames = 0;
			}
		}
	}
	
	public static void main(String[] args) { new Main(); }
}
