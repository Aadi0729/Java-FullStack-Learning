package myProject;

class Customer {
	
	int custId;
	String custName;
	String custAddress;
	
	Customer(int custId, String custName, String custAddress) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	
	void display() {
		System.out.println("Customer Id: "+custId);
		System.out.println("Customer Name: "+custName);
		System.out.println("Customer Address: "+custAddress);
	}
}

class Accounts {
	
	int acctId;
	String acctType;
	Customer customer;
	int acctBalance;
	
	Accounts(int acctId, String acctType, Customer customer, int acctBalance) {
		this.acctId = acctId;
		this.acctType = acctType;
		this.customer = customer;
		this.acctBalance = acctBalance;
	}
	
	void display() {
		System.out.println("Account Id: "+acctId);
		System.out.println("Account Type: "+acctType);
		System.out.println("Account Balance: "+acctBalance);
		
		System.out.println("--------Customer Details--------");
		customer.display();
	}
}

public class Program04 {
	public static void main(String[] args) {
		Customer c = new Customer(1, "Rakesh", "Street no 123, Ashok Nagar");
		
		Accounts a = new Accounts(1234, "Savings", c, 50000);
		a.display();
	}
}
