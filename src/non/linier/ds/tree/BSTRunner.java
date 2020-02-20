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

        BinarySearchTreeNode min = a.findMinimum(root);
        BinarySearchTreeNode max = a.findMaximum(root);

        System.out.println("Minimum value : "+min.getData());
        System.out.println("Maximum value : "+max.getData());

        System.out.println("Experiment : "+root.getLeft().getRight().getLeft().getLeft());











    }
}
