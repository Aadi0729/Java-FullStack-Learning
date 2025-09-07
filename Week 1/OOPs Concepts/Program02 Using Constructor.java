package myProject;

class Account1 {
	
	// Data members
	int accountNo;
	String accountType;
	int accountBalance;
	
	// Parameterized Constructor
	Account1(int accountNo, String accountType, int accountBalance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	void withdraw(int amount) {
		if(amount > 0 && amount <= accountBalance) {
			accountBalance -= amount;
		}
		else {
			System.out.println("Insufficient Balance!");
		}
	}
	
	void deposit(int amount) {
		if(amount > 0) {
			accountBalance += amount;
		}
		else {
			System.out.println("Invalid deposit amount!");
		}
	}
	
	void dispAccountDetails() {
		System.out.println("Account Number: "+accountNo);
		System.out.println("Account Type: "+accountType);
		System.out.println("Account Balance: "+accountBalance);
	}
}
public class Main2 {
	public static void main(String[] args) {
		Account1 a = new Account1(12345432, "Savings", 5000000);
		Account1 b = new Account1(12324565, "Fixed Deposit", 400000);
		
		a.withdraw(4000000);
		a.dispAccountDetails();
		
		b.deposit(10000);
		b.dispAccountDetails();
	}
}
