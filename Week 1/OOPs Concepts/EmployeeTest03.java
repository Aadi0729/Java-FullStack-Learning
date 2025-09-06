package myProject;

class Employee {
	
	// Data members
	int empNum;
	String empName;
	double empSalary;

	/*
	 * When we are assigning values directly to the data members inside a method,
	 * this type of coding we call as HARD CODED DATA
	 * 
	 * When we go with HARD CODED DATA, How many objects we create, when we call
	 * setEmpDetails() method. these values will remain same for all objects, which 
	 * is not good in reality.
	 * 
	 * SOLUTION:
	 * By sending data to the methods in the form of "arguments" -->> REFER EmployeeTest04.java
	 */
	
	// Methods
	void setEmpDetails() {
		empNum = 101;
		empName = "Rahul"; // HARD CODED DATA
		empSalary = 150000.0;
	}
	
	void displayEmpDetails() {
		System.out.println("Employee Number= "+empNum);
		System.out.println("Employee Name= "+empName);
		System.out.println("Employee Salary= "+empSalary);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
//		e1.setEmpDetails();
		e1.displayEmpDetails();
		
		Employee e2 = new Employee();
//		e2.setEmpDetails();
		e2.displayEmpDetails();
	}
}
