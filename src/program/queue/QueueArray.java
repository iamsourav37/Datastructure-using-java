package program.queue;

public class QueueArray {
    private int FIXED_SIZE = 5;
    private int queue_array[] = new int[FIXED_SIZE];
    private int rear = -1;
    private int front = -1;
    private int size = 0;

    private boolean isEmpty(){
        if(front==-1 || rear==front)
            return true;
        else
            return false;
    }
    private boolean isFull(){
        if(rear==FIXED_SIZE-1)
            return true;
        else
            return false;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(this.front==-1)
            this.front++;
        this.rear++;
        this.queue_array[this.rear] = data;
        this.size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data = this.queue_array[front];
        this.front++;
        this.size--;
        return data;
    }
    public void show(){
        if(isEmpty()){
            System.out.println("Queue is empty, nothing to show");
            return;
        }
        System.out.println("*************");
        for (int i=front;i<=rear; i++)
            System.out.println(this.queue_array[i]);
        System.out.println("*************");
    }
    public int getSize(){
        if(isEmpty())
            return 0;
        else
            return size;
    }


}
