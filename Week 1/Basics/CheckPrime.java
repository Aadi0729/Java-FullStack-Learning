package myProject;
import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.print("Enter the number: ");
		n = sc.nextInt();
		
		int flag = 1;
		
		for(int i=2; i<=n-1; i++) {
			if(n%i == 0) {
				flag = 0;
				break;
			}
		}
		
		if(flag == 1)
				System.out.print("The number is prime.");
		else
			System.out.print("The number is not prime.");
	}
}
