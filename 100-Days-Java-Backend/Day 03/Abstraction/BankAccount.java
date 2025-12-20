package Day03.abstraction;

// Can't be instantiated
abstract public class BankAccount {
    private String accountNumber;
    private double balance;

    // No need of implementation here
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
