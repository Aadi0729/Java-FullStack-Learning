package myProject;
import java.util.Scanner;

public class checkNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		if(num > 0) {
			System.out.print(num+" is positive.");
		}
		else if(num < 0) {
			System.out.print(num+" is negative.");
		}
		else {
			System.out.print(num+" is zero.");
		}
	}
}
