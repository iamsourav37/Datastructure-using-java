package list.linked.doubly;

public class Runner {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertLast(353);
         list.insertFirst(12);
         list.insertFirst(21);

         list.insertFirst(33);


         list.show();

        System.out.println("Total node in Doubly Linked List is : "+list.size());

    }
}
