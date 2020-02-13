package list.linked.doubly;

public class DoublyLinkedList {
    Node head;
    public DoublyLinkedList(){
        this.head = null;
    }


    public void insertFirst(int data){
        Node node = new Node();
        node.data = data;
        node.next = head;
        node.prev=null;
        head = node;
    }
    public void insertLast(int data){
        if(head==null)
            this.insertFirst(data);
        else{
            Node node = new Node();
            node.data = data;
            node.next = null;
            Node tmp = head;
            while(tmp.next != null)
                tmp = tmp.next;
            tmp.next = node;
            node.prev = tmp;
        }

    }
    public void insertAt(int index,int data){
        if(index==1)
            this.insertFirst(data);
        else if(index==this.size()+1)
            this.insertLast(data);
        else if(index>this.size() || index<0)
            System.out.println("Index is out of range");
        else{
            Node node = new Node();
            node.data = data;
            Node tmp = head;
            for(int i=1;i<index-1;i++)
                tmp = tmp.next;
            node.next = tmp.next;
            tmp.next.prev = node;
            node.prev = tmp;
            tmp.next = node;
        }
    }

    public void show(){
        if(head==null)
            System.out.println("List is empty");
        else{
            Node tmp = head;
            while(tmp != null){
                System.out.println(tmp.data);
                tmp = tmp.next;
            }
        }
    }
    public int size(){
        if(head==null)
            return 0;
        else{
            Node tmp = head;
            int count =  0;
            while(tmp != null){
                count += 1;
                tmp = tmp.next;
            }
            return count;
        }
    }


}
