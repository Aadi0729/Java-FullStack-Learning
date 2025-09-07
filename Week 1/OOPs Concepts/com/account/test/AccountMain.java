package com.account.test;
import java.util.Scanner;
import com.account.Account;

public class AccountMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ch, balance;
		
		Account a = new Account(123, "Savings", 150000);
		
		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			
			System.out.println("Choose an option: ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("Enter the amount to deposit: ");
			    int depAmount = sc.nextInt();
				a.deposit(depAmount); break;
				
			case 2: System.out.println("Enter the amount to withdraw: ");
			    int wAmount = sc.nextInt();
				a.withdraw(wAmount); break;
			case 3: System.out.println("---------Display Full Account Details--------");
			        a.display();
			        System.out.println("---------------------------------------------");
			break;
			case 4: System.out.println("Thank you for Banking!"); break;
			default: System.out.println("Invalid choice!");
			}
		} while(ch != 4);
		
		
	}
}
