package myProject;
import java.util.Scanner;

public class SumArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("Enter the elements in array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int val : arr) {
			sum += val;
		}
		
		System.out.print("The sum of array elements is: "+sum);
	}
}
