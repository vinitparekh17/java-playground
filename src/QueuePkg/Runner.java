package QueuePkg;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);


        System.out.println("Removing : "+queue.dequeue());
        System.out.println("Removing : "+queue.dequeue());

        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.enqueue(8);

        queue.show();
        System.out.println("Size : "+queue.getSize());
    }
}
