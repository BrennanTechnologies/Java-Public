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

        // STEP 2: Fill the array with random numbers between 0 and size
        for (int i = 0; i < array.length; i++) {
            arr[i] = random.nextInt(size);
        }
        // STEP 2: Iterate through the array and insert a random 
        //         number between 1 and 100
        for (int i = 0; i < array.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        
        // STEP 3: Iterate through the array and print the value
        for (int i = 0; i < array.length; i++) {
            System.out.println(arr[i]);
        }


        // STEP 3: Display the array
        System.out.println();
		displayArray(arr);
		System.out.println();
        
        // STEP 4: Iterate through the array and double each value

        // Array BEFORE shift: 28 70 88 91 41 74 29 50 85 65 
        // Array AFTER shift:  56 140 176 182 82 148 58 100 170 130 
        }
        
        // STEP 5: Display the array again
        
        
    }
    
    public static void displayArray(int[] arr) {
    
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
        
        
        
    
}