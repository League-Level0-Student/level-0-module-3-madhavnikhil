
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		
	for (int i = 0; i < 10; i++) {
		String user = JOptionPane.showInputDialog("What color would you like to draw the robot with?");
		Robot Mike = new Robot ();
		if (user.equalsIgnoreCase("Black")) {
			Mike.setPenColor(Color.BLACK);
		}
		  else if (user.equalsIgnoreCase("Red")) {
			  Mike.setPenColor(Color.red);
		  }
		  else {
			  Mike.setRandomPenColor();
		}
	
	    //2. Make the robot draw a shape (this will take more than one line of code)
		Mike.penDown();
		Mike.move(100);
		Mike.turn(90);
		Mike.move(100);
		Mike.turn(90);
		Mike.move(100);
		Mike.turn(90);
		Mike.move(100);
		//3. Set the pen width to 10
	 Mike.setPenWidth(10);
		
		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
	  
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
}