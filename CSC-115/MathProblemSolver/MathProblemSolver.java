
/*
    Math Problem Solver

    This is a menu driven program that leverages different methods. The choices are:

    1.  Decide if the three numbers given by the user are a Pythagorean Triplet.
        isPythagoreanTriplet(int, int, int)
    
    2.  Decide if a number given by the user is a prime number.
        isPrimeNumber(int)
    
    3.  Display the factor-pairs of a number provided by the user.
        showFactors(int)
    
    4.  Display the greatest common factor (GCF) of two numbers provided by the user.
        greatestCommonFactor(int, int)
    
    5.  Display the proper-divisors of a number provided by the user.
        properDivisor(int)
            - Observe that proper divisors exclude the 'host number'; for example, the proper divisors of 6 are {1, 2, 3}.
            - Observe that proper divisors do not repeat divisors in a perfect square; proper divisors are not factor-pairs. For example, the proper divisors of 25 are {1, 5}.
    
    6.  Decide if a number entered by the user is a Perfect Number, Abundant Number, or Deficient Number.
        isPerfectNumber(int)
    
    7.  Decide if two numbers entered by the user are Amicable Numbers.
        areAmicable(int, int)
    
    8. Display the prime factors of a number entered by the user.
        primeFactors(int)
    
    9.  Display the least common multiple (LCM) of two numbers using the prime factors entered by the user
        leastCommonMultiple(int, int)
        
            - Observe that credit will not be awarded unless prime factors are used to compute the least common multiple (LCM).
            The following resources demonstrate the process of calculating the: Video #1, Video #2. Webpage #1, and Webpage #2.
    
        Notes:

            File name: MathProblemSolver.java
            The code to complete each task should be in a separate method that is called by the main method. 
                At least 9 methods must be used to complete the program. Loops must be used when appropriate.
            Methods should call other methods. Do not repeat code unnecessarily; credit will be deducted for repeating code! 
                For example, the "greatestCommonFactor()" method should call the "showFactors()" method.
            Pay particular attention to the formatting - the output on the screen should look identical to the output in the sample output.
            
            - Some functionality is dependent upon other functionality. 
                For example, the "greatest common factor (GCF)" functionality cannot be completed until the "factor-pairs" functionality is completed.
            
            Arrays may be used; however, arrays are not necessarily required.
            
            According to the rubric, 10% of the grade is assessed for "Manual Grade". 
                This will be specifically applied to the construction and use of methods and formatting.
                Credit will not be awarded for any part of this assignment completed using techniques/constructs not presented in this course.
            
                Reference Material:

                    The Relevant API (in particular, the Scanner and Random sections)
                    The actual Java API for Random

                    The actual Java API for Scanner

                    An introductory video
                    Sample Output:

    Example #1: Pythagorean Triplet Checker:

    ===================
    Math Problem Solver
    ===================

    Select one of the options:
    0. Quit
    1. Determine if 3 user-defined numbers are a Pythagorean triplet?
    2. Determine if a user-defined number a prime number?
    3. Compute the factor-pairs of a user-defined number.
    4. Determine the greatest common factor of 2 user-defined numbers.
    5. Compute the proper divisors of a user-defined number.
    6. Determine whether a user-defined number is a perfect number, abundant number, or deficient number?
    7. Determine if 2 user-defined numbers are amicable numbers?
    8. Compute the prime factors of a user-defined number.
    9. Determine the least common multiple of 2 user-defined numbers.

    Please make a selection:
    1
    Enter the first number:
    4
    Enter the second number:
    3
    Enter the third number:
    5
    The numbers 4, 3, and 5 do form a Pythagorean Triplet.




    @author     -<CB>
    @version    12/12/21

*/

import java.util.Scanner;
import java.util.Arrays;

