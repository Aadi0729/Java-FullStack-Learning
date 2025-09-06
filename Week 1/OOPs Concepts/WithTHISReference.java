package myProject;

class Employee {
	
	// Data members
	int empNum;
	String empName;
	double empSalary;

	// When the DATA MEMBERS names and ARGUMENTS names are same, How to differentiate is: By using keyword: THIS
	
	// Methods
	void setEmpDetails(int empNum, String empName, double empSalary) {
		this.empNum = empNum;
		this.empName = empName;
		this.empSalary = empSalary;
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
		e1.setEmpDetails(101, "Rahul", 150000.0);
		e1.displayEmpDetails();
		
		Employee e2 = new Employee();
		e2.setEmpDetails(102, "John", 140000.0);
		e2.displayEmpDetails();
	}
}
