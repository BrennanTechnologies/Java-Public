/**
 * Description
 * Calculate the amount deducted from the total, and print a recipt.

 * @author Chris Brennan
 * @since 9-21-21-
 */
 
import java.util.Scanner;

public class CoinStar {
	public static void main(String[] args) {
		coins(); // the method to read info, calculate, print
	}
	
	// the method to read info, calculate, print
	public static void coins() {
    	// ========== INSERT YOUR CODE HERE ==========
    	Scanner scanner = new Scanner(System.in);
    
    	// Get user input.
    	int totalPennies = scanner.nextInt();
    	System.out.println("How many pennies did you insert?");
    	//System.out.println(totalPennies);
    	
    	// Calculate Total Deposit
    	int dollars = totalPennies/100;
    	int cents = totalPennies % 100;
    	System.out.println("You have deposited $" + dollars + "." + cents);
    
    	// Calulate Processing Fee
    	double processingFee = ((totalPennies * .2)/100);
    	System.out.println("The processing fee is: $" + processingFee);
    
    	// Caluate Earnings
    	double totalEarnings = (totalPennies - totalPennies * .2)/100;
    	System.out.println("You earned $" + totalEarnings);
    	// ===========================================            
	}
}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Calculating the total deposit using the modulus operator.


2. What will you always remember (never forget) from this exercise?
The modulus operator is very useful in cases like this.

*/