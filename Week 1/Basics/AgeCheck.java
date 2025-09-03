package myProject;
import java.util.Scanner;

public class AgeCheck {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("You are major!");
		}
		else if(age > 0 && age < 18) {
			System.out.println("You are minor!");
		}
		else {
			System.out.println("Invalid age!");
		}
	}
}
