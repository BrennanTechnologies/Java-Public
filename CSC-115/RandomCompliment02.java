/** 
 *  Description:
    *  Loop Demostrations:
            - This is an extension of Compliment02 - instead of a hardcoded compliment bank, 
                this program will ask the user how many compliments should be in the bank and then prompt them to enter each compliment. T
                hey will be stored in an array.

            - In the next phase of the program, 
                the user will be prompted to enter how many compliments they would like to receive ("0" to quit). 
                Randomly, the software will dole out that many compliments. 

            - The compliment phase goes on until the user decides to quit.

 *  @author Chris Brennan
 *  @version 1.0
 *  @since 11-14-21
 */

import java.util.Scanner;
import java.util.Random;

public class RandomCompliment02 {

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
            for (int i = 0; i <= numCompliments; i++) {     // Loop through the number of compliments
                String compliment = getCompliment();        // Get the compliments from the user
                String [] compliments = {compliment};       // Create an array of compliments
                sayCompliment(seed, compliments);           // Say a random compliment
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
     *      @return numCompliments - the number of compliments
     *      @return 0 - Exits the while loop if the user enters 0
    */
    public static int getNumCompliments() {

        // Prompt user for number of compliments
        System.out.println("\nHow many compliments would you like? ('0' to quit)\n");
        return sc.nextInt();
    }

    /** Enter a compliment */
    public static String getCompliment() {

        // Print a message
        System.out.println("\nPlease enter a compliment:\n");
        String compliment = sc.nextLine();                  // Get the compliment from the user
        return compliment;
    }

    /** Say a random compliment 
     *      @param seed - the seed value
     *      @return compliment - the compliment
    */
    public static void sayCompliment(long seed, int numCompliments, String [] compliments) {

        // Get a random number generator
        Random rand = new Random(seed);                     // Create a new Random object with the seed
        int num = rand.nextInt(numCompliments);             // Generate a random number between 0 and 2
        
        // Print a compliment
        switch (num) {
            case 0:
                System.out.println(compliments[0]);         // Print the first compliment in the Array
                break;
            case 1:
                System.out.println(compliments[1]);         // Print the second compliment in the Array
                break;
            case 2:
                System.out.println(compliments[2]);         // Print the third compliment in the Array
                break;
        }
    }
}