public class MathProblemSolver                              // create a static transform with static internal state
{
  public static void main(String [] args) {
    // Istantaion of the Scanner object
    Scanner scanner = new Scanner(System.in);

    // initialize selection to -1
    int selection = -1;
    
    // Display the menu
    System.out.println("===================");
    System.out.println("Math Problem Solver");
    System.out.println("===================");

    while (selection != 0) {
        // Display the Menu
        displayMenu();

        // Prompt the user to make a selection
        String prompt = "";
        prompt = "\nPlease make a selection:";
        selection = getNumber(scanner, prompt);

      switch (selection) {
        case 1:
          // Determine if 3 user-defined numbers are a Pythagorean triplet?
          prompt = "Enter the first number:";
          int a = getNumber(scanner, prompt);
          prompt = "Enter the second number:";
          int b = getNumber(scanner, prompt);
          prompt = "Enter the third number:";
          int c = getNumber(scanner, prompt);
          isPythagoreanTriplet(a, b, c);
          break;
        case 2:
          // Determine if a user-defined number a prime number?
          prompt = "Enter a number:";
          int n = getNumber(scanner, prompt);
          isPrimeNumber(n);
          break;
        case 3:
          // Compute the factor-pairs of a user-defined number.
          prompt = "Enter a number:";
          n = getNumber(scanner, prompt);
          String strFactors3 = getFactorPairs(n);
          System.out.println("The factor pairs of " + n + " are: {" + strFactors3 + "}.");
          break;
        case 4:
          // Determine the greatest common factor of 2 user-defined numbers.
          prompt = "Enter the first number:";
          int x = getNumber(scanner, prompt);
          prompt = "Enter the second number:";
          int y = getNumber(scanner, prompt);
          greatestCommonFactor(x, y);
          break;
        case 5:
          // Compute the proper divisors of a user-defined number.
          prompt = "Enter a number:";
          n = getNumber(scanner, prompt);
          String strFactors5 = properDivisors(n);
          System.out.println("The proper divisors of " + n + " are: {" + strFactors5 + "}.");
          break;
        case 6:
          // Determine whether a user-defined number is a perfect number, abundant number, or deficient number?
          prompt = "Enter a number:";
          n = getNumber(scanner, prompt);
          isPerfectNumber(n);
          break;
        case 7:
            // Determine if 2 user-defined numbers are amicable numbers?
            prompt = "Enter the first number:";
            x = getNumber(scanner, prompt);
            prompt = "Enter the second number:";
            y = getNumber(scanner, prompt);
            isAmicableNumber(x, y);
            break;
        case 8:
            // Compute the prime factors of a user-defined number.
            prompt = "Enter a number:";
            n = getNumber(scanner, prompt);
            String primeFactors = primeFactors(n);
            System.out.println("The prime factors of " + n + " are: {" + primeFactors + "}.");
            break;
        case 9:
            // Determine the least common multiple of 2 user-defined numbers.
            prompt = "Enter the first number:";
            x = getNumber(scanner, prompt);
            prompt = "Enter the second number:";
            y = getNumber(scanner, prompt);
            leastCommonMultiple(x, y);
            break;
    }
    
    
    // Determines if the user wants to quit
    if(selection == 0) {
        // Display the Goodbye Message
        System.out.println("Thank you for using the Math Problem Solver program.");
        
        // Close the Scanner
        scanner.close();
    }


    }
/*
    // 1. Determine if 3 user-defined numbers are a Pythagorean triplet?
    if (selection == 1) {
        // Enter the First Number
        prompt = "Enter the first number:";
        int firstNumber = getNumber(scanner, prompt);

        // Enter the Second Number
        prompt = "Enter the second number:";
        int secondNumber = getNumber(scanner, prompt);

        // Enter the Third Number
        prompt = "Enter the third number:";
        int thirdNumber = getNumber(scanner, prompt);

        // Determine if the numbers are a Pythagorean Triplet
        isPythagoreanTriplet(firstNumber, secondNumber, thirdNumber);
    }

    // 2. Determine if a user-defined number is a prime number?
    if (selection == 2) {
        // Enter the Number
        prompt = "Enter the number:";
        int number = getNumber(scanner, prompt);

        // Determine if the number is a prime number
        isPrimeNumber(number);
    }

    // 3. Compute the factor-pairs of a user-defined number.
    if (selection == 3) {
        // Enter the Number
        prompt = "Enter the number:";
        int number = getNumber(scanner, prompt);

        // Compute the factor-pairs of the number
        getFactorPairs(number);
    }

    // 4. Determine the greatest common factor of 2 user-defined numbers.
    if (selection == 4) {
        // Enter the First Number
        prompt = "Enter the first number:";
        int firstNumber = getNumber(scanner, prompt);

        // Enter the Second Number
        prompt = "Enter the second number:";
        int secondNumber = getNumber(scanner, prompt);

        // Determine the greatest common factor of the numbers
        greatestCommonFactor(firstNumber, secondNumber);
    }
    
    // 5. Compute the proper divisors of a user-defined number.
    if (selection == 5) {
        // Enter the Number
        prompt = "Enter the number:";
        int number = getNumber(scanner, prompt);

        // Compute the proper divisors of the number
        properDivisor(number);
    }

    // 6. Determine whether a user-defined number is a perfect number, abundant number, or deficient number?
    if (selection == 6) {
        // Enter the Number
        prompt = "Enter the number:";
        int number = getNumber(scanner, prompt);

        // Determine whether the number is a perfect number, abundant number, or deficient number
        isPerfectNumber(number);

    }

    // 7. Determine if 2 user-defined numbers are amicable numbers?
    if (selection == 7) {
        // Enter the First Number
        prompt = "Enter the first number:";
        int firstNumber = getNumber(scanner, prompt);

        // Enter the Second Number
        prompt = "Enter the second number:";
        int secondNumber = getNumber(scanner, prompt);

        // Determine if the numbers are amicable numbers
        isAmicableNumber(firstNumber, secondNumber);
    }

    // 8. Compute the prime factors of a user-defined number.
    if (selection == 8) {
        // Enter the Number
        prompt = "Enter the number:";
        int number = getNumber(scanner, prompt);

        // Compute the prime factors of the number
        primeFactors(number);
    }

    // 9. Determine the least common multiple of 2 user-defined numbers.
    if (selection == 9) {
        // Enter the First Number
        prompt = "Enter the first number:";
        int firstNumber = getNumber(scanner, prompt);

        // Enter the Second Number
        prompt = "Enter the second number:";
        int secondNumber = getNumber(scanner, prompt);

        // Determine the least common multiple of the numbers
        leastCommonMultiple(firstNumber, secondNumber);
    }
}
*/

    }

