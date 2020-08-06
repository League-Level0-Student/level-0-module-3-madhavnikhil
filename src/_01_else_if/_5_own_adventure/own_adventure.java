package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
public static void main(String[] args) {
	String Input = JOptionPane.showInputDialog("At Hogwarts in your free time would you go to the forbidden forest, library, chamber of secrets, or just hang out with friends?");
	if (Input.equals("Forbidden Forest")) {
		JOptionPane.showMessageDialog(null, "You're a Gryffindor. You are very brave, courageous, strong, daring, and adventurous.");
	}
	if (Input.equals("Chamber of Secrets")) {
		JOptionPane.showMessageDialog(null, "You're a Slytherin. You are very cunning, mean, and malicious.");
	}
	if (Input.equals("Library")) {
		JOptionPane.showMessageDialog(null, "You're a Ravenclaw. You are very intellegent, wise, and inquisitive.");
	}
	if (Input.equals("Hanging out with Friends")) {
		JOptionPane.showMessageDialog(null, "You're a Hufflepuff. You are very kind, caring, warm, empathetic, loyal, patient, and dedicated.");
	}
	
}
}
