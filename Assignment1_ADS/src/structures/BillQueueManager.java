package structures;
public class BillQueueManager {
    private class Node {
        String bill;
        Node next;
        Node(String bill) { this.bill = bill; }
    }

    private Node front, rear;

    public void enqueue(String bill) {
        Node newNode = new Node(bill);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public String dequeue() {
        if (front == null) return null;
        String data = front.bill;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }
}