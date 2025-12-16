/**
 * Description
 * This programs demonstates a while loop.

 * @author Chris Brennan
 * @since 10-31-21
 */

public class WhileLoopA {
    
    // Call the main Method
    public static void main(String[] args){
        
        // Call the While Method
        whileMethod();
    }

    // perform while loop
    public static void whileMethod() {

        // Initialize the Variable
        int i = 0;
        
        System.out.println("BEGIN"); // Print Message

        // Perform the Loop
        while ( i < 10 ) {
            System.out.println(i);
            i++;  // Increment counter
        }
        
        System.out.println("END"); // Print Message
    }
}