/**
 * Description
 * Guess a number game.

 * @author Chris Brennan
 * @since 11-6-21
 */

import java.util.Scanner;
import java.util.Random;

public class GuessANumber02 {
    // Istantiate the Scanner
    static Scanner sc = new Scanner(System.in);  

    // Call the main Method
    public static void main(String[] args) {
        int randomInt = getRandom();          // Call Generate a random number Method
        sayHello();                           // Call Welcome Message Method
        int guess = getGuess();               // Call Get user Guess input Method
        endGame(randomInt, guess);            // Call End Game Method
        sc.close();                           // Close the Scanner
    }

    // Print Hello Meassage
    public static void sayHello() {
        // Print welcome message & Prompt User for Input
        System.out.println("Welcome!"); 
        System.out.println("Please enter a number between 1 and 100:");
        System.out.println();
    }

    // Generate Random Number
    public static int getRandom() {
        // Prompt User for Input and store it in variable.
        System.out.println("Enter a seed: ");
        System.out.println();
        int seed = sc.nextInt();
        sc.nextLine();  // advance the scanner to the next token

        // Generate Random Number
        Random randomSeeded = new Random(seed);
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

    // Check Guess
    public static void endGame(int randomInt, int guess) {
        // Initialize Guess Counter to 1
        int guessCount = 1; 
        
        // Loop until the user guesses the correct number 
        while (guess != randomInt) { 
            if(guess > randomInt) {
                System.out.println("Too high. Guess again:");
                System.out.println("");
            } else {
                System.out.println("Too low. Guess again:");
                System.out.println("");
            }
            guessCount++;
            guess = sc.nextInt(); // get user input
        }

        // Print the number of guesses that it took the user to guess the correct number.
        if (guess == randomInt) {
            System.out.println("Congratulations. You guessed correctly!");
            System.out.println("You needed " + guessCount + " guesses.");
        }
    }
}
