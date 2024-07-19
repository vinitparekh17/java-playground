package StackPkg;

import java.util.EmptyStackException;

public class Stack {
    final int[] stack = new int[10];
    int top;

    public void push(int x) throws StackOverflowError {
        if (top != stack.length) {
            stack[top] = x;
            top++;
        } else {
            throw new StackOverflowError();
        }
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
        return stack[--top];
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
    }
}
