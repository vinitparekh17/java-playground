package LinkedList;


public class Runner {
    public static void main(String[] args) {
        Linkedlist linkedlist = new Linkedlist();
        linkedlist.insert(5);
        linkedlist.insert(10);
        linkedlist.insert(15);

        linkedlist.insertAtHead(3);

        linkedlist.insertAt(1, 11);

        linkedlist.deleteAt(1);

        linkedlist.show();
    }
}
