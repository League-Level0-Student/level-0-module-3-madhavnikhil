package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {
	public static void main(String[] args) {
		String Harry = JOptionPane.showInputDialog(null, "Are you happy?");
		if (Harry.equals("no")) {
			String LilyEvans = JOptionPane.showInputDialog("Do you want to be happy?");
			if (LilyEvans.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			} else {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
			}
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
	}
}
