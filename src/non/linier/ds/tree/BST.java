package non.linier.ds.tree;

public class BST {


    public BinarySearchTreeNode insert(BinarySearchTreeNode root,int data){
        if(root==null){
            BinarySearchTreeNode node = new BinarySearchTreeNode();
            node.setData(data);
            node.setLeft(null);
            node.setRight(null);
            return node;
        }
        else{
            if(data<root.getData()){
                root.setLeft(insert(root.getLeft(),data));
            }
            if(data>root.getData()){
                root.setRight(insert(root.getRight(),data));
            }
        }
        return root;
    }

    public BinarySearchTreeNode search(BinarySearchTreeNode root,int data){
        if(root==null)
            return null;
        else if(root.getData()>data)
            return search(root.getRight(),data);
        else if(root.getData()<data)
            return search(root.getLeft(),data);
        return root;
    }
    public BinarySearchTreeNode findMinimum(BinarySearchTreeNode root){
        if(root==null)
            return null;
        else if(root.getLeft() != null)
            return findMinimum(root.getLeft());
        return root;
    }
    public BinarySearchTreeNode findMaximum(BinarySearchTreeNode root){
        if(root==null)
            return null;
        else if(root.getRight() != null)
            return findMaximum(root.getRight());
        return root;
    }

    public BinarySearchTreeNode delete(BinarySearchTreeNode root, int data){
        if(root==null)
            System.out.println("No such element");
        else if(data < root.getData())
            root.setLeft(delete(root.getLeft(),data));
        else if(data > root.getData() )
            root.setRight(delete(root.getRight(),data));
        else{ // element found

            if( root.getLeft() != null && root.getRight() != null ){
                // Both the child element exists
                BinarySearchTreeNode tmp;
                tmp = this.findMaximum(root.getLeft());
                root.setData(tmp.getData());
                root.setLeft(this.delete(root.getLeft(),root.getData()));
            }
            else{ // Only one child or no child
                if(root.getLeft() == null)
                    root = root.getRight();
                else if(root.getRight() == null)
                    root = root.getLeft();
            }


        }// end of else

        return root;
    }

    public void inOrder(BinarySearchTreeNode root){
        if(root == null)
            return;
        inOrder(root.getLeft());
        System.out.print(root.getData()+" ");
        inOrder(root.getRight());
    }
    public void preOrder(BinarySearchTreeNode root){
        if(root == null)
            return;
        System.out.print(root.getData()+" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public void postOrder(BinarySearchTreeNode root){
        if(root == null)
            return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData()+" ");
    }

    public boolean isPresent(BinarySearchTreeNode root,int value){
        if(root == null)
            return false;

        boolean isPresent = false;

        while(root != null){

            if(value < root.getData())
                root = root.getLeft();
            else if(value > root.getData())
                root = root.getRight();
            else{
                isPresent = true;
                break;
            }


        }
        return isPresent;

    }

    public BinarySearchTreeNode getParentNode(BinarySearchTreeNode root,int data){
        if(root == null)
            return null;
        BinarySearchTreeNode tmp = null;
        while(root != null){
            if(data < root.getData()){
                tmp = root;
                root = root.getLeft();
            }
            else if(data > root.getData()){
                tmp = root;
                root = root.getRight();
            }
            else{ // element found
                break;
            }
        }
        return root != null ? tmp : null;
    }


}
