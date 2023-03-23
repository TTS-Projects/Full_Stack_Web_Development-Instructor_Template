package control_flow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class ControlFlow {

	public static void main(String[] args) {
//		//creates a count and performs checks based on the value
//		int count = 44;
//		
		if(((1+3)/2) %2 == 0) {
			System.out.println("even number");
		}
//		
		return ;
//		if ( count > 20 )
//		{
//		    String msg = "Count is large!";
//		    System.out.println(msg);
//	
//		
//		}
//		 
//		if ( count > 50 )
//		{
//		    String msg = "Count is VERY large!";
//		    System.out.println(msg);
//		}
//		System.out.println("Finished checking count.");
//		 
//		// output:
//		// Count is large!
//		// Finished checking count.
		
//		
//		int count = 44;
//		if ( count > 20 )
//		{
//		    String msg = "Count is large!";
//		    if ( count > 50 )
//		    {
//		        msg = msg + "\nCount is VERY large";
//		    }
//		    System.out.println(msg);
//		}
//		System.out.println("Finished checking count.");
//		
//		ControlFlow controlFlow = new ControlFlow();
//		controlFlow.checkId(true, 21, true);
		
		
		
		
//		int x = 30;
//		if (x < 20) System.out.println("Print true!");
//		System.out.println("will this be a part of my if statement");
//		boolean validId = true;
//		int age = 22;
//		boolean buyingAlc = false;
//		
//		 if (validId)
//		    {
//		        System.out.println("Valid ID presented");
//		        if((age>21) && (buyingAlc))
//		        {
//		            System.out.println("Customer legal to purchase alcohol");
//		        }
//		        else
//		        {
//		            System.out.println("No alcohol sales to this person");
//		        }
//		    }
//		    else 
//		    {
//		        System.out.println("Error: Invalid license");
//		    }
		 
//		// imagine a List, someList, that is created previous to this code
//		 int listSize = someList.size();
//		  
//		 if (listSize > 100)
//		 {
//		     System.out.println("List is really big!");
//		 }
//		 else if (listSize > 80)
//		 {
//		     System.out.println("List is kind of big.");
//		 }
//		 else if (listSize > 60)
//		 {
//		     System.out.println("List is just a little over half big.");
//		 }
//		 else if (listSize > 30 && listSize <= 59)
//		 {
//		     System.out.println("List is approaching small")
//		 }
//		 else
//		 {
//		     System.out.println("List is small");
//		 }
//		 
//		 ControlFlow controlFlow = new ControlFlow();
//		 controlFlow.printShirtSize('M');
//
//		 // O(n) time == iterate through all instances in order to reach the end
////		 int n = 1024;
////		 for (int i = 0; i < n ; i++) {
////			 System.out.println("this ran for person: " + i);
////		 }
////		 
////		 //O( log(n) ) 
////		 int i = 1;
////		 while(i < n) {
////			 System.out.println("this ran for person: "+ i);
////			 
////			 i = i *2;
////		 }
//		//Syntax of enhanced for loop
//		 
////		 for([data_type][variable] : [collection_name] ){
////		 	//code to execute on item
////		 }
////		 //Can be read as: For each ___ item in [collection_name] do: 
////		 
//		 int[] simpleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		 
//		// using the standard for loop and the length property of an array
//		for (int i = 0; i < simpleArray.length; i++) 
//		{
//		    System.out.println("Normal for value: " + simpleArray[i]);
//		}
//		 
//		// using the enhanced for loop
//		for (int item : simpleArray) 
//		{
//		    System.out.println("Enhanced for: " + item);
//		}
		 
		// both loops will print the their respective strings 1 - 10. 
//		try {
//		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mike\\Documents\\TTS\\TTS-Febraury6\\week6\\LectureDay3\\ControlFlow\\src\\control_flow\\myTextFile.txt"));
//		String line;
//			line = reader.readLine();
//		reader.
//			 
//			    while (line != null)
//				{
//			    	System.out.println(line);
//			    	line = reader.readLine();
//				}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Random random = new Random();
//		int breakAt = random.nextInt(100); //random value is 5
		 // starting list 1
		//index 1; index 2...; index 4; 
		//length of ... list 5
		//
//		for(int x=1; x<=5; x++)
//		{
//		    System.out.println("Starting list " + x);
//		 
//		    for(int i=0; i<100; i++)
//		    {
//		        if ( i==breakAt)
//		        {
//		            System.out.println("Length of this list: " + breakAt);
//		            break;
//		        }
//		        System.out.println("Index: " + i);
//		    }
//		    System.out.println("Finished list " + x);
//		    // Get the next randome number for a different size list
//		    breakAt = random.nextInt(100);
//		}
//		System.out.println("After the loop");
//		Random random = new Random();
//		int breakAt = random.nextInt(100);
//
//		//labeled loop
//		outer:
//		for(int x=1; x<=5; x++)
//		{
//		    System.out.println("Starting list " + x);
//
//		    for(int i=0; i<100; i++)
//		    {
//		        if ( i==breakAt)
//		        {
//		            System.out.println("Length of this list: " + breakAt);
//		            
//		            if (breakAt%x == 2)
//		            {
//		                System.out.println("List generation ended early!");
//		                //labeled break
//		                break outer;
//		            }
//		            else
//		            {
//		                break ;
//		            }
//		        }
//		        System.out.println("Index: " + i);
//		    }
//		    System.out.println("Finished list " + x);
//		    // Get the next random number for a different size list
//		    breakAt = random.nextInt(100);
//		}
//		System.out.println("After the loop");
//		
//		
//		outer_while:
//			for(int i = 0; i < 20; i++) {
//				while(i < 20) {
//					break outer_while;
//				}
//			}
//			int i = 0;
		// generate a random number between 0 and 100
//		Random random = new Random();
//		int breakAt = random.nextInt(100);
//		 
//		// print a 'list' of random length
//		for(int i=0; i<100; i++)
//		{
//		    if ( i==breakAt)
//		    {
//		        System.out.println("Random number was: " + breakAt);
//		        break;
//		    }
//		    // if number is even, skip to next iteration
//		    if ( i%2==0)
//		    {
//		        continue;
//		    }
//		    System.out.println("Index: " + i);
//		}
//		System.out.println("After the loop");
		
		// the snippet would print 5 'lists', each with the numbers 0-12 in them.
		return;
//		outer:
//		for(int i=0; i<5; i++)
//		{
//		    System.out.println("List number: " + i);
//		    for(int y=0; y<25; y++)
//		    {
//		        System.out.println("Index: " + y);
//		        if ( y == 12)
//		        {
//		            continue outer;
//		        }
//		    }
//		}
//		
//	}
//	void checkId( boolean validId, int age, boolean buyingAlc )
//	{
//	    if (validId)
//	    {
//	        System.out.println("Valid ID presented");
//	        if((age>=21) && (buyingAlc))
//	        {
//	            System.out.println("Customer legal to purchase alcohol");
//	        }
//	    }
//	}
	}

	void CheckId( boolean validId, int age, boolean buyingAlc ) {
	    if (validId){
	        System.out.println("Valid ID presented");
	        if((age>21) && (buyingAlc)){
	            System.out.println("Customer legal to purchase alcohol");
	        } else {
	            System.out.println("No alcohol sales to this person");
	        }
	    } else {
	        System.out.println("Error: Invalid license");
	    }
	}
	
	//switch statement
	 public void printShirtSize(char shirt)
	 {
		 	shirt = Character.toLowerCase(shirt);
	        String msg= " " ;
	        switch(shirt)
	        {
	                case 's':
	                       msg= "Shirt is small";
	                       break;
	                 case 'm':
	                       msg= "Shirt is medium";
	                       break;
	                 case 'l':
	                       msg= "Shirt is large";
	                       break;
	                  case 'x':
	                       msg= "Shirt is Xtra large";
	                       break;
	                  default:
	                       msg= "Unknown shirt size";
	                       break;
	        }
	        System.out.println(msg);
	        return;
	 }
	 
	 
	 
	 public char returnShirtSize(char shirt)
	 {
		 	shirt = Character.toLowerCase(shirt);
	        String msg= " " ;
	        switch(shirt)
	        {
	                case 's':
	                       msg= "Shirt is small";
	                       break;
	                 case 'm':
	                       msg= "Shirt is medium";
	                       break;
	                 case 'l':
	                       msg= "Shirt is large";
	                       break;
	                  case 'x':
	                       msg= "Shirt is Xtra large";
	                       break;
	                  default:
	                       msg= "Unknown shirt size";
	                       break;
	        }
	        System.out.println(msg);
	        return shirt;
	 }
	 // insert ONLY positive, odd data
	 public void insertOddData(int data)
	 {
	     // equal to 0 check
	     if (data == 0)
	     { 
	         return;
	     }
	     // Negative check
	     if (data < 0)
	     {
	         return;
	     }
	     // check to see if data is even or odd
	     if ( data%2 == 0)
	     {
	         return;
	     }
	  
	     // some code here to store the odd data somewhere
	     System.out.println("Odd Data Stored");
	     return;
	 }
	  
	 // find and return the sum of the array
	 public int getArraySum(int[] arr)
	 {
	     // initialize to a valid default return value
	     int sum = 0;
	  
	     // array must have values to sum
	     if (arr.length > 0)
	     {
	         for( int n : arr)
	         {
	             sum += n;
	         }
	     }
	  
	     return sum;
	 }

}
