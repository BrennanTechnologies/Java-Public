/**
 * Description
 * Using the value 3.14 for Pi, find the area of a circle with a radius that is provided by the user.
 *
 * @author Chris Brennan
 * @since 9-18-21
 */

import java.util.Scanner;

public class Circles01 {

	public static void main(String[] args) {

		// All the dirty work happens in the 'circleArea()' method;
		// let's call it here from the main method!
		circleArea();

	}

	public static void circleArea() {

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Radius: ");
		double radius = scanner.nextDouble();

		System.out.println();
		
		// ========== INSERT YOUR CODE HERE ==========

		final double PI = 3.14;

		double area = PI * (radius * radius);

		System.out.println("AREA = " + area);

		// close the scanner
		scanner.close();

		// ===========================================        

	}

}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

- Remebering what a constant is called in java.


2. What will you always remember (never forget) from this exercise?
 
- That constants in Java are called "final"

*/