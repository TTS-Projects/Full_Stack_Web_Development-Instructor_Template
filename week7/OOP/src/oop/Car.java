package oop;
//public class Car 
//{
//    // change case - convention that member variables are camel case.
//    private String color;
//    private int numberOfDoors;
//    
//    public String wheelColor;
// 
//    public String getColor() 
//    {
//        return color;
//    }
// 
//    public void setColor(String color) 
//    {
//        this.color = color;
//    }
// 
//    public int getNumberOfDoors() 
//    {
//        return numberOfDoors;
//    }
// 
//    public void setNumberOfDoors(int numberOfDoors) 
//    {
//        if ( numberOfDoors >= 1 && numberOfDoors <= 6)
//            this.numberOfDoors = numberOfDoors;
//        else
//            this.numberOfDoors = -1;
//    }
// 
//    // no-arg constructor
//   
// 
//    public void start()
//    {
//        System.out.println("Car starting");
//    }
// 
//    public void stop()
//    {
//        System.out.println("Car stopping");
//    }
// 
//    public void drive()
//    {
//        System.out.println("Car driving");
//    }
// 
//}
//
//
// 
//    // Other methods remain as they were
//
// 
//// instantiating with the new constructor
//
////// instantiating and using a car object
////Car car = new Car();

public class Car 
{
    // private (internal) constants
    public  static  final int MAX_DOORS = 6;
    private static final int MIN_DOORS = 1;
 
    // public (external) constants
    public static  final String TYPE_SPORTY = "Sporty";
    public static final String TYPE_FAMILY = "Family";
 
    // a new property and its respective accessors
    private String carType;
    
    public Car() {
    	MAX_DOORS = 4;
    }
 // 
     // constructor with arguments
     public Car(String color, int doors)
     {
         this.setColor(color);
         this.setNumberOfDoors(doors);
     }
 
    private void setColor(String color) {
	// TODO Auto-generated method stub
	
}
	public String getCarType() 
    {
        return carType;
    }
    public void setCarType(String carType) 
    {
        this.carType = carType;
    }
    // rest of class the same with the exception of setNumberOfDoors
    public void setNumberOfDoors(int numberOfDoors) 
    {
        if ( MIN_DOORS >= 1 && numberOfDoors <= MAX_DOORS)
            this.numberOfDoors = numberOfDoors;
        else
            this.numberOfDoors = -1;
    }
}
 
Car fam = new Car("White", 4); //MAX_DOORS FOR EVERYONE = 8, FAM_COLOR = WHITE, FAM_DOORS = 4






Car fam2 = new Car("White", 4); //
Car fam3 = new Car();



