
package _02_loop_variables._2_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
		
		// 1. Call the method below to play the sound
		playMisterZee();
		// 2. Ask the user how many shiny objects they want
	String Lily = JOptionPane.showInputDialog("How many shiny objects you want?");
		// 3. Play the sound that many times
	int James = Integer.parseInt(Lily);
        for (int i = 0; i < James; i++) {
        	playMisterZee();
		}

	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public static void playMisterZee() {
		JOptionPane.showMessageDialog(null, "HI I'M MR. Z!");
	}


}
