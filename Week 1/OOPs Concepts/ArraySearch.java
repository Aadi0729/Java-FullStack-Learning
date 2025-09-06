package myProject;
import java.util.Scanner;

public class ArraySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.print("Enter the elements: ");
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int key = 5;
		
		boolean res = linearSearch(arr, key);
		
		if(res) {
			System.out.print("Key found!");
		}
		else {
			System.out.print("Key not found!");
		}
	}
	
	 /*Method name should not be same as the class name,
	otherwise, compiler thinks that we are trying to define a constructor*/
	
	static boolean linearSearch(int arr[], int key) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == key)
					return true;
		}
		return false;
	}
}
