/**
 * Description
 * This prograns Performs Several String Operations
 * 
 * @author Chris Brennan
 * @since 9-28-21
 */
 
import java.util.Scanner;

public class StringLab01 {
	public static void main (String[] args) {
		stringLab();
	}

	public static void stringLab() {
		// ========== INSERT YOUR CODE HERE ==========
		
		// Instantiate Scanner Object.
		Scanner scanner = new Scanner(System.in);

		// Prompt User for Input.
		System.out.println("Please enter a phrase:");
		String phrase = scanner.nextLine();
		System.out.println("Please enter a character to search for:");
		String character = scanner.nextLine();

		// Perform String Operations
		int stringLength = phrase.length();
		char firstPosition = phrase.charAt(0);
		char lastPosition = phrase.charAt( phrase.length() - 1 );
		int characterPosition = (phrase.indexOf(character)) + 1;

		// Print Output.
		System.out.println("The length of your String is " + stringLength + ".");
		System.out.println("The character in the first position is '" + firstPosition + "'.");
		System.out.println("The character in the last position is '" + lastPosition + "'.");
		System.out.println("The first occurrence of '" + character + "' is in position " + characterPosition + ".");
	// ===========================================
	}
}

// =============== LAB SUMMARY ===============
/*
1. What was the hardest part of this lab?
Finding the character positions.

2. What will you always remember (never forget) from this exercise?
When finding the .indexOf(character) the index starts at zero.
*/