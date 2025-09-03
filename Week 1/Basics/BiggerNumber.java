package myProject;
import java.util.Scanner;

public class BiggerNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter n1: ");
		int n1 = s.nextInt();
		
		System.out.print("Enter n2: ");
		int n2 = s.nextInt();
		
		System.out.print("Enter n3: ");
		int n3 = s.nextInt();
		
		int maxNum = (n1 > n2) ? ((n1 > n3) ? n1 : n2) : ((n2 > n3) ? n2 : n3);
		
		System.out.println(maxNum+" is greater among the three given numbers");
	}
}
