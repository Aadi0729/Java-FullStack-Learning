package myProject;
import java.util.Scanner;

public class ItemDetails {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the item number: ");
		int item_Number = s.nextInt();
		
		s.nextLine();
		
		System.out.print("Enter the item name: ");
		String item_Name = s.nextLine();
		
		System.out.print("Enter the item rate: ");
		int item_Rate = s.nextInt();
		
		System.out.print("Enter the number of items: ");
		int quantity = s.nextInt();
		
		int amount = item_Rate * quantity;
		
		// DISPLAY THE ITEM DETAILS
		System.out.println("Details of Item:");
		System.out.println("Item Number: "+item_Number);
		System.out.println("Item Name: "+item_Name);
		System.out.println("Amount of the Item: "+amount);
		
	}

}
