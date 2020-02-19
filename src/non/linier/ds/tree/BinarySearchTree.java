package non.linier.ds.tree;

public class BinarySearchTree {
    private int data;
    private BinarySearchTree left;
    private BinarySearchTree right;

    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public void setLeft(BinarySearchTree left){
        this.left = left;
    }
    public BinarySearchTree getLeft(){
        return this.left;
    }




}
