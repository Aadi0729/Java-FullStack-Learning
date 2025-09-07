/*
 Task:
 - Create two packages and use a class from one package in another.

 Implementation:
 - This Calculator class provides two methods: add() and multiply().
 - It belongs to package myPackage1.

 Key Learning:
 - How to define a class inside a package.
*/

package myPackage1;

public class Calculator {
	
	public int add(int n1, int n2) {
		
		return n1+n2;
	}
	
	public int multiply(int n1, int n2) {
		
		return n1*n2;
	}
}
