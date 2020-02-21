package non.linier.ds.tree;

public class BSTRunner {
    public static void main(String[] args) {
        BinarySearchTreeNode root = null;
        BST a = new BST();

        root = a.insert(root,18);
        root = a.insert(root,5);
        root = a.insert(root,2);
        root = a.insert(root,20);
        root = a.insert(root,22);
        root = a.insert(root,19);
        root = a.insert(root,26);
        root = a.insert(root,21);
        root = a.insert(root,3);
        root = a.insert(root,23);
        root = a.insert(root,1);
        root = a.insert(root,4);

        System.out.println("Inorder travarsal : ");
        a.inOrder(root);
        System.out.println("\nPreorder travarsal : ");
        a.preOrder(root);
        System.out.println("\nPostorder travarsal : ");
        a.postOrder(root);












    }
}
