/**
 * 
 showFactorPairs
 
 3. Compute the factor-pairs of a user-defined number.

        Please make a selection:
        3
        Enter a number:
        3
        The factor pairs of 3 are: {1, 3}.


    -<CB>
    12/12/21
 
 */

package test;

import java.util.Arrays;

public class showFactorPairsClass {
    public static void main(String[] args) {
        // positive number
        int number = 3;
        showFactorPairs(number);
    }

    public static void showFactorPairs(int number) {
        // declares an array of integers & allocates memory for "number" of integers
        int[] anArray = new int[number];

        // loop runs from 1 to "number"
        for (int i = 1; i < number; ++i) {

            // if number is divisable by i:
            if (number % i == 0) {              // then i is a factor
                anArray[i] = number;            // add the "number" to the array
            }
        }

        // Print: -->>  "The factor pairs of 3 are: {1, 3}."
        //                  - print each element of an array in one line
        System.out.println("The factor pairs of 3 are: {" + Arrays.toString(anArray).toString() + "}." );

        //System.out.println(Arrays.toString(anArray));

    }
}

