package BinaryTreePkg;

public class BinaryTree {
    private Node root;

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            root = insertRecursively(root, data);
        }
    }

    public Node insertRecursively(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        } else if (data < root.data) {
            root.left = insertRecursively(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursively(root.right, data);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursively(root);
    }

    public void inOrderTraversalRecursively(Node root) {
        if (root != null) {
            inOrderTraversalRecursively(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRecursively(root.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversalRecursively(root);
    }

    private void preOrderTraversalRecursively(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversalRecursively(root.left);
            preOrderTraversalRecursively(root.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRecusively(root);
    }

    private void postOrderTraversalRecusively(Node root) {
        if (root != null) {
            postOrderTraversalRecusively(root.left);
            postOrderTraversalRecusively(root.right);
            System.out.print(root.data + " ");
        }
    }
}
