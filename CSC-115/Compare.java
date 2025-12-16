/**
 * Description
 * This program will prompt the user for input and compare it to a number.
 * @author Chris Brennan
 * @since 10-2-21
 */

import java.util.Scanner; // Because, Greg.

public class Compare {
	public static void main (String[] args) {
		compareNumbers();
	}
	
	public static void compareNumbers() {
		// Instantiate Scanner Object.
		Scanner scanner = new Scanner(System.in);

		// Define the Comparison Variable.
		int compareNumber = 10;

		// Prompt User for Input and store it in variable.
		System.out.println("Enter an integer:");
		int userNumber = scanner.nextInt();

		// Perform Comparison and Output the Results.
		if (userNumber > compareNumber) {
			System.out.println("The number " + userNumber + " is GREATER than " + compareNumber + ".");
		} else {
			System.out.println("The number " + userNumber + " is NOT GREATER than " + compareNumber + ".");
		}
		System.out.println("Program finished!");

		// Close the Scanner.
		scanner.close();
	}
}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Creating a method.

2. What will you always remember (never forget) from this exercise?
That main is where you can call your methods.
*/