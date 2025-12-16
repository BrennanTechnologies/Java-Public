/*
 * Description
 * This programs demonstates a while loop.

 * @author Chris Brennan
 * @since 10-31-21
 */

import java.util.Scanner;

public class WhileLoopC {

    // Call the main method
    public static void main(String[] args){

        // Call While Loop  Method
        whileMethod();
    }

    // Perform While Loop Demonstration
    public static void whileMethod() {

        // Instantiate Scanner Object
        Scanner sc = new Scanner(System.in);
        
        // Prompt User for Input and store it in variable.
        System.out.println("Enter starting number: ");
        System.out.println();
        int start = sc.nextInt();

        // Prompt User for Input and store it in variable.
        System.out.println("Enter incrementor: ");
        System.out.println();
        int inc = sc.nextInt();
        
        // Intialize the LCV Counter
        int counter = 0;

        // Perform While Loop
        while ( counter <= 5 ) {
            System.out.println(start);
            start = start + inc;
            counter++;
        }

        // Close the Scanner.
        sc.close();
    }
}