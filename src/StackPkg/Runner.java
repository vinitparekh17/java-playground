package StackPkg;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek());

        stack.show();

        System.out.println("\nDeleted: "+stack.pop());

        System.out.println("Peek: "+stack.peek());

        System.out.println("Size: "+stack.size());

        DStack dynamicStack = new DStack();

        dynamicStack.push(10);
        dynamicStack.push(20);
        dynamicStack.push(44);

        System.out.println(dynamicStack.peek());
        System.out.println(dynamicStack.pop());

        dynamicStack.show();
    }
}
