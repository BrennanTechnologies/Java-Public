/** 
 *  Description:
 *  Loop Demostrations:
        STEP 1: - Run a for loop that iterates with given numbers
                - Prompt the user for the initial number, prompt the user for the ending number, and then prompt the user for an incrementor. 
                - The loop should output (one number per line) the terms between the initial number and the ending number, increasing by the incrementor. 
                - Note: that the ending number may not be displayed, depending on the pattern of numbers.
 
        STEP 2: - Run a while loop that iterates until the user stops it
                - During each loop iteration, the software should output a random number between 1 and 50. Immediately after this number is displayed, 
                  the software should ask if the user wants another random number. If so, another number is output (otherwise, the loop stops iterating). 
                - Before the loop begins, ask the user for a seed for the random number generator. Use an instance of the Random class (java.util.Random) to generate the random numbers.
 
        STEP 3: - Use a do-while loop to get numbers and compute the average
                - The software will ask the user to input numbers until they choose to quit (by entering a 0). 
                - The software will then display the average of the entered numbers.
 * 
 *  @author Chris Brennan
 *  @version 1.0
 *  @since 11-14-21
 */

import java.util.Scanner;
import java.util.Random;

public class AllTheLoops {
    // Istantiate the Scanner Class Wide
    static Scanner sc = new Scanner(System.in);         // Open a Class Wide Scanner

    public static void main(String[] args) {
        // STEP 1
        forLoop();

        // STEP 2
        whileLoop();

        // STEP 3
        doWhileLoop();

        sc.close();                                    // Close the Scanner
    }
    
    // STEP 1
    static void forLoop() {
        System.out.println("STEP 1: Run a for loop that iterates with given numbers");

        // Prompt User for Values
        System.out.println("Please enter a starting point for your for loop:");
        int initialNumber = sc.nextInt();
        System.out.println("Please enter an ending point for your for loop:");
        int endingNumber = sc.nextInt();
        System.out.println("What value would you like the for loop to go up by?");
        int incrementor = sc.nextInt();

        // Print out the for loop
        System.out.println("\nYour numbers:");
        for (int i = initialNumber; i <= endingNumber; i += incrementor) {
            System.out.println(i);
        }
    }

    // STEP 2
    static void whileLoop() {
        System.out.println("\n\nSTEP 2: Run a while loop that iterates until the user stops it");
        
        // Prompt User for Seed
        System.out.println("Please enter a seed for the random number generator:\n");
        int seed = sc.nextInt();
        
        // Generate Random Number
        Random rand = new Random(seed);

        // Prompt User for Loop
        while (true) {

            // Generate Random Number
            int randomNumber = rand.nextInt(50) + 1;

            // Print Random Number
            System.out.println("Here's your random number: " + randomNumber);

            // Prompt User for Another Random Number
            System.out.println("Would you like another random number? Enter 'stop' to stop.");
            String answer = sc.next();
            if (answer.equals("stop")) {
                break;
            }
        }
    }

    // STEP 3
    static void doWhileLoop() {
        System.out.println("\n\nSTEP 3: Use a do-while loop to get numbers and compute the average");
        int sum = 0;
        int counter = 0;

        // Prompt User for Loop
        System.out.println("Enter a number (0 to stop and print average)");
        int number = sc.nextInt();
        
        // Loop until user enters 0
        do {
            sum += number;
            System.out.println("Enter a number (0 to stop and print average)");
            number = sc.nextInt();
            counter++;
        } while (number != 0);

        // calculate average
        double average = (double) sum / counter;

        // Print Average
        System.out.println("The average of your numbers is: " + average);
    }
}