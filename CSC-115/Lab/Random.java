
import java.util.Scanner;
import java.util.Random;

public class Random {
    public static void main (String[] args) {
        // instantiate a Scanner object
        Scanner scanner = new Scanner(System.in);

        // get input from user for a seed for the RNG
        //System.out.println("enter seed: ");
        //int seed = scanner.nextInt();
        int seed = 1;

        // get input from user for the size of the array
        //int size = scanner.nextInt();

        // instantiate a RNG with the seed
        Random random = new Random();

        //int rnd =  random.nextInt();

        System.out.println( random.nextInt(100) );
    }
}

