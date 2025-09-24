package com.study.eclipse;

//Using drawLine to connect the corners of a panel.
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;   // Creating JFrame to display DrawPanel.

public class GUIdrawingApplication extends JPanel {
	
	// draws an X from the corners of the panel
	public void paintComponent(Graphics g) {
		 // call paintComponent to ensure the panel displays correctly
		 super.paintComponent(g);
		 
		 int width = getWidth(); // total width   
		 int height = getHeight(); // total height
		 
		// draw a line from the upper-left to the lower-right
		 g.drawLine(0, 0, width, height);
		 
		// draw a line from the lower-left to the upper-right
		 g.drawLine(0, height, width, 0);
	}
	
	 public static void main(String[] args) {
		
		 // create a panel that contains our drawing
		 DrawPanel panel = new DrawPanel();
		 
		 // create a new frame to hold the panel
		 JFrame application = new JFrame();
		 
		// set the frame to exit when it is closed
		 application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 application.add(panel); // add the panel to the frame      
		 application.setSize(250, 250); // set the size of the frame
		 application.setVisible(true); // make the frame visible 

		 
	 }

	
} 





