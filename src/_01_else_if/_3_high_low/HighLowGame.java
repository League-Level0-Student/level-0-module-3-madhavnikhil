
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		
		// 2. Print out the random variable above
	Random highlow = new Random();
	int numeric = highlow.nextInt(100);
		// 11. Repeat steps 1 to 10 ten times
		
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String user = JOptionPane.showInputDialog("Guess the number.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int symbol = Integer.parseInt(user);
			// 5. if the guess is correct
				// 6. Win
		if (symbol == numeric) {
			JOptionPane.showMessageDialog(null, "You win.");
			System.exit(0);
		}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
		else if (symbol > numeric) {
			JOptionPane.showMessageDialog(null, "Your guess is too high.");
		}
			// 9. if the guess is low
				// 10. Tell them it's too low
		else {
			JOptionPane.showMessageDialog(null, "Your guess is too low.");
		}
		// 13. Tell them they lose
		
	}

}



