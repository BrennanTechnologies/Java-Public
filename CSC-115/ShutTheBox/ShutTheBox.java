/**
 * 
 *  @author     Chris Brennan 
 *                 -<CB>
 *  @version      12/21/21
 *
 */


import java.util.Scanner;
import java.util.Random;

public class ShutTheBox {
    public static void main(String[] args) {
        // Initialize the game variables.
        int games   =  0;
        int wins    =  0;
        int loses   =  0;
        int points  =  0;
        int score   =  0;
        
        // Istantiate Objects:
        Scanner scanner = new Scanner(System.in);
        Random random   = new Random();

        // Welcome to the 'Shut the Box' Game.
        System.out.println("Welcome to the 'Shut the Box' Game.\n\n");

        //  Outer-Loop - Play Game
        // ------------------------------------------------------
        boolean playGame = true;                                 // Set playGame to "On": On/Off Switch
        while ( playGame == true ) {                             // <OUTER-LOOP>
            // Start a New Game:
            games++;

            // "Begin playing game #1."
            System.out.println("Begin playing game #" + games + ".");

            // Set Seed                                          // random.setSeed(seed);
            setSeed(scanner, random);

            // newBoard: Create the Board array
            boolean[] board = newBoard(9);                       // create the board array

            // Inner-Loop - Start Round
            // --------------------------------------------------
            boolean continuePlaying = true;                      // Set to "On" - On/Off Switch
            while(continuePlaying == true){                      // <INNER-LOOP>
                // showBoard: Display the available tiles
                showBoard(board);                                // The available number(s) are: 1 2 4 5 6 7 9

                // rollDice:   
                int dice = getNumberOfDice(scanner, board);      // Roll the die/dice:  1 or 2 (depending upon status of tiles 7, 8, and 9).
                int sumRoll = rollDice(dice, 6, random);

                // Continue?:
                continuePlaying = true;                          // Comment for Testing
                continuePlaying = ShutTheBox_HelperClass.continuePlaying(board, sumRoll);
                
                // if Continue:
                //-----------------
                if(continuePlaying == true){ 
                    // Prompt User & Close Tiles
                    boolean tilesClosed = false;
                    while(tilesClosed == false){
                        String inputString = getInput(scanner);  
                        tilesClosed = closeTiles(scanner, board, inputString, sumRoll, tilesClosed);
                    }
                    // Update Points
                    points = updatePoints(board);

                    ///------------------------------------------
                    // You Win!
                    ///------------------------------------------
                    boolean isAllClosed = isAllClosed(board);
                    if(isAllClosed == true) {
                        wins++;
                        System.out.println( "Congratulations, you won!" );
                        continuePlaying = false;
                        break;                      // <-- End Inner-Loop // - break out of the inner-loop
                        ////////////////////////////
                    }
                }

                ///----------------------------------------------
                // You Lost!
                ///----------------------------------------------
                else {
                    loses++;
                    System.out.println( "You lost with " + points + " points." );
                    score += points;
                    continuePlaying = false;
                    break;                      // <-- End Inner-Loop // - break out of the inner-loop
                    ////////////////////////////
                }
            }
            // --------------------------------------------------
            // End Inner-Loop - End Round

            // Ask to Play Again?
            // ------------------
            playGame = askPlayAgain(scanner);                    // return playGame; return to the outer-loop
        }
        // ------------------------------------------------------
        //  End Outer-Loop - End Game
        
        // End Game:
        ///--------------------
        // Thank you for playing 
        System.out.println( "Thank you for playing \"Close the Box\"! " +
                                "The total score is " + score + " with " + wins + " win(s) after " + games + " round(s)." 
                            );
        scanner.close();                                         // close the scanner object

    } // End: main (String[] args)


    // ------------------------------------------------------
    //                      Methods:
    // ------------------------------------------------------
    // Method: Enter and Set the seed
    public static void setSeed (Scanner scanner, Random random) {
        int seed = 0;
        boolean validInput = false;
        while ( validInput == false){
            System.out.println("Enter a seed:");
            String input = scanner.nextLine();
            if (input.matches("-?[1-9]\\d*|0")) {
                validInput = true;
                seed = Integer.parseInt(input);  
            } else {
                validInput = false;
                System.out.println( "Error! The entry \"" + input + "\" is not an integer." );
            }
        }
        random.setSeed(seed);
    }

