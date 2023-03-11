package madlib;

import java.util.Scanner;

public class MadLib {

	
	public static void main(String[] args) {
		//javascript equivalent
		/*
		 * let name; let adjective; let verbOne;
		 * let verbTwo; let number; let yourName;
		 * 
		 * console.log("Dear " + name);
		 * ...
		 * console.log("Sincerely, " + yourName);
		 */
		//System.out.println(args[0]);
//		String name = "Mike";
//		String adjective = "beautiful";
//		//String verbOne;
//		String noun = "cat";
//		String nounTwo = "house";
//
//		int number = 69;
//		Str yourName = "Mike G";
//		
//		System.out.println("Dear " + name + "," );
//		System.out.println("You are " + adjective + " and I want to be your "+ noun + "! I want to go to the\n" 
//		+ nounTwo + " with you in " + number + " days.");
//		System.out.println("Sincerely, " + yourName);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name = userInput.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun: ");
        String nounTwo = userInput.nextLine();
        System.out.println("Give me a number: ");
        String number = userInput.nextLine();
        System.out.println("Give me your name: ");
        String yourName = userInput.nextLine();

        System.out.printf("Here is your story: \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and I want to be your %s!", adverb, adjective, noun);
        System.out.printf("\n I want to go to the %s with you in %d days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
	
        
	}
}
