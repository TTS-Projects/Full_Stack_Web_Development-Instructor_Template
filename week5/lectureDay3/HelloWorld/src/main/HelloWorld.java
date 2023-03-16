package main;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//integer called number
		//int number; // integer variable declaration 

		//boolean called answer
		//boolean answer = true; // boolean declaration and definition 
		
//		// legal but not recommended
//		int pop, top, can;
		
		 
//		// recommended
//		int pop;
//		int top;
//		int can;
		         
		// legal, but runs the risk of forgetting to initialize (assign values)
		//int pop, top, can; 

		// legal but not recommended
		//int pop=0, top=0, can=0;
		 
		// recommended
//		int pop = 0;
//		int top = 0;
//		int can = 0;
//		
		
		//String newString = "hi";

//		int  a = 1;
//		Integer a_int = 2;
//		boolean boolean_variable = true;
//		Boolean boolean_variable1 = true;
//		double double_variable = 0.0;
//		Double double_variables = 0.0;
//		
//		char c = 'f'; // '/u0066'
//		byte b = 'f'; // '66'
//		//c = c + 5; 
//		
//		//char[] char_array = ['h', 'i'];
//		
		
//		char answer = 'Y';             // 'Y' as the explicit character value
//		char middleInitialC = 0x0043;  // 'C'as a hexidecimal
//		
//		
//		
//		// different ways to define same character 
//		char lowerCaseAHex = 0x0061;    // 'a' as a hex value
//		char lowerCaseA = '\u0061';      // 'a' as a unicode 
//		char lowerCaseADecimal = 97;
//				
//		System.out.println(lowerCaseA);
//		System.out.println(lowerCaseAHex);
//		System.out.println(lowerCaseADecimal);
//		
//		
//		char capitalK = 75;            // 'K' as an integer value
//		
//		long BigLong = 230L;          // long (l, L)  
//		float SomeFloat = 927.42f;    // float (f, F)  
//		double someDbl = 392.2d;      // double (d, D)  
//		double wishfulSalary = 123_000_100_325.0d; // stored/printed as 123000100325.0
//		
//		
//		int smallInt = 120;   //int is 4 bytes == 32 bits
//		int biggerInt = 550;  //int is 4 bytes
//		int biggerIntHex = 0x226;
//		
//		//downcasting 4 bytes into 1 byte
//		byte b1= (byte)smallInt;  //value in both will be 120
//		
//		
//		
//		
//		byte b2= (byte)biggerInt; //value out of range, will be truncated
//		System.out.println(b2);
//		
//		
//
//		//downcasting 4 bytes into 2 bytes
//		short s1= (short)biggerInt;   //value in range, no truncation
//		
//		
//		
//		//byte b = (byte) 2321;
//		
//		
//		int a = 11;
//		int b = 5; 
//		int result = a / b;
//		
//		int remainder_result = a % b; 
//		System.out.println(remainder_result);
//		
//
////		int num1 = 2;
////		// 2
////		num1++;
////		//increments num1 by 1
////		//3
////		
////		
////		//
////		int x = 5;
////		System.out.println(x++);  // prints 5
////		// System.out.println(x);    // 		// x = x + 1;
////	
////		
////		
////		
////		System.out.println(x);    // prints 6
////		
////		
////		System.out.println(++x);  // prints 7
//		
//		int num1 = 2; //=> 2
//		int num2 = 4; //=> 4
//		num1 += num2; //value of num1 = 6: same as num1 = num1 + num2
//
//		num2 -= num1; //value of num2 = 2
//
//		num1 *= num2; //value of num1 = 8
//
//		num2 /= num1; //value of num2 = 2
//
//		int x = 5;
//		int y = 10;
//		int z = 11;
//
////		if (1 ==1 && 2==2) {
////			
////		}
//		int sum = 20;
//
//		if (sum > 13 && sum < 26) {
//		    System.out.println("Right in the sweet spot.");
//		} else {
//		    System.out.println("Too little, too much.");
//		}
//
//
//		String choice = "cash";
//		// when comparing strings remember to use equals() method
//		if (choice.equals("cash") || choice.equals("credit")) {
//		    System.out.println("Thanks for shopping at our store.");
//		} else {
//		    System.out.println("Sorry, we don't accept checks.");
//		}

		//madLib();
		
		// known as camel case, first word lower case and subsequent words capitalized
