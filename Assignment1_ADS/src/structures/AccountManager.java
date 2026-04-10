package structures;

public class AccountManager {
    private class Node {
        BankAccount account;
        Node next;
        Node(BankAccount account) { this.account = account; }
    }

    private Node head;

    public void addAccount(BankAccount account) {
        Node newNode = new Node(account);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }
    }

    public void displayAll() {
        Node temp = head;
        if (temp == null) System.out.println("No accounts found.");
        int i = 1;
        while (temp != null) {
            System.out.println(i++ + ". " + temp.account);
            temp = temp.next;
        }
    }

    public BankAccount findAccount(String username) {
        Node temp = head;
        while (temp != null) {
            if (temp.account.username.equalsIgnoreCase(username)) return temp.account;
            temp = temp.next;
        }
        return null;
    }
}