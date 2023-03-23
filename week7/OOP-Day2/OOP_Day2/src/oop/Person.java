package oop;

public class Person {
	
	//instance variables 
//	public boolean hasHair;
//	private boolean isAlive;
//	protected boolean isBaby;
	
	String name;
	Integer age;
	String location;
	
	public  Person() {
		
		
	}
	
	public Person(String name, Integer age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}
	public Person (String name) {
	    this.name = name; 
	}

	public static void main(String[] args) {
		Person firstPerson = new Person();

		Person secondPerson = new Person("John");

		Person thirdPerson = new Person("Jane", 45, "London");
		
		thirdPerson.sayHello();
	    System.out.println("Jane will be " + thirdPerson.birthday() + "years old next year!");
	    thirdPerson.reallyHardMath();
	    System.out.println(thirdPerson.name);

	}
	
//	public boolean getIsAlive() {
//		r
//	}
	
	public void sayHello(){
	   	System.out.println("Hello " +  name);

	   }
	public int birthday() {
	    return age + 1;
	}
	public void reallyHardMath(){
		
	    double answer = (-5 + Math.sqrt(5*2 - 4 * (8*15)))/(2 * 8);
	    System.out.println(answer);
	}

}
