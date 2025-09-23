// Wap to reverse every word from the given line of text.

package week3;
import java.util.Scanner; 

public class Program10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text: ");
		String str = sc.nextLine();
		
		String[] words = str.trim().split("\\s+");
		
		StringBuilder result = new StringBuilder();
		for(String s : words) {
		    result.append(new StringBuilder(s).reverse().toString()).append(" ");
//			System.out.print(s+" ");
		}
		
		System.out.println(result.toString().trim());
		
		sc.close();
	}
}
