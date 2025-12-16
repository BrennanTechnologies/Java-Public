/**
 * Description
 * Calculate Rewards for contributions.
 *
 * @author Chris Brennan
 * @since 10/9/21
 */

import java.util.Scanner;

public class KickStarter {
    public static void main (String[] args) {
        getRewards();
    }

    public static void getRewards() {
        // Instantiate Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Prompt User for Input and store it in variable.
        System.out.println("Welcome to Kickstarter!");
        System.out.println();
        System.out.println("How much would you like to contribute to the 'Cones of Dunshire' project?");
        int amount = scanner.nextInt();

        // Determine the Reward
        switch (amount) {
            case 150: System.out.println("You will receive the 'Cone of Dunshire' hat.");
            case 100: System.out.println("You will receive the Founders Edition of the "
                        + "tabletop version of 'Cones of Dunshire'.");
            case 50:  System.out.println("You will receive a copy of the tabletop version "
                        + "of 'Cones of Dunshire'.");
            case 20:  System.out.println("You will receive a copy of the mobile app version "
                        + "of 'Cones of Dunshire'.");
            case 5:   System.out.println("You will have your name put on a list of backers on our website.");
            case 1:   System.out.println("You will receive a thank-you email.");
                      break;
            default:  System.out.println("You did not enter a valid amount");
        }
        System.out.println();
        System.out.println("Thanks for backing 'Cones of Dunshire'.");

        // Close the Scanner.
        scanner.close();
    }
}

/*
1. What was the hardest part of this lab?
Needing to know you need to Set the break on the "Falling Through" switch statement

2. What will you always remember (never forget) from this exercise?
You can use switch statements with or without break commands.

*/