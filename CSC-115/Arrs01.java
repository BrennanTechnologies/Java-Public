public class Arrs01 {
  public static void main (String[] args) {
    
    
    // START YOUR CODE HERE
    // Declare an array named 'numbers' that has the values of
    // 23, 30, 33, and 88.
    int[] numbers = new int[4];
    numbers[0] = "23";
    numbers[1] = "30";
    numbers[2] = "33";
    numbers[3] = "88";
    
  
    // END YOUR CODE HERE
    
    
    
    // DO NOT MODIFY THE FOLLOWING CODE!
    System.out.println("Average: " + getAverage(numbers));

  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static double getAverage(int[] arr) {int sum = 0;for (int i = 0; i < arr.length; i++)sum += arr[i];return 1.0*sum/arr.length;  }
  
  
  
  
}