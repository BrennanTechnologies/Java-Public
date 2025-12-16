/**
 * Description
 * Using the built-in Math.PI constant, find the circumference and area of a circle with a radius that is provided by the user. Also provide the rounded approximation of the area (to the nearest integer). Note: this is NOT truncating.
 *
 * @author Chris Brennan
 * @since 9-18-21
 */
 
import java.util.Scanner;

public class Circles02 {

	public static void main(String[] args) {
		circleMath(); // get input, compute, output
	}
	
	// this method asks for a radius, calculates the circumference and area,
	// and prints
	public static void circleMath() {
		
		// instantiate a new Scanner
		Scanner sc = new Scanner(System.in);
		
		// prompt the user for a number
		System.out.println("Radius:");
		
		// store the input from the user in 'radius'
		double radius = sc.nextDouble();
		
		// ========== INSERT YOUR CODE HERE ==========

		double PI = Math.PI;

		double circumference = 2 * PI * radius;
		double area = PI * Math.pow(radius,2);
		double roundedArea = Math.round(area);

		System.out.println("CIRCUMFERENCE = " + circumference);
		System.out.println("AREA = " + area);
		System.out.println("ROUNDED AREA = " + (int)roundedArea);

		// ===========================================        

		// close the scanner
		sc.close();
		
	}

}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
Geeting the Math methods to work proerly.

2. What will you always remember (never forget) from this exercise?
Learning the different methods of the Math class.

*/