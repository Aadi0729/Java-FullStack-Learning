package myProject;
import java.util.Scanner;

public class SumNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("How many numbers you want to sum up ? ");
		n = sc.nextInt();
		
		int i = 1;
		
		int sum = 0;
		
		while(i <= n) {
			System.out.print("Enter the next number: ");
			int num = sc.nextInt();
			
			sum += num;
			
			i++;
		}
		
		System.out.print("The sum of numbers is: "+sum);
	}
}
