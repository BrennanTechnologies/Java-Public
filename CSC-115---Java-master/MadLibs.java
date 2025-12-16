/**
 * Description
 * Prompt user for words that are used to generate a random story.
 *
 * @author Chris Brennan
 * @since 9-25-21
 */
 
import java.util.Scanner;

public class MadLibs {
	public static void main (String[] args) {
		makeMadLib(); // the method to get user input, and output the story.
	}

	// this method asks the user to input multiple words.
	public static void makeMadLib() {
		
		// Istantiate the Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		// Collect user input.
		System.out.println("Enter a name");
		String name = scanner.nextLine();

		System.out.println("Enter a number");
		String number = scanner.nextLine();

		System.out.println("Enter a noun");
		String noun = scanner.nextLine();

		System.out.println("Enter a verb");
		String verb = scanner.nextLine();
		
		System.out.println("Enter a place");
		String place = scanner.nextLine();
		
		System.out.println("Enter a emotion");
		String emotion = scanner.nextLine();
		
		System.out.println("Enter a color");
		String color = scanner.nextLine();
		
		System.out.println("Enter a adverb (describes a verb)");
		String adverb = scanner.nextLine();
		
		System.out.println("Enter a adjective (describes a noun)");
		String adjective = scanner.nextLine();

		System.out.println("Enter a smell");
		String smell = scanner.nextLine();
		
		System.out.println("Enter a taste");
		String taste = scanner.nextLine();

		System.out.println("Enter a  Animal");
		String animal = scanner.nextLine();

		System.out.println("Enter a treat");
		String treat = scanner.nextLine();
		
		System.out.println("Enter a weekDay");
		String weekDay = scanner.nextLine();
		
		System.out.println("Enter a month");
		String month = scanner.nextLine();
		
		// Build the Story.
		String storyLine1 = number + " days ago " + name + " and I went to the " + place + " were we were watching a ";
		String storyLine2 = adjective + " " + noun + " that was " + color + " in color when we saw another " + adverb + " " + noun ;
		String storyLine3 = "which made us feel " + emotion + " because it looked like a " + animal + " and it offerd us a " ;
		String storyLine4 = "delicious " + treat + " that smelled like " + smell + " but tasted like " + taste + ".";
		String storyLine5 = "We decided that we would return each " + weekDay + " in " + month + ".";

		// Now output a story!
		System.out.println("=================================================");
		System.out.println("Our day in the Park!");
		System.out.println("=================================================");
		System.out.println(storyLine1); 
		System.out.println(storyLine2); 
		System.out.println(storyLine3); 
		System.out.println(storyLine4); 
		System.out.println();
		System.out.println(storyLine5); 
	}
}

// =============== LAB SUMMARY ===============
/*
1. What was the hardest part of this lab?
Building a series of long strings requires a lot of attention to detail.	

2. What will you always remember (never forget) from this exercise?
Formatting long strings can be tedious.
*/