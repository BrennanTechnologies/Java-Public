/**
 * Description
 * Calulate the user's income bracket.
 *
 * @author Chris Brennan
 * @since 10-23-21
 */

import java.util.Scanner;
import java.lang.Math;

public class Taxes{
    public static void main(String[] args){

        // instantiate a new Scanner
        Scanner sc = new Scanner(System.in);

        // prompt the user for income
        System.out.println("Enter your yearly income:");
        System.out.println();

        // store the input from the user income
        double income = sc.nextDouble();

        // close the scanner
        sc.close();

        // calculate & display the tax bracket
        String bracket = getBracket(income);
        System.out.println(bracket);

        // calculate & display the taxes
        double taxes = calculateTaxes(income);
        System.out.println("You owe $" + taxes + " in Federal taxes.");

        // close the scanner
        sc.close();
    }

    // calculate the tax bracket
    public static String getBracket(double income) {
        String bracket = "";
        if(income < 50000){
            bracket = "Income Bracket 1";
        }
        else if(income >= 50000 && income < 100000){
            bracket = "Income Bracket 2";
        }
        else if(income >= 100000){
            bracket = "Income Bracket 3";
        }
        return bracket;
    }

    // calculate the taxes
    public static double calculateTaxes(double income) {
        double taxes = (income * .15) * 100;
        taxes = Math.round(taxes) / 100.0;
        return taxes;
    }
}


// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?


2. What will you always remember (never forget) from this exercise?


*/
