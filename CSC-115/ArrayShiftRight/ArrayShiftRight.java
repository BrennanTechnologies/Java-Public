/**
    ARRAY: Shift Right
        - Create an array (size specified by the user). 
        - Randomly populate it with numbers 1-100
        - Output the original array
        - Output the array with all values shifted one spot to the right (the last value wraps to be the first value)
        - Only one array may be used.
    
        Hint:
            - When shifting right, carefully consider which end of the array to start with (left or right) so that all the data isn't overwritten with one value!
            - When shifting right, carefully consider A) the index used to access an element of an array and B) the index used to reassign the element rightward.
            - All but one element can be reassigned within a for-loop; one element must be stored and later reassigned outside the for-loop.
 * 
 * @author Chris Brennan
 * @version 11.27.21
 * 
 **
 */

import java.util.Scanner;
import java.util.Random;

public class ArrayShiftRight {
    public static void main (String[] args) {
        // instantiate a Scanner object
        Scanner scanner = new Scanner(System.in);

        // get input from user for a seed for the RNG
        System.out.println("seed:");
        int seed = scanner.nextInt();
        //int seed = 10;

        // get input from user for the size of the array
        System.out.println("length:");
        int length = scanner.nextInt();
        //int size = 10;

        // instantiate a RNG with the seed
        Random random = new Random(seed);

        // INSERT YOUR CODE HERE

        // STEP 1: Create an array of size 'size'
        int[] array = new int[length];
        
        // STEP 2: Iterate through the array and insert a random 
        //         number between 1 and 100
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // STEP 3: Display the array
        String label = "Original Array: ";
        displayArray(array, label);

        // STEP 4: Iterate through the array and shift each value
        //         one spot to the right, and move the last value
        //         to index 0
        int first = array[0];                           // store the first value
        int last = array[array.length-1];               // store the last values

        for(int i = array.length-1; i > 0; i--) {       // iterate through the array from the end to the beginning
            array[i] = array[i-1];                      // shift each value one spot to the right
        }
        array[0] = last;                                // reassign the last value to index 0 (the first value)

        // STEP 5: Display the array again
        String label2 = "Shifted Array: ";
        displayArray(array, label2);
    }

    // Display the array
    public static void displayArray(int[] arr, String label) {
        //System.out.println(label);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
    seed:
    10

    length:
    10

    14 81 94 91 47 57 98 89 82 15
    15 14 81 94 91 47 57 98 89 82
*/