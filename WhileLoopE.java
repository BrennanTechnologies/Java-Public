/**
 * Description
 * This programs demonstates a while loop.

 * @author Chris Brennan
 * @since 10-31-21
 */

import java.util.Scanner;

public class WhileLoopE {
    
    // Call the main method
    public static void main(String[] args) {
        
        // Call While Loop Demonstration Method
        whileMethod();
    }

    // Perform While Loop Demonstration
    public static void whileMethod() {

        // Instantiate Scanner Object
        Scanner sc = new Scanner(System.in);

        // Initislize & Set Variables
        String answer = "";

        // Perform While Loop
        while (!answer.equals("NO")) {

            // Prompt User for Input and store it in variable.
            System.out.println("Would you like to play a game?");
            System.out.println();
            answer = sc.nextLine();
            answer = answer.toUpperCase();
        }
        
        // If answer == NO then end.
        System.out.println("Game over.");
        
        // Close the Scanner.
        sc.close();
    }
}