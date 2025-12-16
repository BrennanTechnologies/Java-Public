/*
    import java.util.Scanner;
    import java.util.Random;
*/

import java.util.*;

public class dictionaries {
    public static void main(String[] args) {

        // Simple Dictionary
        int[][]     arr2d_int;
        String[][]  arr2d_String;
        double[][]  arr2d_double;

        // Given a 2d array called `arr` which stores `int` values
		// using put method
		//  my_dict.put("01", "Apple");
		//  my_dict.put("10", "Banana");

    }

/*
        // creating a My HashTable Dictionary
        Hashtable<String, String> my_dict = new Hashtable<String, String>();

        // Using a few dictionary Class methods
        // using put method
        my_dict.put("01", "Apple");
        my_dict.put("10", "Banana");

        // using get() method
        System.out.println("Value at key = 10 : " + my_dict.get("10")); 
        System.out.println("Value at key = 11 : " + my_dict.get("11"));
        
        // using isEmpty() method
        System.out.println("Is my dictionary empty? : " + my_dict.isEmpty());

        // using remove() method 
        // remove value at key 10
        my_dict.remove("10");
        //System.out.println("Checking if the removed value exists: " + my_dict.get("10")); 
        System.out.println("Size of my_dict : " + my_dict.size()); 
*/

public static void storage(){
    
        /*
I am in the middle of a Java project which will be using a 'big dictionary' of words. By 'dictionary' I mean certain numbers (int) assigned to Strings. 
And by 'big' I mean a file of the order of 100 MB. The first solution that I came up with is probably the simplest possible. 
At initialization I read in the whole file and create a large HashMap which will be later used to look strings up.
        */

        int[][] arr2d = {
            {1,2,3}
            ,
            {4,5,6}
        };

        //We can get the value `4` by using
        int retrieved = arr2d[1][0];

        /**
         * “Row-major order” refers to an ordering of 2D array elements where traversal occurs across each row - from the top left corner to the bottom right.
         */
        for(int i = 0; i < arr2d.length; i++) {
            for(int j = 0; j < arr2d[i].length; j++) {
                System.out.println(arr2d[i][j]);
            }
        }
        /* 
            In Java, initializer lists can be used to quickly give initial values to 2D arrays. 
        */

        // Method one: declaring and intitializing at the same time
        double[][] doubleValues = {
                                    {1.5, 2.6, 3.7}
                                    , 
                                    {7.5, 6.4, 5.3}
                                    ,
                                    {9.8,  8.7, 7.6}
                                    ,
                                    {3.6, 5.7, 7.8}
                                };
        double retrieved2 = doubleValues[1][0];             // 7.5
        System.out.println("retrieved2: " + retrieved2);

        // Method two: declaring and initializing separately:
        String[][] stringValues;
        stringValues = new String[][] {
                                        {"working", "with"}
                                        ,
                                        {"2D", "arrays"}
                                        ,
                                        {"is", "fun"}
                                    };
        String retrieved3 = stringValues[1][1];    
        System.out.println("retrieved3: " + retrieved3);

        int arr2d2[][] = {
                            {14, 12, 10}
                            ,
                            {8, 6, 4}
                        };

        // this is a 3d array
        int[][][] arr3d =   {
                                {
                                    {1, -2, 3},
                                    {4, -5, 6},
                                    {7, -8, 9}
                                },
                                {
                                    {-4, -5, 6, 9},
                                    {-7, -8, 9, 12},
                                    {-10, -11, 12, 15}
                                },
                                {
                                    {-14, -15, 16, 19},
                                    {-17, -18, 19, 22},
                                    {-20, -21, 22, 25}
                                }
                            };

        int ret3d = arr3d[0][1][2];                     // 6
        System.out.println("ret3d: " + ret3d);

}

/*
public static void hypercube() {
    // this is a 4d array
    int[][][][] hypercube =   {

    }
}
*/