package myProject;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Which numbers table you want to write ? ");
		int num = sc.nextInt();
		
		printTable(num);
	}
	
	static void printTable(int n) {
		for(int i=1; i<=10; i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}
}
