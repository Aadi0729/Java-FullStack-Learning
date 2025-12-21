package Day03.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {

        SavingsAccount savingsAccount = new SavingsAccount("hfhnbnsnsnd", 60000.0);
        savingsAccount.deposit(100);

        BankAccount savingsAccount1 = new SavingsAccount("hfhnbnsnsnd", 60000.0);
        savingsAccount1.deposit(300);
        savingsAccount1 = new CurrentAccount("ahdjrdjvjne", 10000.0);
        savingsAccount1.deposit(200);

        System.out.println(savingsAccount1.getAccountNumber());
    }
}
