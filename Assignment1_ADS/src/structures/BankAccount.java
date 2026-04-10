package structures;
public class BankAccount {
    public String accountNumber;
    public  String username;
    public  double balance;

    public BankAccount(String accountNumber, String username, double balance) {
        this.accountNumber = accountNumber;
        this.username = username;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return username + " – Balance: " + balance;
    }
}