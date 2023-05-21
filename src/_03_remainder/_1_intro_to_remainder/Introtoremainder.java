package _03_remainder._1_intro_to_remainder;

import java.util.Random;

public class Introtoremainder {
public static void main(String[] args) {
	Random modulo = new Random();
	int number = modulo.nextInt(100);
	if (number % 2 == 0) {
		System.out.println("number is even");
	}
	else {
		System.out.println("number is odd");
	}
	
}
}
