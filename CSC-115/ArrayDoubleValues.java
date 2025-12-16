/**
	CH09 - LAB - ArrayDoubleValues

	1. Create an array (size specified by the user). 
	2. Randomly populate it with numbers 1-100
	3. Output the original array
	4. Output the array with each value doubled

	seed:
	10

	length:
	10

	14 81 94 91 47 57 98 89 82 15
	28 162 188 182 94 114 196 178 164 30


 */

import java.util.Scanner;
import java.util.Random;

public class ArrayDoubleValues {
	public static void main (String[] args) {
		
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
		
		
		// INSERT YOUR CODE HERE
		
		// STEP 1: Create an array of size 'size'
		int [] arr = new int[size];
		
		// STEP 2: Iterate through the array and insert a random 
		//         number between 1 and 100
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1;
		}
		
		// STEP 3: Display the array
		System.out.println();
		displayArray(arr);
		System.out.println();
		
		// STEP 4: Iterate through the array and double each value
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}

		// Array BEFORE shift: 28 70 88 91 41 74 29 50 85 65 
		// Array AFTER shift:  56 140 176 182 82 148 58 100 170 130 
		
		
		// STEP 5: Display the array again
		System.out.println();
		displayArray(arr);
		System.out.println();
		
	}
	
	public static void displayArray(int[] arr) {
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}