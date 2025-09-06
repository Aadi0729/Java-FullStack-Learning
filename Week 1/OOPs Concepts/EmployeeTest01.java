package myProject;

class Employee {
	
	// Data members
	int empNum;
	String empName;
	double empSalary;
	
	// Methods
	void setEmpDetails() {
		empNum = 101;
		empName = "Rahul";
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
		
		/*
		 * Whenever the new object is created for a class then it allocates new memory
		 * for all data members of the class and the values in data members are default
		 * values
		 */
		Employee e1 = new Employee();
		e1.displayEmpDetails();
	}
}
