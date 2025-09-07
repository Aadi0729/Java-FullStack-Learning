P1: Write a program which creates a class "Student" with the following 
	Data Members rollNum, studName, mark1, mark2, mark3, totalMarks 
	Methods setStudDetails() - which sets the values to all the data members except totalMarks.
	calculate Total() - which calculate the total Marks
	displayStudDetails() - which displays rollNum, studName and totalMarks
Create a class StudentDemo to test the functionality of Student class

CODE:

package myProject;

class Student1 {
	// Data members
		int rollNum;
		String stdName;
		int mark1;
		int mark2;
		int mark3;
		int totalMarks;
		
		// Parameterized Constructor
		Student1 (int rollNum, String stdName, int mark1, int mark2, int mark3) {
			this.rollNum = rollNum;
			this.stdName = stdName;
			this.mark1 = mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;
			
			totalMarks = mark1 + mark2 + mark3;
		}
		
		void displayStudDetails() {
			System.out.println("Roll Number: "+rollNum);
			System.out.println("Student Name: "+stdName);
			System.out.println("Total Marks: "+totalMarks);
		}
}

public class Program03 {
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(101, "Aditya", 97, 98, 87);
		Student1 s2 = new Student1(102, "Rahul", 94, 86, 65);
		
		s1.displayStudDetails();
		
		s2.displayStudDetails();
	}
}
