package array.stack;

// Stack using Linked list

public class LStack {
    private LinkedStack head;
    private int size;

    public LStack(){ // constructor
        this.head = null;
        this.size = 0;
    }

    public void push(int data){
        LinkedStack stack = new LinkedStack();
        stack.setData(data);
        stack.setNext(head);
        head = stack;
        this.size++;
    }
    public int pop(){
        if(head==null)
        {
            System.out.println("Stack is underflow");
            return -1;
        }
        else{
            int data = head.getData();
            head = head.getNext();
            this.size--;
            return data;
        }
    }
    public int peek(){
        if(head==null)
        {
            System.out.println("Stack is underflow");
            return -1;
        }
        else{
            return this.head.getData();
        }
    }

    public void show(){
        if(head==null){
            System.out.println("Zero elements, Stack is underflow");
        }
        else{
            LinkedStack tmp = head;
            while (tmp != null){
                System.out.println(tmp.getData());
                tmp = tmp.getNext();
            }
        }
    }
    public int getSize(){
        return this.size;
    }


}