    // Display the Menu
    public static void displayMenu() {
        System.out.println("\nSelect one of the options:");
        System.out.println("0. Quit");
        System.out.println("1. Determine if 3 user-defined numbers are a Pythagorean triplet?");
        System.out.println("2. Determine if a user-defined number a prime number?");
        System.out.println("3. Compute the factor-pairs of a user-defined number.");
        System.out.println("4. Determine the greatest common factor of 2 user-defined numbers.");
        System.out.println("5. Compute the proper divisors of a user-defined number.");
        System.out.println("6. Determine whether a user-defined number is a perfect number, abundant number, or deficient number?");
        System.out.println("7. Determine if 2 user-defined numbers are amicable numbers?");
        System.out.println("8. Compute the prime factors of a user-defined number.");
        System.out.println("9. Determine the least common multiple of 2 user-defined numbers.");
        //System.out.println();
    }

    // Get a Number
    public static int getNumber(Scanner scanner, String prompt) {
        System.out.println(prompt);
        int n = scanner.nextInt();
        return n;
    }

    // 1. Determine if 3 user-defined numbers are a Pythagorean triplet?
    public static void isPythagoreanTriplet(int a, int b, int c) {
        if ( (a*a) + (b*b) == (c*c) ) {
            System.out.println("The numbers " + a + ", " + b + ", and " + c + " do form a Pythagorean Triplet.");
        } else {
            System.out.println("The numbers " + a + ", " + b + ", and " + c + " do not form a Pythagorean Triplet.");
        }
    }

