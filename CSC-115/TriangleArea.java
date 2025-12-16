/**
 * Description
 * This program that uses the height and the base of a triangle to compute the area of the triangle using the formula A = 1/2bh.

 * @author Chris Brennan
 * @since 9/7/21
 */


import java.util.Scanner;

public class TriangleArea {
    public static void main (String[] args) {
        findArea(); // this method gets numbers from the user and outputs the area of the triangle
    }

    // this method gets numbers from the user, calculates the area of the triangle, and outputs it
    public static void findArea() {
    	
    	// Instantiate a Scanner to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for height and store the input in the variable 'height'
        System.out.println("Enter the height:");
        int height = scanner.nextInt();

        // Prompt the user for the base and store the input in the variable 'base'        
        System.out.println("Enter the base:");
        int base = scanner.nextInt();
        
        // ========== INSERT YOUR CODE HERE ==========

        double area = (double) 1/2 * base * height;
        String output = "The area of the triangle is " + area;
        System.out.println(output);
        
        // ===========================================
    }
}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Discovering that Java Uses integration division.

"When dividing two integers, Java uses integer division. In integer division, the result is truncated (fractional part thrown away) and not rounded to the closest integer. ""


2. What will you always remember (never forget) from this exercise?

That Java Uses integration division.


*/