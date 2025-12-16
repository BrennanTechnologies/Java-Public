/**
 * Description
 * The program will randomly generate a salt of five characters and append it to the password:
 * 
 * @author Chris Brennan
 * @since 9-29-21
 */
 
import java.util.Scanner;
import java.util.Random;

public class SaltPassword {
	public static void main (String[] args) {
		saltIt();
	}

	public static void saltIt() {
		// ========== INSERT YOUR CODE HERE ==========
		// Instantiate Scanner Object.
		Scanner scanner = new Scanner(System.in);
		
		// Get user input for Seed Value.
		System.out.println("Enter seed:");
		int seed = scanner.nextInt();

		// Get user input for Password.
		System.out.println("Enter a password:");
		scanner.nextLine();
		String myPassword = scanner.nextLine();

		// Create Random Object with Seed.
		Random rnd = new Random();
 		rnd.setSeed(seed);

		// Generate Salt
		int salt1 = rnd.nextInt(122 - 65 + 1) + 65;
		int salt2 = rnd.nextInt(122 - 65 + 1) + 65;
		int salt3 = rnd.nextInt(122 - 65 + 1) + 65;
		int salt4 = rnd.nextInt(122 - 65 + 1) + 65;
		int salt5 = rnd.nextInt(122 - 65 + 1) + 65;

		// Print Output.
		System.out.println("Salt: " + (char)salt1 + (char)salt2 + (char)salt3 + (char)salt4 + (char)salt5);
		System.out.println("Salted password: " + myPassword + (char)salt1 + (char)salt2 + (char)salt3 + (char)salt4 + (char)salt5); 
		
		// Close the Scanner
		scanner.close();
		// ===========================================        
	}
}

// =============== LAB SUMMARY ===============
/*

1. What was the hardest part of this lab?
Getting the scanner to read the password.

2. What will you always remember (never forget) from this exercise?
Remembering to advance the scanner to the next new line.

*/