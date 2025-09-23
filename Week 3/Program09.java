package week3;
import java.util.Scanner;

public class Program09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text : ");
		String s = sc.nextLine();
		
		s = s.replaceAll("[^a-zA-Z]", ""); // keep only letters
		
		String reversed = new StringBuilder(s).reverse().toString();
		
		if(s.equalsIgnoreCase(reversed)) {
			System.out.println("The string is a Palindrome.");
		}
		else {
			System.out.println("The string is not a Palindrome.");
		}
		
		sc.close();
	}
}
