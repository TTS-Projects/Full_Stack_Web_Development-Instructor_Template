package ExceptionsAndErrors;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsVsErrors {

	public static void main(String[] args) {
		//dividebyZero
		exception();
		
	}
	
	private static void errors() {
		// TODO Auto-generated method stub

	}
	private static void exception() {
		// TODO Auto-generated method stub

		//unchecked exception
		try {
		int a = 0;
		int b = 5;
		int c = b / a;
		}
		catch(ArithmeticException e) {
			System.out.println("I tried to divide by zero");
			e.printStackTrace();
		}
		
		//checked exception
		FileInputStream in = null;
		try {
			in = new FileInputStream("C:\\Users\\Mike\\Documents\\TTS\\TTS-Febraury6\\week8\\javaIO\\src\\input.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
