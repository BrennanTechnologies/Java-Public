/**
 * Description
 * This program will take the user input in degrees Celsius and convert it to Fahrenheit.

 * @author Chris Brennan
 * @since 9/7/21
 */

import java.util.Scanner;

public class ConvertCF01 {
	
  public static void main (String[] args) {
    
    // All the dirty work happens in the 'convert()' method; let's call it here from the main method!
		convert();
  
  }
  
  public static void convert() {

    // This code will get a number from the user; you do not have to worry about this code yet!

    // Create a Scanner so user input can be read
    Scanner scanner = new Scanner(System.in);

    // Prompt user for a temperature
  	System.out.println("Enter a temperature in Celsius: ");
	
	  // Read in a number and store it in 'celsius'
	  int celsius = scanner.nextInt();
    
    // ========== INSERT YOUR CODE HERE ==========
        
    double fahrenheit = (celsius * 1.8) + 32;
    String output = celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.";
    System.out.println(output);

    // ===========================================    
    
    
  }
  
}
