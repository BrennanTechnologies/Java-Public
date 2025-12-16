/**	 
 * Reverse an array of integers in place.
 * 
 * Chris Brennan
 * 11/27/21
 * 
*/

import java.util.Scanner;
import java.util.Random;

public class ArrayBackwards {
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
		int[] arr = new int[size];									// array size - i.e. 'size' = 10
		
		// STEP 2: Iterate through the array and insert a random 
		//         number between 1 and 100
		for (int i = 0; i < arr.length; i++) {						// Generate the array: "Array Generator"
			arr[i] = random.nextInt(100) + 1;
		}
		
		// STEP 3: Display the array - using the displayArray Method
		///-----------------------------------------------------
		displayArray(arr);
		System.out.println();										// create a line break
		
		// STEP 4: Display the array backwards: "Array Backwards"
		// 			a. reverse the array
		// 			b. print the array again

		// Now Reverse the Array: "Re-Build the New Array"
		// ------------------------------
		int[] bArr = new int[size];									// create a new array
		for (int i = arr.length - 1; i >= 0; i--) { 				// Start at the end of the 'original' array and work backwards

			//-----------------------	
			// ** The BackZinator **
			//-----------------------
			// Copy the value from the 'original' array 'backwards' into the 'new' array
			// 		- i.e. 	bArr[i] = arr[i]
			bArr[(arr.length-1)-i] += arr[i];						// add the value to arr 'backwards' to the new array
		}
		
		// STEP 3 (Again): Display the array - using the displayArray Method
		///-----------------------------------------------------
		displayArray(bArr);
		System.out.println();										// create a line break
	}

	// Method: display the array 
	///--------------------------------
	public static void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/**	
	Seed 	= 10
	length 	= 10
	--------------------------------
	Array BEFORE shift	: 14 81 94 91 47 57 98 89 82 15
	Array AFTER shift	: 15 82 89 98 57 47 91 94 81 14

seed:

length:
14 81 94 91 47 57 98 89 82 15 
15 82 89 98 57 47 91 94 81 14 
*/

