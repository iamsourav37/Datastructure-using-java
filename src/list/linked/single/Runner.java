package list.linked.single;

public class Runner {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertAtStart(12);
        list.insertAtLast(123);
        list.insertAtLast(124);
        list.insertAtLast(125);
        list.insertAtLast(126);
        list.insertAtStart(2);
        list.insertAt(7,5555);
        list.insertAt(8,6556);
        list.insertAt(9,9596);

        list.deleteFirst();
        list.deleteLast();
        list.deleteAt(6);

        list.show();
        System.out.println("Total size of the list is "+list.size());
    }

}
