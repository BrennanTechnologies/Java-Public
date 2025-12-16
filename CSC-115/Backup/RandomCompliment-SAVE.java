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
    static Scanner sc = new Scanner(System.in);         // Open a Class Wide Scanner
    
    // Main method
    public static void main(String[] args) {
        int seed = getRandomSeed();
        int number = getNumberofCompliments();
        getRandomCompliment(seed, number);

        sc.close(); //  Close the Scanner
    }

    //  Method: getRandomSeed
    static int getRandomSeed() {
        // Prompt the user for a seed
        System.out.println("RANDOM SEED:");
        int seed = sc.nextInt();
        //sc.nextLine(); // Clear the buffer

        //return seed;
        return seed;
    }

    //  Method: getNumberofCompliments
    static int getNumberofCompliments() {
        
        // Prompt the user to enter a number
        System.out.println("\nWelcome to Random Complimentor\n");

        System.out.println("How many compliments would you like? ('0' to quit)");
        int number = sc.nextInt();
        //sc.nextInt();   // clear the buffer

        // return the number of compliments
        return number;
    }

    // Method: getRandomCompliment
    static void getRandomCompliment(int seed, int number) {

        // Create a random object
        Random r = new Random(seed);
        int quit = -1;
        while (quit != 0 ) {

            // Print out the compliments
            for (int i = 0; i < number; i++) {

                // Get some random compliments
                int compliment = r.nextInt(seed);

                // Print out the compliments
                switch (compliment) {
                    case 0:
                        System.out.println("You are soooooo good looking.");
                        break;
                    case 1:
                        System.out.println("You're pretty awesome.");
                        break;
                    case 2: 
                        System.out.println("You have a wonderful smile.");
                        break;
                }
            }
        }
    }
}

