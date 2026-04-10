import java.util.Scanner;
import java.util.Scanner;
import structures.AccountManager;
import structures.TransactionsManager; // проверь, чтобы имя файла было точно таким же
import structures.BillQueueManager;
import structures.BankAccount;

public class Main {
    public static void main(String[] args) {
        AccountManager accManager = new AccountManager();
        TransactionsManager history = new TransactionsManager();
        BillQueueManager bills = new BillQueueManager();
        Scanner sc = new Scanner(System.in);

        // Task 6: Physical Data Structure (Array)
        BankAccount[] fixedAccounts = new BankAccount[3];
        fixedAccounts[0] = new BankAccount("001", "Ali", 150000);
        fixedAccounts[1] = new BankAccount("002", "Sara", 220000);
        fixedAccounts[2] = new BankAccount("003", "Ivan", 50000);

        while (true) {
            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Add Account\n2. Display Accounts\n3. Deposit\n4. Transaction History\n5. Process Bill\n6. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Balance: "); double bal = sc.nextDouble();
                    accManager.addAccount(new BankAccount("ID", name, bal));
                    System.out.println("Account added!");
                    break;
                case 2:
                    accManager.displayAll();
                    break;
                case 3:
                    System.out.print("Username: "); String u = sc.nextLine();
                    BankAccount a = accManager.findAccount(u);
                    if (a != null) {
                        System.out.print("Amount: "); double amt = sc.nextDouble();
                        a.balance += amt;
                        history.push("Deposit " + amt + " to " + u);
                        System.out.println("Success! New balance: " + a.balance);
                    }
                    break;
                case 4:
                    System.out.println("Last action: " + history.peek());
                    break;
                case 5:
                    System.out.print("Bill name: ");
                    bills.enqueue(sc.nextLine());
                    System.out.println("Bill added to queue.");
                    break;
                case 6:
                    return;
            }
        }
    }
}