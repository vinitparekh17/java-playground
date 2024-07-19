package StackPkg;

import java.util.EmptyStackException;

public class DStack {
    int capacity = 2;
    int[] stack = new int[capacity];
    int top;

    public void push(int x) {
        if (this.size() == capacity) {
            this.expand();
        }
        stack[top] = x;
        top++;
    }

    private void expand() {
        int size = this.size();
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, size);
        stack = newStack;
        capacity *= 2;
    }

    public void shrink() {
        if (this.size() <= (capacity / 2)) {
            capacity /= 2;
        }
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, capacity);
        stack = newStack;
    }

    public int peek() {
        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        this.shrink();
        return stack[--top];
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}

