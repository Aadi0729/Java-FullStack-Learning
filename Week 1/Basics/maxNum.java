package myProject;
import java.util.Scanner;

public class maxNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = s.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = s.nextInt();
		
		System.out.print("Enter the third number: ");
		int num3 = s.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1+" is maximum among three numbers.");
		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println(num2+" is maximum among three numbers.");
		}
		else {
			System.out.println(num3+" is maximum among three numbers.");
		}
}
}
