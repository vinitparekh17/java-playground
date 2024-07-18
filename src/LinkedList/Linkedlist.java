package LinkedList;

public class Linkedlist {
    private Node head;

    public Linkedlist() {}

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void show() {
        Node current = head;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }

        System.out.println(current.data); // Will print last elm. coz loop won't
    }

    public void insertAtHead(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtHead(data);
        } else {

            Node newNode = new Node();
            newNode.data = data;

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node prev;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            prev = current.next;
            current.next = prev.next;
        }
    }
}
