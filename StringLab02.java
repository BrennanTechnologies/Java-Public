/**
 * Description
 * This programs demonstates different string manipulations.

 * @author Chris Brennan
 * @since 9-1-21
 */

import java.util.Scanner;

public class StringLab02 {

    public static void main (String[] args) {
    	stringMethod();  // do all the String things
    }

    // this method does all the String things
    public static void stringMethod()
    {
        // Instantiate Scanner Object
        Scanner sc = new Scanner(System.in);

        // Prompt User for Input and store it in variable.
        System.out.println("Please enter a phrase:");
        String myPhrase = sc.nextLine();

        // Display the Menu
        System.out.println("");
        System.out.println("1. Find the length of the string");
        System.out.println("2. Perform charAt");
        System.out.println("3. Perform equals");
        System.out.println("4. Perform compareTo");
        System.out.println("5. Perform indexOf");
        System.out.println("6. Perform substring");
        System.out.println("7. Perform toLowerCase");
        System.out.println("8. Perform toUpperCase");

        // Prompt User for Menu Selection.
        System.out.println();
        System.out.println("Please make a selection:");
        System.out.println();
        int menuChoice = sc.nextInt();

        // Menu Choice 1
        if(menuChoice == 1) {
            int phraseLength = myPhrase.length();
            System.out.println("The length of the phrase is " + phraseLength);

        // Menu Choice 2
        } else if (menuChoice == 2) {
            System.out.println("Enter a number between 0 and 13:");
            System.out.println();
            int myNumber = sc.nextInt();
            char charPosition = myPhrase.charAt(myNumber);
            System.out.println("The character at index " + myNumber + " is '" + charPosition + "'");
        
        // Menu Choice 3
        } else if (menuChoice == 3) {
            System.out.println("Enter a phrase that will be compared with \"" + myPhrase+ "\":");
            System.out.println();
            String testString = sc.nextLine();
            if (myPhrase.equals(testString) ) {
                System.out.println("The two phrases DO have the same sequence of characters.");
            } else {
                System.out.println("The two phrases DO NOT have the same sequence of characters.");
            }

        // Menu Choice 4
        } else if (menuChoice == 4) {
            System.out.println("Enter a phrase that will be compared with \"" + myPhrase + "\":");   
            System.out.println();
            sc.nextLine();
            String testString = sc.nextLine();
            if (myPhrase.compareTo(testString) == 0) {
                System.out.println("The two phrases are equivalent.");
            } else if (myPhrase.compareTo(testString) < 0) {
                System.out.println("Alphabetically, \"" + myPhrase + "\" comes before \"" + testString + "\"");
            } else {
                System.out.println("Alphabetically, \"" + myPhrase + "\" comes after \"" + testString + "\"");
            }

        // Menu Choice 5
        } else if (menuChoice == 5) {
            System.out.println("Enter a String to search \"" + myPhrase + "\" for:");
            System.out.println();
            sc.nextLine();
            String testString = sc.nextLine();
            
            int indexResult = myPhrase.indexOf(testString);
            if (indexResult < 0) {
                System.out.println("\"" + testString + "\" is not in the phrase \"" + myPhrase + "\"");
            } else {
                System.out.println("The first occurrence of \"" + testString + "\" is at index " + indexResult);
            }

        // Menu Choice 6
        } else if (menuChoice == 6) {
            System.out.println("Choose one of the methods:");
            System.out.println("1. Create a substring from a selected index until the end");
            System.out.println("2. Create a substring from a selected index until another selected index");
            System.out.println();
            System.out.println("Enter selection:");
            System.out.println();
            sc.nextLine();
            int myChoice = sc.nextInt();
            if (myChoice == 1) {
                System.out.println("Which index (between 0 and 28) would you like to start with?");
                System.out.println();
                int myIndex = sc.nextInt();
                String newPhrase = myPhrase.substring(myIndex);
                System.out.println("The new phrase is: \"" + newPhrase + "\"");
            } else if (myChoice == 2){
                System.out.println("Which index (between 0 and 34) would you like to start with?");
                System.out.println();
                int startIndex = sc.nextInt();
                System.out.println("Which index (between 19 and 34) would you like to end with?");
                System.out.println();
                int endIndex = sc.nextInt();
                String newPhrase = myPhrase.substring(startIndex,endIndex);
                System.out.println("The new phrase is: \"" + newPhrase + "\"");
            } else {
                System.out.println("You did not enter a valid number.");
            }

        // Menu Choice 7
        } else if (menuChoice == 7) {
            System.out.println("All lowercase looks like this: \"" + myPhrase.toLowerCase() + "\"");

        // Menu Choice 8
        } else if (menuChoice == 8) {
            System.out.println("All uppercase looks like this: \"" + myPhrase.toUpperCase() + "\"");

        // Invalid Menu Choice
        } else {
            System.out.println("Not a valid number!");
        }

        // Close the Scanner.
        sc.close();
    }
}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?


2. What will you always remember (never forget) from this exercise?




*/