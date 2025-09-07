package myProject;

class Account {
	
	// Data members
	int accountNo;
	String accountType;
	int accountBalance;
	
	// Methods
	void setAccountDetails() {
		accountNo = 12345678;
		accountType = "Savings";
		accountBalance = 5000000;
	}
	
	void withdraw(int amount) {
		if(amount < accountBalance)
			accountBalance -= amount;
	}
	
	void deposit(int amount) {
		accountBalance += amount;
	}
	
	void dispAccountDetails() {
		System.out.println("Account Number: "+accountNo);
		System.out.println("Account Type: "+accountType);
		System.out.println("Account Balance: "+accountBalance);
	}
}
public class Main1 {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountDetails();
		a.withdraw(50000);
		a.deposit(10000);
		a.dispAccountDetails();
	}
}
