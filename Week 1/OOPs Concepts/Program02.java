P2: Create a class Account with the attributes accountNo - int, accountType - String, accountBalance - int and methods setAccountDetails() which set the values to these 
attributes, withdraw() which subtracts the given amount from the available balance, deposit() which adds given amount to the available balance and dispAccountDetails() 
which displays accountNo, accountType, accountBalance. Create a class Main1 which contains main() method to test the functionality of Account class.

CODE:

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
public class Main1 {
	public static void main(String[] args) {
		Account a = new Account();
		a.setAccountDetails();
		a.withdraw(50000);
		a.deposit(10000);
		a.dispAccountDetails();
	}
}