    // Method: Create new board
    public static boolean[] newBoard (int numberOfTiles) {
        // builds the boolean[] tiles array
        boolean[] board = new boolean[numberOfTiles];            // boolean[] tiles
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

    // Method: Check if Game was won!
    public static boolean isAllClosed (boolean[] board) {
        // check if all tiles are closed
        int closedTiles = board.length;
        for (int i = 1; i <= board.length; i++) {
            if (board[i-1] == true) {
                closedTiles--;
            }
        }
        boolean isAllClosed = false;
        if (closedTiles == board.length){
            isAllClosed = true;                                  // if all tiles are closed, end game.
        } else {
            isAllClosed = false;                                 // if not all tiles are closed, continue game.
        }
        return isAllClosed;
    }

    // Method: Get the Number Dice - 1 or2
    static public int getNumberOfDice(Scanner scanner, boolean[] board) {
        // why?
        int dice = 2;

        // chooseDice :                                          // if 7, 8, & 9 are closed
        //-------------
        if  (   board[6] == false 
                    && 
                board[7] == false 
                    && 
                board[8] == false
            ){

            // chooseDice: roll 1 die
            System.out.println( "The player may opt to roll 1 die or 2 dice " +
                                    "because tiles 7, 8, and 9 are \"closed\"."  
                                );

            System.out.println( "Enter \"1\" to roll 1 only die or \"2\" " +
                                    "(or any other key) to roll 2 dice.\n"  
                                );

            String input = scanner.nextLine();
            Scanner in = new Scanner(input);
            while (in.hasNextInt()) {
                dice = in.nextInt();
                if(dice == 1){
                    dice  = 1;
                } else {
                    dice  = 2;
                }
            }
        } 
        else {
        // No Choice: roll 2 dice
            dice  = 2;
        }
        return dice;
    }

    // Method: Roll Dice
    public static int rollDice (int dice, int sides, Random random) {
        int[] roll = new int[dice];
        int sumRoll = 0;
        // roll the dice
        for (int i = 0; i < dice; i++) {
            roll[i] = random.nextInt(sides) + 1;
            sumRoll += roll[i];
        }
        /// display dice the roll(s)
        if(dice == 1) {
            System.out.println( "The die roll is " + roll[0] + "." );
        } else {
            System.out.println( "The dice roll is " + roll[0] + " and " + 
                                    roll[1] + " for a sum of " + sumRoll + "." 
                                );
        }
        return sumRoll;
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
            inputString = scanner.nextLine();                               // get the input from the user
            String[] inputArray = inputString.split(" ");                   // split the input into an array
            for(int i = 0; i < inputArray.length; i++) {                    // loop through the array
                String element = inputArray[i];                             // get the element inputArray[i]  // i.e "1"
                if(element.length() == 1){                                  // check for single character
                    char firstChar = element.charAt(0);                     // convert the String element to a char
                    if(Character.isDigit(firstChar)){                       // if (isDigit == true)
                        valid = true;
                    } else {                                                // else { isDigit == false }
                        valid = false;
                        break;  // isDigit == false                         // Invalid Character: Not a Single Digit
                        ////////////////////////////////
                    }
                } else {
                    valid = false;
                    System.out.println("Error! The entry \"" + element + 
                                            "\" is not a single-digit!");
                    break;  // element.length() == 1)                       // Invalid Character: Not a Single Digit
                    ////////////////////////////////
                }
            }
        }
        return inputString;
    }

    // Method: Prompt User & Close Tiles
    public static boolean closeTiles (Scanner scanner, boolean[] board, String inputString, int sumRoll, boolean tilesClosed) {
        int tile      = 0;
        int inputSum  = 0;
        Scanner in    = new Scanner(inputString);
        String inputs = "";

        // Get inputSum
        while ( in.hasNextInt() ) {
            tile = in.nextInt();
            inputSum += tile;
            inputs += tile + " ";
        }
        // Check if inputSum is equal to sumRoll
        String[] inputArray = inputs.split(" "); 
        if (inputSum == sumRoll) {
            tilesClosed = true;
            for(int i = 0; i < inputArray.length; i++) {
                tile = Integer.parseInt(inputArray[i]);  
                // check if tile is open
                if (board[tile-1] == true) {
                    board[tile-1] = false;                          // close the tile
                } else {
                    tilesClosed = false;
                    System.out.println(
                                        "Error! Not all of the selected tile(s) are available to \"close\"!"
                                    );
                    break;
                }
            }
        }
        else if (inputSum > sumRoll) {                             // exceeds the total die/dice
            tilesClosed = false;
            System.out.println( 
                                "Error! The selected tile(s) (" + inputString + ") that sum to " + inputSum + 
                                    " exceeds the total die/dice roll (" + sumRoll + ")."
                                );
        } 
        else if (inputSum < sumRoll) {                             // less than the total die/dice
            tilesClosed = false;
            System.out.println( 
                                "Error! The selected tile(s) (" + inputString + ") that sum to " + inputSum + 
                                    " does not exhaust the total die/dice roll (" + sumRoll + ")."
                                );
        }
        in.close();
        return tilesClosed;
    }

    // Method: Prompt User & Close Tiles
    public static boolean closeTilesX (Scanner scanner, boolean[] board, String inputString, int sumRoll, boolean tilesClosed) {
        int tile = 0;
        int inputSum = 0;
        Scanner in = new Scanner(inputString);
        while (in.hasNextInt()) {
            tile = in.nextInt();
            inputSum += tile;
            board[tile-1] = false;
        }
        in.close(); // close the scanner
        while (tilesClosed == false) {
            if(inputSum > sumRoll) {
                tilesClosed = false;
                System.out.println( "Error! The selected tile(s) (" + inputString + ") " +
                                        "that sum to " + inputSum + " does not exhaust the " +
                                        "total die/dice roll (" + sumRoll + ")." 
                                    );
                break;
            } else {
                tilesClosed = true;
                break;
            }
        }
        return tilesClosed;
    }

    // Method: updatePoints - Sum Open Tiles
    public static int updatePoints (boolean[] board) {
        int points = 0;
        for (int i = 1; i <= board.length; i++) {
            if (board[i-1] == true) {
                points = points + i;
            }
        }
        return points;
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
        return playGame;
    }
}