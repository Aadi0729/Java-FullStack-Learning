package myProject;
import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int number = num;
		
		int sum = 0;
		while(num > 0) {
			int n = num%10;
			sum += n;
			num /= 10;
		}
		
		System.out.print("The sum of digits of a number "+number+" is "+sum);
	}
}
