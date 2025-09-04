package myProject;
import java.util.Scanner;

public class smallestNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int min = 100000;
		
		while(i <= 10) {
			System.out.print("Enter the number: ");
			int num = sc.nextInt();
			
			if(num < min) {
				min = num;
			}
		}
		
		System.out.print("The smallest num is: "+min);
	}
}
