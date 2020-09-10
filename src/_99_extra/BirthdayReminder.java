
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String Vernon = "September 14";
		String Petunia = "September 3";
		String Dudley = "July 23";

		// 2. Find out which birthday the user wants and and store their response in a variable
    String Harry = JOptionPane.showInputDialog("Which birthday do you want to see?");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
			//print mom's birthday
    		if (Harry.equalsIgnoreCase("Vernon")) {
		       JOptionPane.showMessageDialog(null, Vernon);
			}
		// 5. if user asked for "dad"
			// print dad's birthday
    		if (Harry.equalsIgnoreCase("Petunia")) {
    			JOptionPane.showMessageDialog(null, Petunia);
    		}
    		if (Harry.equalsIgnoreCase("Dudley"))  {
    			 JOptionPane.showMessageDialog(null, Dudley);
	}
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
