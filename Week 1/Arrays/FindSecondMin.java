package myProject;
import java.util.Scanner;

public class FindSecondMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("Enter the elements in array: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
		for( int val : arr) {
			if(val < min) {
				secondMin = min;
				min = val;
			}
			else if(val < secondMin && val < min) {
				secondMin = val;
			}
		}
		
		System.out.print("The minimum value in array: "+min);
		System.out.println();
		if(secondMin == Integer.MAX_VALUE)
				System.out.print("The second minimum in array doesn't exist.");
		else
			System.out.print("The second minimum in array is: "+secondMin);
	}
}
