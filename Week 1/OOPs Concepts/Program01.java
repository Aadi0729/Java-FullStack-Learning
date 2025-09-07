P1: Write a program which creates a class "Student" with the following 
	Data Members rollNum, studName, mark1, mark2, mark3, totalMarks 
	Methods setStudDetails() - which sets the values to all the data members except totalMarks.
	calculate Total() - which calculate the total Marks
	displayStudDetails() - which displays rollNum, studName and totalMarks
Create a class StudentDemo to test the functionality of Student class

CODE:

package myProject;

class Student {
	
	// Data members
	int rollNum;
	String stdName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;
	
	// Methods
	void setStudDetails() {
		rollNum = 101;
		stdName = "Aditya";
		mark1 = 96;
		mark2 = 94;
		mark3 = 85;
	}
	
	void calculateTotal() {
		totalMarks = mark1 + mark2 + mark3;
	}
	
	void displayStudDetails() {
		System.out.println("Roll Number: "+rollNum);
		System.out.println("Student Name: "+stdName);
		System.out.println("Total Marks: "+totalMarks);
	}
}

public class StudentDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setStudDetails();
		s.calculateTotal();
		s.displayStudDetails();
	}
}
