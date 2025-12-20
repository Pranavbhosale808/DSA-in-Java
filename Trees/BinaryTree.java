package Trees;

class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }

}

public class BinaryTree {
    Node root;
    int count = 0;
    int result ;

    Node insert(Node root, int data) {
        if (root == null)
            return null;

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    void preorder(Node root) {
        if (root == null)
            return;

        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }

    void inorder(Node root) {
        if (root == null)
            return;

        preorder(root.left);
        System.out.println(root.data + " ");
        preorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    void findkthlargest(Node root, int k) {

        if (root == null)
            return;

        findkthlargest(root.right, k);

        count++;
        if (count == k) {
            result = root.data;
            return;
        }

        findkthlargest(root.left, k);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = tree.insert(tree.root, 10);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 5);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 12);

        // System.out.print("Inorder: ");
        // tree.inorder(tree.root);
        // System.out.println(" ");

        tree.findkthlargest(tree.root,3);
        System.out.println("Largest element is : " + tree.result);
    }
}
