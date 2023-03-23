package car;

import java.io.Console;
import java.util.*;

public class Car {
	
	private String name; 
	private String color;

	public Car() {
		
	}
	
	public Car (String name, String color) {
		this.name = name; 
		this.color = color; 
	}
	
    
   @Override
	public String toString() {
		// TODO Auto-generated method stub
	   
	   return ("     This " + this.getName() + " car is " + this.getColor());
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

public static void main(String[] args){
        Car myCar = new Car("crossover", "blue");

        
//        System.out.printf("This %s car is %s.", 
//                myCar.getName(),
//                myCar.getColor());
        System.out.printf("This is myCar variable:%s", myCar); // output: Car@6d06d69c

   }

}
