/**
 * Description
 * Guess a number game.

 * @author Chris Brennan
 * @since 11-6-21
 */

import java.util.Scanner;
import java.util.Random;

public class GuessANumber03 {
    // Istantiate the Scanner
    static Scanner sc = new Scanner(System.in);  

    // Call the main Method
    public static void main(String[] args) {
        Random randomSeeded = getRandomSeeded();            // Get a random seeded number
        playGame(randomSeeded);                             // Call the playGame Method
        sc.close();                                         // Close the Scanner
    }

    // Print Hello Meassage
    public static void sayHello() {
        // Print welcome message & Prompt User for Input
        System.out.println(""); 
        System.out.println("Welcome!"); 
        System.out.println("Please enter a number between 1 and 100:");
        System.out.println();
    }

    // Generate Random Number
    public static Random getRandomSeeded() {
        // Prompt User for Input and store it in variable.
        System.out.println("Enter a seed: ");
        System.out.println("");
        int seed = sc.nextInt();
        sc.nextLine();                                   // Advance the scanner to the next token

        // Return the Seed Number.
        Random randomSeeded = new Random(seed);          // Create a new Random object with the seed
        return randomSeeded;
    }

    // Generate Random Number
    public static int getRandom(Random randomSeeded) {
        // Generate Random Number
        int randomInt = randomSeeded.nextInt(100) + 1;

        // Return the Random Number.
        return randomInt;
    }

    // Get User Guess
    public static int getGuess() {
        // Get User input and store it in variable.
        int guess = sc.nextInt();
        
        // return the guess
        return guess;
    }

    // Defind the Play the Game Method
    public static void playGame(Random randomSeeded) {
        String playAgain = "yes";                       // Declare the playAgain String

        // Play Again Loop
        while (playAgain.equalsIgnoreCase("yes")) {
            // Generate a random number
            int randomInt = randomSeeded.nextInt(100) + 1;

            // Play the Game
            sayHello();                                 // Call Welcome Message Method
            int guess = getGuess();                     // Call Get User Guess input Method

            // Loop until the user guesses the correct number 
            int guessCount = 1;                         // Declare the guessCount variable
            while (guess != randomInt) { 
                if(guess > randomInt) {
                    System.out.println("Too high. Guess again:");
                    System.out.println("");
                } else {
                    System.out.println("Too low. Guess again:");
                    System.out.println("");
                }
                guessCount++;
                guess = getGuess();                     // Call Get user Guess input Method
            }

            // Print the number of guesses that it took the user to guess the correct number.
            if (guess == randomInt) {
                System.out.println("Congratulations. You guessed correctly!");
                if(guessCount == 1){
                    System.out.println("You needed only " + guessCount + " guess.");
                } else if (guess > 1) {
                    System.out.println("You needed " + guessCount + " guesses.");
                }
                System.out.println("");
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? Answer \"yes\" or \"no\":");
            System.out.println("");
            sc.nextLine();                              // Clear the buffer
            playAgain = sc.nextLine();
        }
        
        // Print the End Game Message
        System.out.println("Game Over!");               // Print the Game Over message
    }
}
