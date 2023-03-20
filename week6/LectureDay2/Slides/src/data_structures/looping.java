package data_structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(5);
		arraylist.add(5);
		arraylist.add(5);

	
		for(int i = 0; i < arraylist.size(); i++) {
			Integer num = arraylist.get(i);
			System.out.println(num);
		}
		System.out.println("end of list \n");
		
		for( Integer num: arraylist) {
			System.out.println(num);
		}
		
		
		// using an iterator
		Iterator<Integer> iterator = arraylist.iterator(); 
		
		List<Integer> arraylist2 = new ArrayList<Integer>();
		
		List<Integer> arraylist3 = new LinkedList<Integer>();
		
		
		
		while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
		hashmap();
		
		List<Integer> list = Arrays.asList(new Integer[] {5,1,2,3,4});
		System.out.println("\nthe result is: " + minValue(list));
		
	
	}
	public static void hashmap() {
		//person = {Joan=22, Daniel=42, Anna=34}

		HashMap<String, Integer> hashmap = new HashMap<String,Integer>();
		hashmap.put("Joan", 22);
		hashmap.put("Dan", 42);
		hashmap.put("Anna", 34);
		
		
		//loop through the hash map and return each key/value pair
		for (Map.Entry<String, Integer> entry : hashmap.entrySet()){
			
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
			}
	}
	// list with values 1,2,3,4
	public static Integer minValue(List<Integer> list) {
		//System.out.println(list.get(0)); 
		
		//I give you the amount of boxes, and the amount in each box
		Integer minimum;
		minimum = list.get(0);
		for(Integer num: list) {
			
			System.out.print(num + " ");
			if(num < minimum) {
				minimum = num;
			}
			
		}
		 
		return(minimum);
		
		
	}
	// list with values 1,2,3,4
		public static Integer maxValue(List<Integer> list) {
			//System.out.println(list.get(0)); 
			
			//I give you the amount of boxes, and the amount in each box
			Integer max;
			max = list.get(0);
			for(Integer num: list) {
				
				System.out.print(num + " ");
				if(num > max) {
					max = num;
				}
				
			}
			 
			return(max);
			
			
		}
		

}
