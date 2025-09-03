package myProject;
import java.util.Scanner;

public class BiggestNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int i = 1;
		int max = 0;
		
		while(i <= 10) {
			System.out.print("Enter the num: ");
			int n = s.nextInt();
			
			if(n > max) {
				max = n;
			}
			
			i++;
		}
		
		System.out.print("The biggest number among given numbers is: "+max);
		
	}
}
