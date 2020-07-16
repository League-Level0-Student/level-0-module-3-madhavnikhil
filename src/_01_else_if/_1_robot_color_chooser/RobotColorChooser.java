
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Set;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
        Robot Umbridge = new Robot();
        String Input = JOptionPane.showInputDialog("What color pen would like? You can choose Green, Blue, Red, or Yellow.");
		
		//5. Use an if/else statement to set the pen color that the user requested
        if (Input.equalsIgnoreCase("Green")) {
          Umbridge.setPenColor(Color.green);
        }
        if (Input.equalsIgnoreCase("Blue")) {
        	Umbridge.setPenColor(Color.blue);
		}
        if (Input.equalsIgnoreCase("Yellow")) {
        	Umbridge.setPenColor(Color.yellow);
        }
        if (Input.equalsIgnoreCase("Red")) {
        	Umbridge.setPenColor(Color.red);
        }
        
	    //2. Make the robot draw a shape (this will take more than one line of code)	
        Umbridge.penDown();
    	Umbridge.setSpeed(100);
    	Umbridge.move(100);
    	Umbridge.turn(100);
    	
    	Umbridge.move(100);
    	Umbridge.turn(-140);
    	Umbridge.move(100);
		//3. Set the pen width to 10
        Umbridge.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
       
		 
        //6. If the user doesn't enter anything, choose a random color
        else {
           
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
