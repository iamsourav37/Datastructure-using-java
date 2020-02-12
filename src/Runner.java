public class Runner {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insertAtStart(12);
        list.insertAtStart(2);
        list.insertAtLast(123);
        list.insertAt(3,222);


        list.show();
        System.out.println("Total size of the list is "+list.size());
    }

}
