/**
 * Description
 * This program will calculate a grade.
 *
 * @author Chris Brennan
 * @since 10-8-21
 */

import java.util.Scanner;

public class GradeCat {
    public static void main (String[] args) {
        grade();
    }

    public static void grade() {
        // Instantiate Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Prompt User for Input and store it in variable.
        System.out.println("Enter a grade (0-100):");
        int score = scanner.nextInt();

        // Initialize the Variable
        String grade = "";

        // Determine the Grade
        switch (score) {
            case 100:
            case 99:
            case 98:
            case 97:
            case 96: 
            case 95: 
            case 94: 
            case 93: 
            case 92: 
            case 91: 
            case 90:  grade = "A";
                      break;
            case 89:
            case 88:
            case 87:
            case 86:
            case 85:
            case 84:
            case 83:
            case 82:
            case 81:
            case 80:  grade = "B";
                      break;
            case 79:
            case 78:
            case 77:
            case 76:
            case 75:
            case 74:
            case 73:
            case 72:
            case 71:
            case 70:  grade = "C";
                      break;
            case 69:
            case 68:
            case 67:
            case 66:
            case 65:  grade = "D";
                      break;
            default:  grade = "F";
                      break;
        }
        // Output the Result.
        System.out.println(grade);

        // Close the Scanner.
        scanner.close();
    }
}

// =============== LAB SUMMARY ===============
/*
1. What was the hardest part of this lab?
Switch statemets dont handle ranges very easily.

2. What will you always remember (never forget) from this exercise?
Know when to choose If/Else staments ovr switch statements.
*/

