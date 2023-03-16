package data_structures;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class HashMapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creates an array of strings 
		String[] fruit;

		//creates an array of integers
		int[] classSize;

		//creates an array of boolean
		boolean[] brokenLights;

		//creates an array of names
		String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};
		
		//String[] my_array = {"mary","sybil","edith"};

		//System.out.println(my_array[1]);
		
		
		
		
		String[] my_array = {"Aaron","Joan","Layla"};
		
        //Console console = System.console();
		System.out.println(my_array[1]);
        //console.printf(my_array[1]);
        // returns "Joan"
        int size = my_array.length;
        System.out.println(size);
		
        collections();
		
		 // returns "sybil"
	}
	public static void collections() {
		ArrayList <Integer> otherArray = new ArrayList<Integer>(2);
		
		String[] my_array = {"Aaron","Joan","Layla"};
		
		ArrayList <String> my_array_arraylist = new ArrayList<String>(3);
		 my_array_arraylist.add("John");
		 my_array_arraylist.add("Heather");
		 my_array_arraylist.add("Joe");
		 my_array_arraylist.add("wenwen");
		 System.out.println(my_array_arraylist.get(3));  //returns "Heather"
		 
		 //names = {John, Heather, Joe, Finn} //original ArrayList

		//reverse the contents by calling Collections.reverse(ArrayListName)
		Collections.reverse(my_array_arraylist);
		// =>[Finn, Joe, Heather, John] //after reversing the elements


		//Get the size of the ArrayList
		System.out.println(my_array_arraylist.size());
		//=> 4

		//Checks the array list for a specific element
		my_array_arraylist.contains("Heather");
		//=> true

		//remove all elements from list
		my_array_arraylist.clear(); 
		// => names ={}
		
		//Create a new string
		String myString = "I really love icecream!";

		//Create another string that holds the split version of the first
		String[] str = myString.split(" ");
		
		System.out.println(str[1]);
		
		//Use the List class to create a new ArrayList          
		List<String> arrayString = new ArrayList<String>();

		//Store the contents of our split string as elements in
		//arrayString using the Array.asList to convert the string into an array
		arrayString = Arrays.asList(str);
		//=>[I, really, love, icecream!] //Turns the string myString into an array
		 
		
		
		ArrayList<String> fruitList = new ArrayList<String>(3);
		fruitList.add("apple");
		fruitList.add("Banana");
		fruitList.add("Grape");
		

		//ArrayList of strings
		//fruitList = {"Apple", "Banana", "Grape"}

		//Convert the list to an Array using .toArray method
		Object[] fruitArray =  fruitList.toArray();
		// {"Apple", "Banana", "Grape"}
		System.out.println(fruitArray);
		for(int i = 0; i < fruitArray.length; i ++ ) {
			System.out.println(fruitArray[i]);
		}
		

		//create a new string to hold the converted array in string form.
		String fruitString = Arrays.toString(fruitArray);
		//=>[Apple, Banana, Grape] //output of fruitString

		System.out.println(fruitString);
		
		HashMap<String,String> hashmap = new HashMap<String,String>();
		hashmap.put("fruit", "banana");
		
		if (hashmap.get("veggie") == null) {
			System.out.println("this is my veggie");
		}

//		//to remove brackets and commas, use the String method .replace
//		System.out.println(Arrays.toString(fruitArray)
//		.replace("[","").replace("]","").replace(",", " "));
//		=> Apple Banana Grape
	}

}
