package array.stack;

public class LinkedStack {
    private int data;
    private LinkedStack next;

    public void setData(int data){
        this.data = data;
    }
    public void setNext(LinkedStack next){
        this.next = next;
    }
    public int getData(){
        return this.data;
    }
    public LinkedStack getNext(){
        return this.next;
    }
}
