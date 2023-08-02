package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class yearsalive {
   public static void main(String[] args) {
	   String age = JOptionPane.showInputDialog("How many years have you been alive?");
	   int alive = Integer.parseInt(age);
	   
	   for (int i = 2006; i < 2006 + alive; i++) {
		System.out.println(i);
	}
   }
   
}
	