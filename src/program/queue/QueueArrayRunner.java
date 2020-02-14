package program.queue;

public class QueueArrayRunner {
    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(12);
        q.enqueue(21);
        q.enqueue(25);
        q.enqueue(29);

        q.show();
        System.out.println("Delete data is : "+q.dequeue());
        System.out.println("Delete data is : "+q.dequeue());
        System.out.println("Delete data is : "+q.dequeue());
        System.out.println("Delete data is : "+q.dequeue());
        q.show();


    }
}
