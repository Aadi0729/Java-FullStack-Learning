package myProject;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		int prod = 1;
		
		for(int i=num; i>1; i--) {
			prod *= i;
		}
		
		System.out.print("The factorial of "+num+" is "+prod);
	}
}
