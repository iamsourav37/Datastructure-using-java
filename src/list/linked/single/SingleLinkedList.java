package list.linked.single;

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

        if(index>this.size()+1 || index<0){
            System.out.println("Insertion is not possible, index is out of range");
        }
        else if(index==1){
            Node node = new Node();
            node.setData(data);
            node.setNext(head);
            head = node;
            // Or we can call insertAtStart() method
            // this.insertAtStart(data);
        }
        else if(index==this.size()+1)
            this.insertAtLast(data); // index value is size+1 then we insert the node at last
        else{
            Node node = new Node();
            node.setData(data);
            Node tmp = head;
            for (int i = 1; i < index-1; i++) {
                tmp = tmp.getNext();
            }
            node.setNext(tmp.getNext());
            tmp.setNext(node);

        }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head = head.getNext();
        }
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
        }
        else if(this.size() == 1){
            head = null;
        }
        else{
            Node temp=head,second_last=null;
            while(temp.getNext() != null){
                second_last = temp;
                temp = temp.getNext();
            }
            second_last.setNext(null);
        }
    }
    public void deleteAt(int index){

        if(index<0 || index>this.size())
            System.out.println("Delete is not possible, index is out of range");
        else if(index==1)
            this.deleteFirst();
        else if(index==this.size()){
            this.deleteLast();
        }
        else{
            Node tmp = head;
            for (int i=1;i<index-1;i++)
                tmp = tmp.getNext();
            tmp.setNext(tmp.getNext().getNext());
        }

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
