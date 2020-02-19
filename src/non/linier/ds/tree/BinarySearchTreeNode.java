package non.linier.ds.tree;

public class BinarySearchTreeNode {
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public void setLeft(BinarySearchTreeNode left){
        this.left = left;
    }
    public BinarySearchTreeNode getLeft(){
        return this.left;
    }
    public void setRight(BinarySearchTreeNode right){
        this.right = right;
    }
    public BinarySearchTreeNode getRight(){
        return this.right;
    }




}
