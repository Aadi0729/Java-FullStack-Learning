package Day03.abstraction;

public class CurrentAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        System.out.println("Deposited");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawn");
    }
}
