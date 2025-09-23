package week3;
import java.util.Scanner;

public class Program08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text: ");
		String s = sc.nextLine();
		
		int vowelCount = 0;
		int consoCount = 0;
		
		String[] words = s.trim().split("\\s+");
		
		for(int ch : s.toCharArray()) {
			
			ch = Character.toLowerCase(ch);
			
			if(ch >= 'a' && ch <= 'z') {
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowelCount++;
				}
				else {
					consoCount++;
				}
			}
		}
		
		System.out.println("Vowels= "+vowelCount);
		System.out.println("Consonants= "+consoCount);
		System.out.println("Words= "+words.length);
		
		sc.close();
	}
}
