package list.linked.single;

public class Node {
    private int data;
    private Node next;

    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return this.data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return this.next;
    }

}
