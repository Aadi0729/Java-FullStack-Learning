package myProject;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = s.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num+" is an even number.");
		}
		else {
			System.out.println(num+" is an odd number.");
		}
	}

}
