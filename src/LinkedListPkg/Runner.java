package LinkedListPkg;

public class Runner {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();
        linkedlist.insert(5);
        linkedlist.insert(10);
        linkedlist.insertAtHead(3);
        linkedlist.insertAt(1, 11);
        linkedlist.deleteAt(1);
        linkedlist.show();
    }
}
