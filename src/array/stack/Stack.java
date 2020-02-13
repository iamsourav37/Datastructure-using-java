package array.stack;

public class Stack {
    private int size = 8;
    private int top = -1;
    private int stack_array[] = new int[size];

    private boolean isFull(){
        if(this.top==size-1)
            return true;
        else
            return false;
    }
    private boolean isEmpty(){
        if(this.top==-1)
            return true;
        else
            return false;
    }
    public void push(int data){
        if(this.isFull())
            System.out.println("Stack overflow");
        else{
            top++;
            this.stack_array[this.top] = data;
        }
    }
    public void pop(){
        if(this.isEmpty())
            System.out.println("Stack underflow");
        else{
            int poped_data = this.stack_array[this.top];
            this.top--;
            System.out.println("Poped element : "+poped_data);
        }
    }
    public int peek(){
        if(this.isEmpty())
            return -1;
        else{
            return this.stack_array[this.top];
        }
    }
    public void show(){
        if(this.isEmpty())
            System.out.println("Stack underflow");
        else{
            System.out.println("\n****STACK ELEMENTS ARE****");
            for(int i=this.top; i>=0; i--)
                System.out.println(stack_array[i]);
            System.out.println("\n**************************");
        }
    }




}