//		int currentScoreOfGame;  
//
//		// known as snake case, all lower case with an underscore between each word
//		//this is not really a convention often used in java, but might appear in other languages
//		int current_score_of_game; 
//
//		// known as Pascal case, first letter of each word capitalized
//		int FinalScoreOfGame;
//
//		// leading underscore sometimes used for short-lived or special purpose names
//		int _membersOutOfTown;  
//
//		// Not used often in Java, more often in JavaScript to denote a variable tied to an event
//		int $amountOfBill;
//
//		// All Caps with an underscore between words is a common convention for constant values
//		double TAX_RATE = 7.0;
//		
//		
//		ScopeExamples.numberClasses = 3;
//		
//		
//		ScopeExamples scopeExamples1 = new ScopeExamples(); //classVaraible = 0
//		//ScopeExamples scopeExamples2 = new ScopeExamples();
//
//		
//		scopeExamples1.aClassVaraible = 2; // classvaraibe = 2;
//		//scopeExamples.methodOne(); // aclassvaraible = 265
//
//		System.out.println(scopeExamples1.numberClasses);
//		scopeExamples1.numberClasses = 2;
//		System.out.println(scopeExamples1.numberClasses);
//		
//		
//		ScopeExamples scopeExamples2 = new ScopeExamples();
//
//		System.out.println(scopeExamples2.numberClasses);
//		
//		System.out.println(scopeExamples.aClassVaraible);

		
//		System.out.println(scopeExamples2.aClassVaraible);
//		Integer a = new Integer (1);
//		Integer b = new Integer(2);
//		System.out.println(Integer.compare(a, b));
		String s1 = "Hello";
		String s2 = new String("World");
		
		String longGreeting = s1 + " " + s2 + " from Java!";
		// longGreeting will now be "Hello World from Java!"
		
		int ndex = longGreeting.indexOf('W');             // ndex equal to 6
		int last = longGreeting.lastIndexOf('o');         // last equal to 14
		boolean contains = longGreeting.contains("fro");  // true
		boolean starts = longGreeting.startsWith("h");    // false
		char charVal = longGreeting.charAt(10);           // 'd'
		String lan = longGreeting.substring(17);          // lan = Java!
		String planet = longGreeting.substring(6, 11);    // planet = World
		boolean noNums = longGreeting.matches("d+");      // false - regular expression search for any number
		
		String str = String.format("%s was found at position %d.", planet, ndex);
		System.out.println(str);

		
		
	
		//Using Object.equals() checks value equality and is best for string comparisons

		String word1 = "Hello";
		String word2 = "Hello";
		String word3 = "Goodbye";

		word1.equals(word2); //true
		word1.equals(word3); //false

		// These two have the same value
//		new String("Hello World").equals("Hello World") // --> true 
//
//		// "==" checks if they are the same object, and they are not the same object
//		//One is a string object the other is a literal
//		new String("Hello World") == "Hello World" // --> false 
//
//		// These are both String objects, but not the same 
//		new String("Hello World") == new String("Hello World") // --> false 

		// Literals are interned strings and seen as the same object by the compiler 
//		"test" == "test" // --> true 

		// String literals are concatenated by the compiler yet the results are not seen as the same object.
//		"Hello World" == "Hello " + "World" // --> false

		String str1 = new String ("Hello World");
		String str2 = new String ("Hello World");
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		

	}
	
	public static void madLib() {
		
		  Scanner userInput = new Scanner(System.in);      
          int ageLimit = 18;
    
          System.out.println("How old are you?");
          
          int age = Integer.parseInt(userInput.nextLine());


          if (age < ageLimit){
            System.out.printf("You are too young! Sorry!\n");
            System.exit(0);
          } else {
		
		// Scanner userInput = new Scanner(System.in);
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
        System.out.printf("\n I want to go to the %s with you in %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
	}
}

}


// create a class in my environment 
