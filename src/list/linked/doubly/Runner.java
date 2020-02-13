package list.linked.doubly;

public class Runner {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
         list.insertFirst(12);
         list.insertFirst(21);
         list.insertFirst(33);
         list.insertLast(121);
         list.insertLast(353);
         list.insertLast(442);
         list.insertAt(1,101111111);
         list.deleetAt(3);
         list.deleetAt(1);
         list.deleetAt(5);
         list.deleteLast();
         list.deleetAt(3);
         list.insertLast(321);
         list.insertLast(298);
         list.insertLast(449);
         list.search(321);
         list.show();
        System.out.println("Total node in Doubly Linked List is : "+list.size());

    }
}
