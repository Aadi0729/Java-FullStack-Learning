/*With this code, we get the output as "default values".
REASON:
	When we are sending the value 101 to the argument empNum,
	It allocates a memory for the argument "empNum", these arguments are like
	LOCAL VARIABLES,
	So when the value of empName is assigned to empName, it goes to same memory location
	which is allocated to the argument "empNum", its not going to the data members 
	and same goes for all.

 SOLUTION: Use This Reference --> REFER WithTHISReference.java
*/

package myProject;

class Employee {
	
	// Data members
	int empNum;
	String empName;
	double empSalary;
	
	/*
	 * SOLUTION:
	 * By sending data to the methods in the form of "arguments"
	 */
	
	/*
	 * Whatever the data members names we have taken, If we have to use the same
	 * names for the arguments also like instead of
	 * 
	 * eno --> empNum 
	 * eName --> empName 
	 * eSalary --> empSalary
	 */
	
	// Methods
	void setEmpDetails(int empNum, String empName, double empSalary) {
		empNum = empNum;
		empName = empName;
		empSalary = empSalary;
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
