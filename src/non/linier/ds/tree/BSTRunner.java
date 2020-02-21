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


        System.out.println(a.findMaximum(root).getData());
        System.out.println(a.findMinimum(root).getData());

        System.out.println("Root right data : "+root.getRight().getData());
        // deleting 20
        root = a.delete(root,20);
        System.out.println("After deleteing 20, now right data is : "+root.getRight().getData());

        // deleting 19
        root = a.delete(root,19);
        System.out.println("After deleteing 19, root right data is : "+root.getRight().getData());

        // deleting 26
        root = a.delete(root,26);
        System.out.println("After deleteing 26, maximum value is : "+a.findMaximum(root).getData());

        // deleting 2
        root = a.delete(root,2);
        System.out.println("After deleteing 2, minimum value is : "+a.findMinimum(root).getData());


        a.delete(root,121);












    }
}
