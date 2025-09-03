package myProject;
import java.util.Scanner;

public class checkVowelConsonant {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the character: ");
		char ch = s.next().charAt(0);f
		
		if(ch >= 'a' && ch <= 'z') {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch+" is a vowel");
			}
			else {
				System.out.println(ch+" is a consonant");
			}
		}
		else {
			System.out.println(ch+" is neither vowel not consonant");
		}
	}
}
