package robots;

import java.util.ArrayList;

import oop.Car;

public class Robot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("blue", 4);
		car.setColor("grey");
		String current_car_color = car.getColor();
//		Car car2 = new Car();
		Car car2 = new Car("blue", 4);
		car2.setColor("red");
		String current_car_color2 = car2.getColor();
		System.out.println(current_car_color);

		System.out.println(current_car_color2);
//		
//		Car car = new Car("blue", 4);
//		car.start();
//		car.drive();
		
		ArrayList<String> someList = null;
		 
		// some other code here, may or may not assign a reference to list
		 
		if (someList != null)
		{
		    System.out.println("number elements: " + someList.size());
		}
		else
		{
		    System.out.println("List is still uninitialized.");
		}
		//car.Color = "blue";
		//car.NumberOfDoors = 4;
		//car.start();
		//car.drive();
		
	}

}
