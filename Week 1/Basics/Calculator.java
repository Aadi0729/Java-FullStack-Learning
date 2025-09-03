package myProject;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter n1: ");
		int n1 = s.nextInt();
		
		System.out.print("Enter n2: ");
		int n2 = s.nextInt();
		
		int result = 0;
		
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		
		System.out.print("Enter your choice: ");
		int ch = s.nextInt();
		
		switch(ch) {
		case 1: result = n1 + n2; break;
		case 2: result = n1 - n2; break;
		case 3: result = n1 * n2; break;
		case 4: result = n1 / n2; break;
		default: System.out.println("Invalid choice");
		System.exit(ch); // Comes out of the program
		}
		
		System.out.println("Result: "+result);
	}
}
