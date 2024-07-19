package QueuePkg;

public class Queue {
    private final int[] queue = new int[10];
    private int front;
    private int rear;
    private int size;

    public void enqueue(int item) throws IllegalStateException {
        if(!isFull()) {
            queue[rear] = item;
            rear = (rear + 1) % queue.length;
            size++;
        } else {
            throw new IllegalStateException("Queue is full");
        }
    }

    public int dequeue() throws IllegalStateException {
        if(!this.isEmpty()) {
            int item = queue[front];
            front = (front + 1) % queue.length;
            size--;
            return item;
        } else {
            throw new IllegalStateException("Queue is empty");
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }

    public boolean isFull() {
        return this.getSize() == queue.length;
    }

    public void show() {
        System.out.print("Queue : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[front + i] + " ");
        }
        System.out.println();
    }
}
