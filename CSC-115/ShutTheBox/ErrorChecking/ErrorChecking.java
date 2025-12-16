/**
 * 
 *  @author     Chris Brennan 
 *                 -<CB>
 *  @version      12/21/21
 *
 */

 /*
3.14
3 apple pies
-54
9d
9
seven
7
1 8
3 8
2 8
2
2 3
5
Roll 2 Dice!
6
2
3
2
1 4
No

 */

import java.util.Scanner;

public class ErrorChecking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // do stuff
        String inputString = getInput(scanner);                                 // get the input from the user
        System.out.println(inputString);                                        // print the input
        System.out.println("Done!");                                            // print the length of the input

    }

    // Method: Prompt User & Close Tiles
    public static String getInput (Scanner scanner) {

        String inputString = "";
        boolean valid = false;
        while (valid == false) {

            // Prompt User for input
            System.out.println( "Which tile(s) should be \"closed\"? " + 
                                    "Separate multiple tiles with a space." 
                                );

            // Get the user input
            inputString = scanner.nextLine();                                   // get the input from the user

            String[] inputArray = inputString.split(" ");                       // split the input into an array

            for(int i = 0; i < inputArray.length; i++) {                        // loop through the array

                String element = inputArray[i];                                 // get the element inputArray[i]  // i.e "1"

                if(element.length() == 1){                                      // check for single character
                    char firstChar = element.charAt(0);                         // convert the String element to a char
                    if(Character.isDigit(firstChar)){                           // if (isDigit == true)
                        valid = true;
                    } else {                                                    // else { isDigit == false }
                        valid = false;
                        break;  // isDigit == false                             // Invalid Character: Not a Single Digit
                        ////////////////////////////////
                    }
                } else {
                    valid = false;
                    System.out.println("Error! The entry \"" + element + 
                                            "\" is not a single-digit!");
                    break;  // element.length() == 1)                           // Invalid Character: Not a Single Digit
                    ////////////////////////////////
                }
            }
        }
        return inputString;

    }


    
            /* WORKING CODE
            // check if the input is valid
            for(int i = 0; i < inputString.length(); i++) {
                char element = inputString.charAt(i);
                if ( Character.isDigit(element) || Character.isWhitespace(element) ){                           // check isInt or isSpce
                    valid = true;
                } else {
                    valid = false;
                    System.out.println("Error! The entry \"" + element + "\" is not a single-digit!");
                    break;
                }
            }
            */
    
}


