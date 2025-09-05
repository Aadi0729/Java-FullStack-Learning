package myProject;
import java.util.Scanner;

public class NumberFactorialTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, i = 1;
		
		System.out.print("How many numbers factorial you want to print ? ");
		n = sc.nextInt();
		
		System.out.print("Number"+"   ");
		System.out.println("Factorial");
		while(i <= n) {
			
			int fact = 1;
			for(int j=i; j>1; j--) {
				fact *= j;
			}
			
			System.out.println("  "+i+"   "+"      "+fact);
			
			i++;
		}
	}
}
