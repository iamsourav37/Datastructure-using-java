public class SingleLinkedList {
    Node head;

    public void insertAtStart(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(head);
        head = node;

    }
    public void insertAtLast(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(null);

        if(head==null)
            head = node;
        else{
            Node temp = head;
            while(temp.getNext() != null)
                temp = temp.getNext();
            temp.setNext(node);
        }
    }
    public void insertAt(int index,int data){
        Node node = new Node();
        node.setData(data);

        Node tmp = head;
        for (int i = 0; i < index-1-1; i++) {
            tmp = tmp.getNext();
        }
        node.setNext(tmp.getNext());
        tmp.setNext(node);
    }
    public void show(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            while(temp != null){
                System.out.println(temp.getData());
                temp = temp.getNext();
            }
        }
    }
    public int size(){
        if(head==null)
            return 0;
        else{
            int count = 0;
            Node tmp = head;
            while(tmp != null){
                count += 1;
                tmp = tmp.getNext();
            }


            return count;
        }
    }
}
