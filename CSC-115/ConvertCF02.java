/**
 * Description
 * The user inputs a value (in degrees Celsius) and the computer outputs the temperature in degrees Fahrenheit.
 *
 * @author Chris Brennan
 * @since 9-17-21
 */

import java.util.Scanner;

public class ConvertCF02 {

	public static void main(String[] args) {
		convert(); // a method to get input, convert, and print
	}

	// get input from the user, convert, print
	public static void convert() {

		// ========== INSERT YOUR CODE HERE ==========

		Scanner scanner = new Scanner(System.in);
		
		// Get the Input & Store in variable.
		double celsius = scanner.nextDouble();

		System.out.println("Temperature:");
		//System.out.println(celsius);

		// Convert from Celsius to Fahrenheit
		double fahrenheit = (9.0/5.0) * celsius + 32;

		// Display the Output
		String output = "In Fahrenheit, the temperature is " + fahrenheit;
		System.out.println(output);

		// close the scanner
		scanner.close();

		// ===========================================        

	}
}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Calculating the conversion with floars.

2. What will you always remember (never forget) from this exercise?

Had to use scanner.nextDouble(); with double celsius

*/