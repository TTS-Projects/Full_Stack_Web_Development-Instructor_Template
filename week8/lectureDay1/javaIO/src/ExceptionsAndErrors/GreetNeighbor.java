package ExceptionsAndErrors;

import java.util.InputMismatchException;

public class GreetNeighbor {
	   
	   public GreetNeighbor() {
	      
	   }
	   
	   public static void sayHelloNeighbor(String greeting) throws SayProperGreetingException {
	      if (greeting.equals("Hello")) {
	      	System.out.println(greeting + " neighbor!  Welcome!");
	      } else {
	   	 //throw new SayProperGreetingException(greeting);
	       throw new InputMismatchException("value must contain only number");
	      } 
	   }

	   public static void main(String[] args) throws SayProperGreetingException {
	       GreetNeighbor welcome = new GreetNeighbor();
	       //sayHelloNeighbor("Goodbye");
	   }
	   
	   
	}   