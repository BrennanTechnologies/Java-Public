/**
 * Description
 * Demonstrate For Loop

 * @author Chris Brennan
 * @since 11-7-21
 */

 import java.util.Scanner;

 public class ForLoop03 {
    // Istantiate the Scanner
    static Scanner sc = new Scanner(System.in);  

    // Define the main Method
    public static void main(String[] args) {
        int startNum = getStartNum();   // get the start number
        int endNum = getEndNum();       // get the end number
        forLoop(startNum, endNum);      // Call the forLoop Method
        sc.close();                     // Close the Scanner
    }

    // define the getStartNum Method
    public static int getStartNum() {
        System.out.println("Enter a number to start: "); // Prompt the user for a starting point
        int startNum = sc.nextInt();    // Get the start number
        return startNum;                // return the start number
    }

    // define the getEndNum Method
    public static int getEndNum() {
        System.out.println("Enter a number to stop: "); // Prompt the user for a starting point
        System.out.println("");
        int endNum = sc.nextInt();      // Get the start number
        return endNum;                  // return the start number
    }

    // Define the ForLoop Method
    public static void forLoop(int startNum, int endNum) {
        // for loop
        for(int i = startNum; i <= endNum; i++) {
            System.out.println(i);      // Prints numbers
        }
    }
}