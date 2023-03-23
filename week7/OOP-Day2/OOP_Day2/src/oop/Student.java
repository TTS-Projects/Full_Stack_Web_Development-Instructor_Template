package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person{

	int gradYear; 
	  boolean enrolled = false;

	  void enrolledStudent(){
	    enrolled = true;
	  }
	  
	  static Student addStudents(String name, int age, int gradYear, boolean enrolled){
			 
		    Student new_student = new Student();
		    new_student.name = name;
		    new_student.age = age;
		    new_student.gradYear = gradYear;
		    new_student.enrolled = enrolled;
		    return new_student;

		    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 Student new_student = new Student();
//		    new_student.name = "Michael";
//		    new_student.age = 20;
//		    new_student.gradYear = 2020;
//		    
//		    new_student.enrolledStudent();
//		    
//		    System.out.println("Name: " + new_student.name + "\nAge: " 
//		        + new_student.age +"\nGraduation Year: " + new_student.gradYear 
//		        + "\nEnrolled? " + new_student.enrolled);
//		ArrayList<Student> studentList = new ArrayList<Student>();
//
//		studentList.add(addStudents("Angela", 43, 1996, false));
//		studentList.add(addStudents("Daniel", 33, 2002, true));
//		studentList.add(addStudents("Ronald", 19, 2021, false));
//
////	    Student new_student = new Student();
////	    new_student.name = "Michael";
////	    new_student.age = 20;
////	    new_student.gradYear = 2020;
////	    studentList.add(new_student);
////	  
////	    Student new_student2 = new Student();
////	    new_student2.name = "Janice";
////	    new_student2.age = 32;
////	    new_student2.gradYear = 2019;
////	    studentList.add(new_student2);
////	  public class Student extends Person {
//		   
//		  //variables, constuctor and enrolled method
//
//		  
//
//		 
//		  
//	    for (Student s : studentList){
//	      System.out.println("Name: " + s.name + "\nAge: " + 
//	      s.age +"\nGraduation Year: " + s.gradYear + 
//	      "\nEnrolled? " + s.enrolled);
//	    }
		
//		Console console =  System.console();
		
		Scanner scanner = new Scanner(System.in);
	      ArrayList<Student> studentList = new ArrayList<Student>();
	      String studentName;
	      int studentAge;
	      int studentGradYear;
	      boolean enrollmentStatus;
	      String complete = "no";
	      
	    //loop keeps getting user input as long as the complete variable equals "no"
	      while (complete.equals("no")) {
	    	System.out.println("Enter a name: ");
	        studentName = scanner.nextLine();
	        System.out.println(("Enter Age: "));
	        studentAge = Integer.parseInt(scanner.nextLine());
	        System.out.println(("Year of Graduation: "));
	        studentGradYear = Integer.parseInt(scanner.nextLine());
	        System.out.println("Enrolled (enter true or false: ");
	        enrollmentStatus = Boolean.parseBoolean(scanner.nextLine());
	        studentList.add(addStudents(studentName, studentAge, studentGradYear, enrollmentStatus));
	        System.out.println("List complete? Enter yes or no: ");
	        complete = scanner.nextLine();
	      }
	 
	    //loop through array list and output the contents one object at a time.
	    for (Student s : studentList){
	      System.out.println("Name: " + s.name + 
	      "\nAge: " +  s.age +"\nGraduation Year: " + s.gradYear +  "\nEnrolled? " + s.enrolled);
	    }
	}

}
