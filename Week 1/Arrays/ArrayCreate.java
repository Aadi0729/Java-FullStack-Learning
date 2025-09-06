package myProject;
import java.util.Scanner;

public class ArrayCreate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int arr[];
		
		arr = new int[n];
		
		System.out.print("Enter the elements in array: ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Printing the elements using traditional for loop
		System.out.print("The array looks like: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		// Printing the elements using foreach loop - added in Java 5 version
		System.out.print("The array looks like: ");
		for(int val : arr)
			System.out.print(val+" ");
		
	}
}