    // 2. Determine if a user-defined number is a prime number?
    public static void isPrimeNumber(int n) {
        // Conditions for nonprime number:
        //  - if any number is divisible by any other number, it is not a prime number.
        //  - if the number is divisible by itself, it is a prime number.
        //  - if the number is divisible by 1, it is a prime number.
        //  - if the number is divisible by 2, it is a prime number.
        //  - we are looping from 2 to num/2 because a number is not divisible by more than its half.
        
        // flag to indicate if the number is prime or not
        boolean flag = false;                                                           // flag = false

        // loop until n/2, and break if true, else false
        for (int i = 2; i <= n / 2; ++i) {
        //while (2 <= n / 2) {                                                          // alaternare while loop
            if (n % 2 == 0) {
                flag = true;
                break;
            }
        }

        // print the results:
        //    - note: no need for braces because each command will only execute once 
        if (!flag) 
            System.out.println("The number " + n + " is a prime number.");              // this is looks sexy not using braces!
        else
            System.out.println("The number " + n + " is not a prime number.");
    }

    // 3.  Compute the factor-pairs of a user-defined number.
    public static String getFactorPairs(int n) {
        // declares an array of integers & allocates memory for "number" of integers
        int[] factors = new int[n];                              // 0,1,2
        String strFactors = "";

        // loop through the numbers from 1 to square root of n
        for (int i = 1; i <= (int)Math.sqrt(n); ++i) {
            if (n % i == 0) {                                   // bottom: factors
                factors[i-1] = i;
                //System.out.println("1. i =                                  : " + i);
            }
        }
        // loop backwards from Square root to 1
        for ( int i = (int)Math.sqrt(n); i >= 1; --i) {
            if( (n / i) != i && n % i == 0 ) {                  // top" level factors
                factors[n / i - 1] = n / i;
                //System.out.println("3. n / i = " + n + " / " + i + " =      : " + n / i);
            }
            else if (n % i == 0) {
                factors[i] = i;
                //System.out.println("4. i = " + i + " =                    : " + i);
            }
        }

        // String Builder: Convert the array to a String
        for (int i = 1; i <= n; i++) {
            if(factors[i-1] != 0){                               //  remove 0's from the array
                if(factors.length == i){
                    strFactors += factors[i-1];                  // add the last factor to the String, no comma
                } else {
                    strFactors += factors[i-1] + ", ";           // add the factor to the String, w/ comma
                }
            } 
        }
        //System.out.println("The factor pairs of " + n + " are: {" + strFactors + "}.");

        // return the String
        return strFactors; 
    }

