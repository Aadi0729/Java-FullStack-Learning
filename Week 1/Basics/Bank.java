package myProject;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance, amount, ch;
		
		System.out.print("Enter the balance: ");
		balance = sc.nextInt();
		
		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.print("Enter the amount to be deposited: ");
					amount = sc.nextInt();
					balance = amount + balance;
					break;
			case 2: System.out.print("Enter the amount to be withdrawn: ");
					amount = sc.nextInt();
					if(amount > balance)
						System.out.print("Insufficient balance!");
					else
						balance = balance - amount;
					break;
			case 3: System.out.print("Balance = "+balance); break;
			case 4: System.out.println("Thank you for Banking"); break;
			default: System.out.print("Invalid Choice!");
			}
		} while(ch != 4);
	}
}
