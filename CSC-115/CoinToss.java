/**
 * Description
 * Coin Flip Guessing Game!.
 * 
 * @author Chris Brennan
 * @since 10-2-21
 */

import java.util.Scanner;

public class CoinToss {
	public static void main(String[] args) {
		headsOrTails();  // the computer simulates flipping a coin 
						 // and the user guesses the result
	}
	
	// In this method, the computer simulates flipping a coin.
	// The user guesses the result, and the computer reports if they are correct.
	
	// The computer will use 0 to represent "heads" and 1 to represent "tails"
	// on the coin toss.
	
	public static void headsOrTails() {
		// computer randomly picks a number 0 or 1
		int flip = (int)(Math.random()*2);
		
		// ========== INSERT YOUR CODE HERE ==========
		// Instantiate Scanner Object.
		Scanner scanner = new Scanner(System.in);

		// Prompt the User for Input.
		System.out.println("0 is heads and 1 is tails.");
		System.out.println("What is your guess (0 or 1)?");
		
		// Get User Input and store it in variable.
		int guess = scanner.nextInt();

		// Output the Results.
		System.out.println("The computer got " + flip + ".");
		if (flip == guess) {
			System.out.println("You guessed right!");
		} else {
			System.out.println("Sorry, try again next time!");
		}

		// Close the Scanner.
		scanner.close();
		// ===========================================
	}
}
// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Adding the conditional logic.

2. What will you always remember (never forget) from this exercise?
That the equals comparison operator is ==
*/