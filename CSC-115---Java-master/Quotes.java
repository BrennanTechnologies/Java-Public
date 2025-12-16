/**
 * Description
 *
 * @author Chris Brennan
 * @since 10/9/21
 */
 
import java.util.Scanner;

public class Quotes {
    public static void main (String[] args) {
        quotes(); // asks the user for a number and prints a quote
    }

    // this method asks the user for a number and prints a quote
    public static void quotes() {
        // Instantiate Scanner Object.
        Scanner sc = new Scanner(System.in);

        // Prompt User for Input and store it in variable.
        System.out.println("Enter a number 1-10:");
        int rating = sc.nextInt();

        // Initialize the variable
        String quote = "";

        // Select the Quote
        switch(rating){
            case 1: quote = "I'll be back.";
                    break;
            case 2: quote = "Heres looking at you kid.";
                    break;
            case 3: quote = "I dont give a damn";
                    break;
            case 4: quote = "I think we need a bigger boat";
                    break;
            case 5: quote = "...walk this way...";
                    break;
            case 6: quote = "Fankly my dear...";
                    break;
            case 7: quote = "What time is it anyway?";
                    break;
            case 8: quote = "Is this your car?";
                    break;
            case 9: quote = "This way, no that way";
                    break;
            case 10: quote = "I forget.";
                     break;
            default: quote = "You did not enter a number 1-10.";
        }

        /// Display Output
        System.out.println("QUOTE " + rating + ":");
        System.out.println(quote);
        System.out.println("Thank you for getting cultured.");
        
        // Close the scanner
        sc.close();
    }
}

// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?




2. What will you always remember (never forget) from this exercise?




*/