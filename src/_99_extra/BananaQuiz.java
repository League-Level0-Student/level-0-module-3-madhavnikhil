
package _99_extra;

import java.util.jar.JarOutputStream;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String Banana = JOptionPane.showInputDialog(null, "Do you like bananas?");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (Banana.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You are crazy.");
		}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
		else if (Banana.equalsIgnoreCase("yes")) {
			JOptionPane.showInputDialog("What is your favorite hobby?");
		}
		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
		else {
			JOptionPane.showMessageDialog(null, "You are bananas.");
		}
	
	}

}