    // // 4. Determine the greatest common factor of 2 user-defined numbers.
    public static void greatestCommonFactor(int x, int y) {
        // Print -->>   The factor pairs of 6 are: {1, 2, 3, 6}.
        String strFactors = "";
        strFactors = getFactorPairs(x);
        System.out.println("The factor pairs of " + x + " are: {" + strFactors + "}.");
        strFactors = getFactorPairs(y);
        System.out.println("The factor pairs of " + y + " are: {" + strFactors + "}.");

        // Print -->>   The greatest common factor (GCF) of 6 and 8 is 2.
        int greatestCommonFactor = 1;                               // initialize the greatest common factor to 1
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {    // if i is a factor of both numbers
                greatestCommonFactor = i;                           //      - then i is the greatest common factor
            }
        }
        System.out.println("The greatest common factor (GCF) of " + x + " and " + y + 
            " is " + greatestCommonFactor + ".");
    }

    // 5. Compute the proper divisors of a user-defined number.
    public static String properDivisors(int n) {
        int[] factors = new int[n];                            // 0,1,2    
        String strFactors = "";
        
        for(int i = 1; i <= n; i++) {
            if (n % i == 0 && n != i ) 
                factors[i-1] = i;
        }
        
        // String Builder: Convert the array to a String
        for (int i = 1; i <= n; i++) {
            if(factors[i-1] != 0){                               //  remove 0's from the array
                strFactors += factors[i-1] + ", ";           // add the factor to the String, w/ comma
            } 
        }
        strFactors = strFactors.substring(0, strFactors.length() - 2);         // this is lame. but I am out of time.
        //System.out.println("The proper divisors of " + n + " are: {" + strFactors + "}.");

        return strFactors;
    }

    // 6. Determine whether a user-defined number is a perfect number, abundant number, or deficient number?
    public static void isPerfectNumber(int n) {
        int[] factors = new int[n];
        String strFactors = "";
        int sum = 0;
        
        // Get Factor Pairs
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && n != i) {
                factors[i-1] = i;
                sum += i;
                strFactors += i + ", ";
            }
        }

        strFactors = strFactors.substring(0, strFactors.length() - 2);         // this is lame. but I am out of time.
        // Print --> The proper divisors of 6 are: {1, 2, 3}.
        System.out.println("The proper divisors of " + n + " are: {" + strFactors + "}.");

        // Prefect -->>   The number 6 is a perfect number because the sum of the proper divisors (6) is equal to the number (6).
        if (sum == n) {
            System.out.println("The number " + n + " is a perfect number because the sum of the proper divisors (" + sum + ") is equal to the number (" + n + ").");
        }
        
        // Deficient -->>   The number 25 is a deficient number because the sum of the proper divisors (6) is less than the number (25).
        else if (sum < n) {
            System.out.println("The number " + n + " is a deficient number because the sum of the proper divisors (" + sum + ") is less than the number (" + n + ").");
        }
        
        // Abundant -->>   The number 18 is an abundant number because the sum of the proper divisors (21) is greater than the number (18).
        else if (sum > n) {
            System.out.println("The number " + n + " is an abundant number because the sum of the proper divisors (" + sum + ") is greater than the number (" + n + ").");
        }
    }

    // 7. Determine if 2 user-defined numbers are amicable numbers?
    public static void isAmicableNumber(int x, int y) {
        String strFactors = "";
        strFactors = properDivisors(x);
        System.out.println("The proper divisors of " + x + " are: {" + strFactors + "}.");
        strFactors = properDivisors(y);
        System.out.println("The proper divisors of " + y + " are: {" + strFactors + "}.");

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sum1 += i;
            }
        }
        for (int i = 1; i <= y; i++) {
            if (y % i == 0) {
                sum2 += i;
            }
        }
        if (sum1 == sum2) {
            System.out.println("The numbers " + x + " and " + y + " are amicable numbers!");
        } else {
            System.out.println("The numbers " + x + " and " + y + " are not amicable numbers!");
        }
    }

    // 8. Compute the prime factors of a user-defined number.
    public static String primeFactors(int n) {
        String primeFactors = "";
        for(int i = 2; i <= n; i++) {
            while(n % i == 0) {
                primeFactors += i + ", ";
                //System.out.println(i + " ");
                //n = n / i;
                n /= i;
            }
         }

        primeFactors = primeFactors.substring(0, primeFactors.length() - 2);         // this is lame. but I am out of time.
        return primeFactors;
    }

    // 9. Determine the least common multiple of 2 user-defined numbers.
    public static void leastCommonMultiple(int x, int y) {
        String xPrimeFactors = primeFactors(x);
        System.out.println("The prime factors of " + x + " are: {" + xPrimeFactors + "}.");
        String yPrimeFactors = primeFactors(y);
        System.out.println("The prime factors of " + y + " are: {" + yPrimeFactors + "}.");

        // Split String into Array
        String[] xStrArr = xPrimeFactors.split(", ");
        String[] yStrArr = yPrimeFactors.split(", ");

        // Convert Strings to Integers
        int[] xIntArr = new int[xStrArr.length];
        int[] yIntArr = new int[yStrArr.length];
        for (int i = 0; i < xStrArr.length; i++) {
            xIntArr[i] = Integer.parseInt(xStrArr[i]);
        }
        for (int i = 0; i < yStrArr.length; i++) {
            yIntArr[i] = Integer.parseInt(yStrArr[i]);
        }

        // Find the Least Common Multiple
        int[] lcmArr = new int[xIntArr.length + yIntArr.length];
        for (int i = 0; i < xIntArr.length; i++) {
            lcmArr[i] = xIntArr[i];
        }
        for (int i = 0; i < yIntArr.length; i++) {
            lcmArr[i + xIntArr.length] = yIntArr[i];
        }
        Arrays.sort(lcmArr);
        int lcm = 1;
        for (int i = 0; i < lcmArr.length; i++) {
            lcm *= lcmArr[i];
            //System.out.println(lcmArr[i]);
        }
        System.out.println("The least common multiple (LCM) of " + x + " and " + y + " is " + lcm + ".");
    }
}

