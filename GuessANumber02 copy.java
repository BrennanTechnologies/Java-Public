/**
 * Description
 * Guess a number game.

 * @author Chris Brennan
 * @since 11-6-21
 */

import java.util.Scanner;
import java.util.Random;

public class GuessANumber02 {
    static Scanner sc = new Scanner(System.in);  // Istantiate the Scanner

    // Call the main Method
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);  // Istantiate the Scanner
        int randomInt = getRandom();          // Generate a random number
        printWelcome();                       // Print the welcome message
        int guess = getGuess();               // Get user Guess input
        endGame(randomInt, guess);            // Call endgame method
        //sc.close();                           // Close the Scanner
    }

    // Generate Random Number
    public static int getRandom() {
        // Instantiate Scanner Object.
        //Scanner sc = new Scanner(System.in);

        // Prompt User for Input and store it in variable.
        System.out.println("Enter a seed: ");
        System.out.println();
        int seed = sc.nextInt();
        sc.nextLine();  // advance the scanner to the next token

        // Generate Random Number
        Random randomSeeded = new Random(seed);
        int randomInt = randomSeeded.nextInt(100) + 1;
        
        // Close the Scanner
        //sc.close();

        // Return the Random Number.
        return randomInt;
    }
    
    // Print welcome message
    public static void printWelcome() {
        System.out.println("Welcome!");     // Print welcome message
        System.out.println("Please enter a number between 1 and 100:"); // Prompt User for Input and store it in variable.
    }

    // Get User Guess
    public static int getGuess() {
        // Instantiate Scanner Object.
        //Scanner sc = new Scanner(System.in);

        // Prompt User for input and store it in variable.
        System.out.println();
        //sc.nextInt(); // advance the scanner to the next token
        int guess = sc.nextInt();

        // Close the Scanner
        //sc.close();

        // Return the Guess.
        return guess;
    }

    // End Game
    public static void endGame(int randomInt, int guess) {
        // Initialize guess count
        int guessCount = 1;  
        
        // Loop until the user guesses the correct number 
        while (guess != randomInt) {
            if(guess > randomInt) {
                System.out.println("Too high. Guess again:");
            } else {
                System.out.println("Too low. Guess again:");
            }
            guess = getGuess();
            guessCount++;
        }

        // Print the number of guesses that it took the user to guess the correct number.
        if (guess == randomInt) {
            System.out.println("Congratulations. You guessed correctly!");
            System.out.println("You needed " + guessCount + " guesses.");
        }
    }
}
