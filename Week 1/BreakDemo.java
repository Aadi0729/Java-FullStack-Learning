package myProject;
import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		int sum = 0;
		
		while(true) // Infinite loop
		{
			System.out.print("Enter the number: "); // To stop, enter 0
			num = sc.nextInt();
			
			if(num == 0)
					break;
			
			sum += num;
		}
		
		System.out.print("Sum: "+sum);
	}
}
