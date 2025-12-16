/**
 * ARRAY: Output Values
            - Create an array (size specified by the user). 
            - Randomly populate it with numbers 1-100
            - Output the original array
 * 
 * @author Chris Brennan
 * @version 11.27.21
 * 
 **
 */

import java.util.Scanner;
import java.util.Random;

public class ArrayOutputValues {
    
    public static void main(String[] args) {

        // instantiate a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // get input from user for a seed for the RNG
        System.out.println("seed:");
        int seed = scanner.nextInt();
        System.out.println();

        // get input from user for the size of the array
        System.out.println("length:");
        int size = scanner.nextInt();
        
        // instantiate a RNG with the seed
        Random random = new Random(seed);

        // instantiate an array of the size specified by the user
        int[] array = new int[size];

        // populate the array with random numbers
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }

        // output the array
        printArray(array);

        // close the scanner
        scanner.close();
    }

    // output the array
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

/**

    seed:
    10

    length:
    10

    14 81 94 91 47 57 98 89 82 15

*/