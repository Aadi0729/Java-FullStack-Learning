package Day03.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(100);

        BankAccount savingsAccount1 = new SavingsAccount();
        savingsAccount1 = new CurrentAccount();
        savingsAccount1.deposit(200);
    }
}
