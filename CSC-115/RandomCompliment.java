/** 
 *  Description:
    *  Loop Demostrations:
            - Construct a program that iterates until the user presses 0. 
            - If the number is greater than zero, then the software will dole out that number of compliments.

            Hint: 
            - it is probably easiest to accomplish this by creating a while loop to govern the entire program and a for loop to dole out the compliments. 
            - It is also easier to create a small method first - one that just doles out random compliments (based on the input from the user). 
            - The next step is to wrap that program in a while loop.
    * 
 *  @author Chris Brennan
 *  @version 1.0
 *  @since 11-14-21
 */

import java.util.Scanner;
import java.util.Random;

public class RandomCompliment {

    // Istantiate the Scanner Class Wide
    static Scanner sc = new Scanner(System.in);             // Open a Class Wide Scanner
    
    ///** Main Method *///
    public static void main(String[] args) {

        // Declare and initialize variables
        int numCompliments = -1 ;                            // Set the start state of the while loop

        // Get a seeded random number generator
        long seed = getSeed();                              // Get seed value from user
        
        // Welcome the user
        sayWelcome();                                       // Call the sayWelcome method

        // Create a while loop to run the program
        //--------------------------------------------------
        while (numCompliments != 0 ) {                      // Exit on 0
            numCompliments = getNumCompliments();           // Get the number of compliments from the user
            for (int i = 0; i < numCompliments; i++) {      // Loop through the number of compliments
                sayCompliment(seed);                        // Call the sayCompliment method
            }
        }

        // Say goodbye
        System.out.println("\nHave a great day!");
    }

    /** Get a seeded random number generator */
    public static long getSeed() {
        // get the seed value from the user
        System.out.println("RANDOM SEED:\n");
        long seed = sc.nextLong();

        // return a seeded random number generator
        return seed;
    }

    /** Welcome the user */
    public static void sayWelcome() {

        // Print a welcome message
        System.out.println("Welcome to Random Complimentor");
    }

    /** Get the number of compliments 
     *
     *   @return numCompliments - the number of compliments
     *   @return 0 - Exits if the user enters 0
    */
    public static int getNumCompliments() {

        // Prompt user for number of compliments
        System.out.println("\nHow many compliments would you like? ('0' to quit)");
        return sc.nextInt();
    }

    /** Say a random compliment 
     *
     *   @param seed - the seed value
     *   @return compliment - the compliment
    */
    public static void sayCompliment(long seed) {

        // Get a random number generator
        Random rand = new Random(seed);                     // Create a new Random object with the seed
        int num = rand.nextInt(3);                          // Generate a random number between 0 and 2
        
        // Print a compliment
        switch (num) {
            case 0:
                System.out.println("You are soooooo good looking.");
                break;
            case 1:
                System.out.println("You ... are ... #1.");
                break;
            case 2:
                System.out.println("You're pretty awesome.");
                break;
        }
    }
}