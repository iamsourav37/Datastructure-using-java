package array.stack;

public class DStack {
    private int capacity = 1;
    private int top = -1;
    private int stack_array[] = new int[capacity];

    private boolean isFull(){
        if(top==capacity-1)
            return true;
        else
            return false;
    }
    private boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }
    public int totalElements(){
        if(this.isEmpty())
            return 0;
        else
            return top+1;
    }
    public int sizeOfStackArray(){
        return this.capacity;
    }

    public void push(int data){
        if( this.isFull() )
            this.expand();
        top++;
        stack_array[top] = data;
    }
    private void expand() {
        int current_length = this.totalElements();
        this.capacity *= 2;
        int tmp_stack[] = new int[capacity];
        for(int i=0; i<current_length; i++){
            tmp_stack[i] = this.stack_array[i];
        }
        this.stack_array = tmp_stack;
    }
    public int pop(){
        if(isEmpty())
            return -1;
        else{
            int poped_data = this.stack_array[top];
            this.top--;
            if(this.capacity==1){
                /*
                         nothing to do, Finally fixed the bug
                         if the value of capacity is 1 then we dont want to call the shrink function
                         because shrink function delete the stack array
                 */
            }
            else if(top+1==capacity/2){
                this.shrink();
            }
            return poped_data;
        }
    }
    private void shrink() {
        this.capacity = this.capacity / 2;
        int tmp_stack[] = new int[this.capacity];
        for(int i=0; i<this.capacity; i++){
            tmp_stack[i] = this.stack_array[i];
        }
        this.stack_array = tmp_stack;
    }

    public int peek(){
        if(isEmpty())
            return -1;
        else
            return stack_array[top];
    }
    public void show(){
        if(this.isEmpty())
            System.out.println("Stack is underflow");
        else{
            for(int i=this.top; i>=0; i--)
                System.out.print(this.stack_array[i]+" | ");
            System.out.println();
        }
    }



}
