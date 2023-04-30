
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		
		Robot Rob = new Robot();
		Rob.penDown();
		Rob.setSpeed(10);
		Rob.setPenColor(Color.black);
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		
		//3. Set the pen width to 10
		Rob.setPenWidth(10);
		
		//4. Ask the user what color pen they would like the robot to draw with
		String Eshaan = JOptionPane.showInputDialog("What color would you like to draw with?");
				
		//5. Use an if/else statement to set the pen color that the user requested
		for (int i = 0; i < 5; i++) {
			
		
		if (Eshaan.equalsIgnoreCase("black")) {
			Rob.setPenColor(Color.BLACK);
			
		}
		else if (Eshaan.equalsIgnoreCase("green")) {
			Rob.setPenColor(Color.GREEN);
		}
		else {
			Rob.setRandomPenColor();
		}
		for (int j = 0; j < 4; j++) {
			Rob.move(100);
			Rob.turn(90);
		}
		
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
