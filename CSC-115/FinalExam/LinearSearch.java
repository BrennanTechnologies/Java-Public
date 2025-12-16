import java.util.Scanner;
import java.util.Random;

public class LinearSearch {
  public static void main (String[] args) {
    
    // Declare an instance of SCANNER, get 'seed' from user, and get 'target' from user
    Scanner scanner = new Scanner(System.in);
    int seed = scanner.nextInt();
    int target = scanner.nextInt();    
    
    // Create an instance of RANDOM
    Random random = new Random(seed);
    
    // Create an array of ints that is 20 elements long
    int[] arr = new int[20];
    
    // Populate array with ints valued 1-1000
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(1000) + 1;
    }


    // INSERT YOUR CODE HERE
    // Output -1 if 'target' is not in the array
    // Output the index number of 'target' in 'arr'
    // The output should be nothing more than one number!
    // Hint: Use the 'indexOf' method
    int index = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        index = i;
      }
    }
    System.out.println(index);

    

    
  }
}