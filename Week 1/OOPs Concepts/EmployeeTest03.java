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
		
		Employee e1 = new Employee();
//		e1.setEmpDetails();
		e1.displayEmpDetails();
		
		Employee e2 = new Employee();
//		e2.setEmpDetails();
		e2.displayEmpDetails();
	}
}
