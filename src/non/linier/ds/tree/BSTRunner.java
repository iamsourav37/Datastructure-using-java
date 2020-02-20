package non.linier.ds.tree;

public class BSTRunner {
    public static void main(String[] args) {
        BinarySearchTreeNode root = null;
        BST a = new BST();

        root = a.insert(root,18);
        root = a.insert(root,20);
        root = a.insert(root,2);
        root = a.insert(root,16);
        root = a.insert(root,5);
        root = a.insert(root,50);
        root = a.insert(root,414);

        System.out.println(a.findMaximum(root).getData());

        BinarySearchTreeNode t = a.delete(root,414);
        System.out.println(a.findMaximum(root).getData());
        System.out.println(t.getData());
        System.out.println(root.getData());













    }
}
