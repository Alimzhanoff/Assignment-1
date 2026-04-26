package structures;

public class TransactionsManager {
    private class Node {
        String data;
        Node next;
        Node(String data) { this.data = data; }
    }

    private Node top;


    public void push(String action) {
        Node newNode = new Node(action);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (top == null) return "History is empty";
        String data = top.data;
        top = top.next;
        return data;
    }

    public String peek() {
        return (top != null) ? top.data : "No transactions";
    }
}