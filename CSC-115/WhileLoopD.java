/**
 * Description
 * This programs demonstates a while loop.

 * @author Chris Brennan
 * @since 10-31-21
 */

import java.util.Scanner;

public class WhileLoopD {

    // Call the main method
    public static void main(String[] args){
        
        // Call While Loop Demonstration Method
        whileMethod();
    }

    // Perform While Loop Demonstration
    public static void whileMethod() {

        // Instantiate Scanner Object
        Scanner sc = new Scanner(System.in);

        // Set variables
        int x = 3;
        int guess = 0;

        // Perform While Loop
        while ( x !=  guess ) {

            // Prompt User for Input and store it in variable.
            System.out.println("Enter a number: ");
            guess = sc.nextInt();
            
            // Test guess
            if (x == guess) {
                System.out.println("You chose " + x + ".");
            }
        }

        // Close the Scanner.
        sc.close();
    }
}