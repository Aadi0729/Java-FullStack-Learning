package myProject;
import java.util.Scanner;

public class FindSecondMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("Enter the elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
		for(int val : arr) {
			if(val > max) {
				secondMax = max; // Old max becomes secondMax
				max = val;
			}
			else if(val > secondMax && val < max) {
				secondMax = val;
			}
		}
		
		System.out.print("The maximum number in array is: "+max);
		System.out.println();
		if(secondMax == Integer.MIN_VALUE)
				System.out.print("The second maximum number in array doesn't exist.");
		else
			System.out.print("The second maximum number in array is: "+secondMax);
	}
}
