/** 
 * @Description:
 *      Guess a number game.
 *              ***** with the ALL NEW! * ALL FUN! * "PLAY IT AGAIN" FEATURE!!! *****
 *
 *  @author Chris Brennan
 *  @version 1.0
 *  @since 11-6-21
 */

import java.util.Scanner;
import java.util.Random;

public class GuessANumber03 {
    static boolean debugMode = false;
    
    // Istantiate the Scanner Class Wide
    static Scanner sc = new Scanner(System.in);         // Open a Class Wide Scanner

    /** Define the main Method:
        *  Generate a random number between 1 and 100
        *  Ask the user to guess the number
        *  Compare the user's guess to the random number
        *  If the user's guess is too high, tell them it's too high
        *  If the user's guess is too low, tell them it's too low
        *  If the user's guess is correct, tell them they won
        *  If the user's guess is incorrect, tell them they lost
        *  Ask the user if they want to play again
        *  If they say yes, start the game over
        *  If they say no, exit the game
        *  If they say something else, tell them to try again
    */
    public static void main(String[] args) {
        Random randomSeeded = getRandomSeeded();         // Generate Random Seeded Number
        String playItAgainSam = "yes";                   // Declare the Variable and Set the Value (Just for the fun of it, and because I can)
        playTheGame(randomSeeded, playItAgainSam);       // Call the Method to Play the Game (now with TWO Parameters for twice the parameter fun!)
        sc.close();                                      // Close the Scanner
    }

    /* Print a Hello Meassage for each new game
        * println's the Hello Message
    */
    public static void sayHello() {
        // Print Welcome message & Prompt User for Input
        System.out.println(); 
        System.out.println("Welcome!"); 
        System.out.println("Please enter a number between 1 and 100:");
        System.out.println();
    }

    /* Generate a Seeded Random Object from User Entered Seed Number
        * @param seed
        * @return randomSeeded
    */
    public static Random getRandomSeeded() {
        // Prompt the User for Input and Store it in variable.
        System.out.println("Enter a seed: \n ");
        int seed = sc.nextInt();
        sc.nextLine();                                   // Advance the scanner to the next token - Clear the buffer for the next guy

        // Return the Seed Number.
        Random randomSeeded = new Random(seed);          // Create a new Random object with the seed
        return randomSeeded;
    }
    
    /* Get a Guess from the User
        * @param guess <- from scanner
        * @return guess
    */
    public static int getGuess() {
        // Get User input and store it in variable.
        int guess = sc.nextInt();
        sc.nextLine();                                   // Clear the buffer - Advance the scanner to the next token for the next guy
        
        // return the guess
        return guess;
    }

    /*  Define the Play the Game Method:
        *  Generate a random number between 1 and 100
        *  Ask the user to guess the number
        *  Compare the user's guess to the random number
        *  If the user's guess is too high, tell them it's too high
        *  If the user's guess is too low, tell them it's too low
        *  If the user's guess is correct, tell them they won
        *  If the user's guess is incorrect, tell them they lost
        *  Ask the user if they want to play again
        *  If they say yes, start the game over
        *  If they say no, exit the game
        *  If they say something else, tell them to try again
        * 
        * @param randomSeeded
        * @param playItAgainSam
    */
    public static void playTheGame(Random randomSeeded, String playItAgainSam) {
        // Play the Play Again Loop 
        //  ~ WHILE playItAgainSam == "yes" ~
        while (playItAgainSam.equalsIgnoreCase("yes")) {
            // Call Welcome Message Method for each game
            sayHello();

            // Generate a random Integer from Seeded Random Object
            int randomInt = randomSeeded.nextInt(100) + 1;

            // Get the Guess from User
            int guess = getGuess();                     // Call Get User Guess input Method
            int guessCount = 1;                         // Declare and set the guessCount variable
            
            // Loop until the user guesses the correct number.
            //  ~ WHILE the guess is not correct ~
            while (guess != randomInt) { 
                
                // Being Sneeky!!! Developer Mode
                if ( debugMode == true ) {
                    System.out.println("DEBUG MODE!!!");
                    System.out.println("DEBUG: Guess Count: " + guessCount);
                    System.out.println("DEBUG: randomInt: " + randomInt);
                }

                if(guess > randomInt) {                 // If the guess is greater than the random Number
                    System.out.println("Too high. Guess again:\n");
                } else {                                // If the guess is less than the random Number
                    System.out.println("Too low. Guess again:\n");
                }
                guessCount++;                           // Increment the guessCount variable
                guess = getGuess();                     // Bottom of the While Loop: Call Get user Guess input Method again
            }

            // Print the number of guesses that it took the user to guess the correct number.
            if (guess == randomInt) {                   // Congrats!
                System.out.println("Congratulations. You guessed correctly!");
                if(guessCount == 1){                    // If the guessCount is 1
                    System.out.println("You needed only " + guessCount + " guess.");
                } else {                                // If the guessCount is greater than 1
                    System.out.println("You needed " + guessCount + " guesses.");
                }
                System.out.println("");                  // Print a Followup blank nextLine
            }
            //* Bottom of the Loop - Ask the User if they want to play again.
            System.out.println("Do you want to play again? Answer \"yes\" or \"no\":\n");
            playItAgainSam = sc.nextLine();              // Get the User's Answer
            //* Bottom of the Loop - If the User says "no", exit the game.
        }
        
        // Print the End Game Message
        System.out.println("Game Over!");               // Print the Game Over message
        
        //*** END OF GAME ***//
    }
}
