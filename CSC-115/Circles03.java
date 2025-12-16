/**
 * Description
 * Calculates values of a circlebased on the radius.
 *
 * @author Chris Brennan
 * @since 10-23-21
 */

import java.util.Scanner;
import java.lang.Math;

public class Circles03 {

    public static void main(String[] args) {
        // instantiate a new Scanner
        Scanner sc = new Scanner(System.in);

        // prompt the user for a number
        System.out.println("Radius:");

        // store the input from the user in 'radius'
        double radius = sc.nextDouble();

        // call the method to calculate the circumference
        double circumference = calcCircumference(radius);

        // call the method to calculate the area
        double area = calcArea(radius);

        // call the method to calculate the rounded area
        double roundedArea = calcRoundedArea(radius);

        // display results
        System.out.println("CIRCUMFERENCE = " + circumference);
        System.out.println("AREA = " + area);
        System.out.println("ROUNDED AREA = " + (int)roundedArea);

        // close the scanner
        sc.close();
    }

    // calculate circumference
    public static double calcCircumference(double radius) {
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }

    // calculate area
    public static double calcArea(double radius) {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
    
    // calculate rounded area
    public static double calcRoundedArea(double radius) {
        double area = Math.PI * Math.pow(radius,2);
        double roundedArea = Math.round(area);
        return roundedArea;
    }
}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?
defining the parameters of for method and reurning the values

2. What will you always remember (never forget) from this exercise?
return type must match the variable type.

*/