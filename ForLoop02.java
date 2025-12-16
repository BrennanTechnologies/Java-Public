/**
 * Description
 * Demonstrate For Loop

 * @author Chris Brennan
 * @since 11-7-21
 */

 import java.util.Scanner;

 public class ForLoop02 {
    // Istantiate the Scanner
    static Scanner sc = new Scanner(System.in);  

    // Define the main Method
    public static void main(String[] args) {
        int startNum = getStartNum();   //get the start number
        forLoop(startNum);              // Call the forLoop Method
        sc.close();                     // Close the Scanner
    }

    // define the getStartNum Method
    public static int getStartNum() {
        System.out.println("Enter a starting point: "); // Prompt the user for a starting point
        System.out.println();
        int startNum = sc.nextInt();    // Get the start number
        return startNum;                // return the start number
    }

    // Define the ForLoop Method
    public static void forLoop(int startNum) {
        // for loop
        for(int i = 0; i < 5; i++) {
            System.out.println(startNum + i); // Prints numbers
        }
    }
}