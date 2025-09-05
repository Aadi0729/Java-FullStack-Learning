package myProject;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int prod = factorial(num);
		
		System.out.print("The factorial of "+num+" is "+prod);
	}
	
	static int factorial(int n) {
        int prod = 1;
		
		for(int i=n; i>1; i--) {
			prod *= i;
		}
		
		return prod;
	}
}

// A static method can access only other static members directly
