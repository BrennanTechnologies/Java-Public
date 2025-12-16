/**
 * Description
 * This program takes user input in the form of inches, and converts it to feet and inches.
 * 
 * @author Chris Brennan
 * @since 9/7/21
 
 */

import java.util.Scanner;

public class InchesToFeet {
	public static void main(String[] args) {

		// All the dirty work happens in the 'convert()' method; let's call it here from the main method!
		convert();      
             
	}
   
	// This method asks the user for total inches and outputs the conversion to feet and inches
  public static void convert() {

	  // Create a new Scanner to read in input from user
	  Scanner scanner = new Scanner(System.in);
      
      // Prompt the user and then store their input in 'totalInches'
      System.out.println("Enter the number of inches:");
      
      // Get user input.
      int totalInches = scanner.nextInt();

      // Calculate the number of feet using the division operator.
      int feet = totalInches/12;

      // Calculate the number of inches using the modulus operator.
      int inches = totalInches % 12;

      // Out put ther text string.
      String output = totalInches + " inches is " + feet + " feet, and " + inches + " inches";
      System.out.println(output);

      // ===========================================
    
       scanner.close();   

   }

}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Trying to figure out how to calculate the inches, feet was easy, divide by 12.


2. What will you always remember (never forget) from this exercise?
The modulus operator rocks!!!!



*/