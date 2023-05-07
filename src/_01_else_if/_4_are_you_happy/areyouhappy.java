package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {
	
	String happy = JOptionPane.showInputDialog("Are you happy?");
	if (happy.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
	}
	else if (happy.equalsIgnoreCase("No")) {
		String sadness = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if (sadness.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Change something");
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
	}
	
}
}
