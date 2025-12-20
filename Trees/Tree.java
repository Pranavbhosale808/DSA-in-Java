package Trees;

class Node {
    public int data;
    public Node leftchild;
    public Node rightchild;

    public Node(int data) {
        this.data = data;
        leftchild = null;
        rightchild = null;
    }

}

public class Tree {

    Node root;

    Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.leftchild = insert(root.leftchild, val);
        } else {
            root.rightchild = insert(root.rightchild, val);
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.leftchild);
        System.out.print(root.data + " ");
        inorder(root.rightchild);
    }

    void postorder(Node root){
        if(root==null){
            return;
        }

        postorder(root.leftchild);
        postorder(root.rightchild);
        System.out.print(root.data + " ");
    }

    void preorder(Node root){
        if(root==null) return;

        System.out.print(root.data + " ");
        preorder(root.leftchild);
        preorder(root.rightchild);
    }

    void findkthlarget(int k){
        if(root==null) return;

        

    }

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.root = tree.insert(tree.root, 10);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 8);
        tree.insert(tree.root, 55);
        tree.insert(tree.root, 12);

        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Preorder: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Postorder ");
        tree.postorder(tree.root);
        System.out.println();

    }
}
