/*
 Task:
 - Use the Calculator class from package myPackage1 in another package.

 Implementation:
 - Import myPackage1.Calculator.
 - Create an object and call add() and multiply() methods.

 Key Learning:
 - How to use the import statement to access a class from another package.
 - How to organize Java code across multiple packages.
*/

package myPackage2;
import myPackage1.Calculator;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int addRes = calc.add(10, 20);
		int multiplyRes = calc.multiply(10, 20);
		
		System.out.println("Addition: " + addRes);
		System.out.println("Multiplication: " + multiplyRes);
	}
}
