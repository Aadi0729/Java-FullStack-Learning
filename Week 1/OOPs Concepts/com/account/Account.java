package com.account;

public class Account {
	
	int acctId;
	String acctType;
	int acctBalance;
	
	// Constructor
	public Account(int acctId, String acctType, int acctBalance) {
		this.acctId = acctId;
		this.acctType = acctType;
		this.acctBalance = acctBalance;
	}
	
	// Methods
	public void deposit(int amount) {
		if(amount > 0) {
			acctBalance += amount;
			System.out.println("Successfully deposited: " + amount);
		}
		else {
			System.out.println("Invalid deposit amount!");
		}
	}
	
	public void withdraw(int amount) {
		if(amount > 0 && amount <= acctBalance) {
			acctBalance -= amount;
			System.out.println("Successfully withdrawn: " + amount);
		}
		else {
			System.out.println("Insufficient balance!");
		}
	}
	
	public int getBalance() {
		return acctBalance;
	}
	
	public void display() {
		System.out.println("Account Id: "+acctId);
		System.out.println("Account Type: "+acctType);
		System.out.println("Account Balance: "+acctBalance);
	}
}
