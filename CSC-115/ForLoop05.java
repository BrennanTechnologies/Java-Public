/**
 * Description
 * Demonstrate For Loop

 * @author Chris Brennan
 * @since 11-7-21
 */

 import java.util.Scanner;

 public class ForLoop05 {
    // Istantiate the Scanner
    static Scanner sc = new Scanner(System.in);  

    // Define the main Method
    public static void main(String[] args) {
        String phrase = getPhrase();            // Get input from user
        forLoop(phrase);                        // Call the forLoop Method
        sc.close();                             // Close the Scanner
    }

    // Define the getPhrase Method
    public static String getPhrase() {
        System.out.println("phrase: ");         // Prompt the user for input
        System.out.println("");                 // Blank line
        String phrase = sc.nextLine();          // Get the start number
        return phrase;                          // Return the phrase
    }

    // Define the ForLoop Method
    public static void forLoop(String phrase) {
        // Do the for loop
        for (int i = 0; i < phrase.length(); i++) {
            System.out.print(phrase.charAt(i)); // Print the character
            System.out.print(" ");              // print a space
        }
    }
}


