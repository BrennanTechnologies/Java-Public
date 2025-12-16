/**
 * Description
 * This program  asks the user for an int and uses it as a seed for the random number generator.

 * @author Chris Brennan
 * @since 9/25/21
 */

import java.util.Scanner;
import java.util.Random;

public class RandomChars {
	public static void main(String[] args) {
		makeRandoms(); // ask the user for a seed and make all the random things
	}
	
	// this method asks the user for a seed for the random number generator and 
	// then generates a random uppercase char, lowercase char, digit char
	public static void makeRandoms() {
	// ========== INSERT YOUR CODE HERE ==========
		// Instantiate Scanner Object.
		Scanner scanner = new Scanner(System.in);
		
		// Get user input for Seed Value.
		System.out.println("Enter a seed for the random number generator:");
		int seed = scanner.nextInt();

		// Create Random Object with Seed.
		Random rnd = new Random();
 		rnd.setSeed(seed);

		// Generate Radomized Numbers in Specific Ranges.
		int uCase = rnd.nextInt(90 - 65 + 1) + 65;  // UpperCase : ascii 65 - 90
		int lCase = rnd.nextInt(122 - 97 + 1) + 97; // LowerCase : ascii 97 - 122
		int digit = rnd.nextInt(57 - 48 + 1) + 48;  // Digit     : ascii 49 - 57

		// Print Output.
		System.out.println("RANDOM:");
		System.out.println("Uppercase = " + (char)uCase); 
		System.out.println("Lowercase = " + (char)lCase); 
		System.out.println("Digit = " + (char)digit);
		// ===========================================        
	}
}

// =============== LAB SUMMARY ===============
/*
1. What was the hardest part of this lab?
Generating a range with the Random object.

2. What will you always remember (never forget) from this exercise?
How to specify a range for the random generator.
*/