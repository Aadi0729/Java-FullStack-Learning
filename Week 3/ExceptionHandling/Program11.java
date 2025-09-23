package week3;

class WithdrawException extends Exception {
	
	WithdrawException(String msg) {
		super(msg);
	}
	
	WithdrawException() {}
}

class Account {
	void withdraw(double amount, double balance) throws WithdrawException{
		if(amount > balance)
			throw new WithdrawException("Insufficient Balance");
		else
			System.out.println("Balance now: "+(balance-amount));
	}
}

public class Program11 {
	public static void main(String[] args) {
		Account a = new Account();
		try {
			a.withdraw(9000.0, 8000.0);
		} catch (WithdrawException e) {
//			System.err.println(e);
//			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
