package oop_part2;

	
class Vehicle {
	

	private VehicleClassification vehicleClass;
	private VehicleClassification2 vehicleClass2;

public void setVehicleClass(VehicleClassification theClass)
{
  this.vehicleClass = theClass;
}
public void setVehicleClass2(VehicleClassification2 theClass)
{
  this.vehicleClass2 = theClass;
}


public VehicleClassification getVehicleClass()
{
  return this.vehicleClass;
}
//in the Vehicle class
public void printVehicleType()
{
String type = "NOT SET";
switch (this.vehicleClass)
{
 case NEW:
   type="New Car";
   break;
 case USED:
   type = "User Car";
   break;
 case OFF_LEASE:
   type = "Leased Car";
   break;
 case SHUTTLE:
   type = "Dealer Shuttle";
   break;
 case LOANER:
   type = "Dealer Service Loaner";
   break;
 case PARTS_RUNNER:
   type = "Parts runner";
   break;
   default:
     break;
}  
System.out.println("This car type is: " + type);
}
	



int wheels = 4;




}