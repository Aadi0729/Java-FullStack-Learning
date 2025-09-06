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
