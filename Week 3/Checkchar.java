package week3;
import java.util.Scanner;

public class Checkchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character: ");
		char ch = sc.next().toLowerCase().charAt(0);
		
		if(Character.isAlphabetic(ch)) {
			switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': System.out.println("Given character is a Vowel."); break;
			default : System.out.println("Given character is a Consonant.");
			}
		}
		else {
			System.out.println("Given character is not an alphabet.");
		}
	}
}
