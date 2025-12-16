/**
 * Description
 * This program will dole out a compliment if the user wants one.
 *
 * @author Chris Brennan
 * @since 10-2-21
 */
 
import java.util.Scanner;

public class Compliment02 {
    public static void main (String[] args) {
		makeCompliment();
	}

	public static void makeCompliment() {
		// Instantiate Scanner Object.
		Scanner scanner = new Scanner(System.in);

		// Prompt User for Input and store it in variable.
		System.out.println("Would you like a compliment (\"1\" for YES, \"2\" for NO)?");
		int userInput = scanner.nextInt();

		// Perform Comparison and Output the Results.
		if (userInput == 1) {
			System.out.println("You are an amazing programmer.");
		}
		System.out.println("Game Over");

		// Close the Scanner.
		scanner.close();
	}
}
// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
In this case there was no need for the else statement.

2. What will you always remember (never forget) from this exercise?

Dont use the else statement if it isnt needed.
*/