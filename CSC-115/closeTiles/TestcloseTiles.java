import java.util.Scanner;

public class TestcloseTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // newBoard: Create the Board array
        boolean[] board = newBoard(9);                                          // create the board array

        boolean play = true;
        while (play == true) {

            // Show the board
            showBoard(board);                                                       // show the board
            
            // Prompt User & Close Tiles
            //String inputString = 
            getInput(scanner);                                                     // get the input from the user
            
            //System.out.println("inputString: " + inputString);

            //closeTiles(scanner, board, inputString);

            //play = askPlayAgain(scanner);                                          // ask if user wants to play again

        }
    }
/*
        String inputString = "1 2 3";
        //String inputString = "1";

        // isInt
        for(int i = 0; i <= inputString.length(); i++) {                               // Loop through araay String
            if ( i < inputString.length() ){                                          // if not last char

                // Check for Int:
                boolean isInt = false;
                for(int j = 48; j <= 57; j++) {                                          // for each Integer range  / Check Integer Ranger: 48-57
                    if( (inputString.charAt(i) == (char)(j) ) ) {
                        isInt = true;
                        break;
                    }
                }
                System.out.println( i + " isInt : " + isInt);
                //return isInt;

                // Check for Space:
                boolean isSpace = false;
                if (inputString.charAt(i) == ' ') {
                    isSpace = true;
                }
                System.out.println( i + " isSpace : " + isSpace);
                //return isSpace;
            }
        }
    }
*/

    // Method: Create new board
    public static boolean[] newBoard (int numberOfTiles) {
        // builds the boolean[] tiles array
        boolean[] board = new boolean[numberOfTiles];               // boolean[] tiles

        // set all tiles to true
        for(int i = 0; i < board.length; i++){
            board[i] = true;
        }
        return board;
    }

    // Method: Show the Board Tiles
    public static void showBoard (boolean[] board) {

        // "The available number(s) are: 1 2 3 4 5 6 7 8 9 "
        System.out.print("\nThe available number(s) are: ");
        for (int i = 1; i <= board.length; i++) {
            // display the available tiles
            if (board[i-1] == true) {
                System.out.print(i + " ");
            } 
        }
        System.out.print("\n\n");

        return ;
    }

    // Method: Prompt User & Close Tiles
    public static boolean getInput (Scanner scanner) {
        // Prompt User for input
        System.out.println("Which tile(s) should be \"closed\"? Separate multiple tiles with a space.");

        // Get the user input
        String inputString = scanner.nextLine();

        // Check Elements:
        //----------------------
        boolean isValid = true;
        for(int i = 0; i < inputString.length(); i++) {
            char element = inputString.charAt(i);
            if ( Character.isDigit(element) || Character.isWhitespace(element) ){
                isValid = true;
            } else {
                isValid = false;
                System.out.println("Error! The entry \"" + element + "\" is not a single-digit!");
                break;
            }
        }
        return isValid;
    }
    
    // Method: Close Tiles
    public static void closeTiles (Scanner scanner, boolean[] board, String inputString) {
        // close the tiles
        int tile = 0;
        Scanner in = new Scanner(inputString);
        while (in.hasNextInt()) {                   /// NEED Error Checking!!!!!!!! i.e "17 nor 1 7
            tile = in.nextInt();
            board[tile-1] = false;
        }
        in.close(); // close the scanner
    }


    // Method: Ask Play Again
    public static boolean askPlayAgain(Scanner scanner) {
        String prompt = "\nDo you wish to play again? Enter \"No\" " +
            "to play again or anything else to quit.";
        System.out.println(prompt);
        boolean playGame = false;
        String askPlayAgain = scanner.nextLine();
        if (askPlayAgain.toUpperCase().equals("NO")) {
            playGame = false;
        } else {
            playGame = true;
        }
//        System.out.println("testing: playAgain: " + playAgain);                          // testing
        return playGame;
    }
}
