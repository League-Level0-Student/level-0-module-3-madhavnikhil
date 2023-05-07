package _02_loop_variables._1_years_alive;

import javax.swing.JOptionPane;

public class yearsalive {
   public static void main(String[] args) {
	   
	  String age = JOptionPane.showInputDialog("How old are you?");
	  int ager = Integer.parseInt(age);
	  
	  
	   int birth = 2023 - ager;
	  
	for (int i = 0; i < ager; i++) {
		
		System.out.println(birth);
		birth+=1;
		
	}
}
}
