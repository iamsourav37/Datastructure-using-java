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
                    return root.getRight();
                else if(root.getRight() == null)
                    return root.getLeft();
            }


        }// end of else

        return root;
    }


}
