package BinaryTreePkg;

public class Runner {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(20);
        bt.insert(30);
        bt.insert(10);
        bt.insert(6);
        bt.insert(50);
        bt.insert(40);

        bt.inOrderTraversal();
        System.out.println();
        bt.preOrderTraversal();
        System.out.println();
        bt.postOrderTraversal();
    }
}
