package Collection.Linkedlist.Double;

class Node{
    Node prev;
    Object data;
    Node next;

    Node(Object data){
        this.data=data;
    }

    Node(Node prev ,Object data ,Node next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }

}
public class myDoubleLL {

    Node head;
    Node tail;
    int count;


    // addLast in start
    public void addFront(Object ele){
        Node newNode = new Node(ele);

        if(head==null & tail==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.next=head;
            head.prev=newNode;

            head=newNode;
        }
        count++;
    }

    //addLast in end
    public void addLast(Object ele){
        Node newNode = new Node(ele);

        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }
        else {
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        }
        count++;
    }

    public int size(){
        return count;
    }

    //add element at particular index;
    public void add(Object ele, int in){
        if(in < 0 || in > size()){
            throw new IndexOutOfBoundsException();
        }

        if (in == 0) {
            addFront(ele);
            return;
        }

        if (in == size()) {
            addLast(ele);
            return;
        }

        Node temp = head;
        for (int i = 0; i < in; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(temp.prev, ele, temp);
        temp.prev.next = newNode;
        temp.prev = newNode;
        count++;
    }


    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " <-> ");

            temp = temp.next;
        }
        System.out.println("Null");
    }
}



class test{
    public static void main(String[] args) {

        myDoubleLL dll = new myDoubleLL();
        dll.addLast(10);
        dll.addLast(20);
        dll.addLast(50);
        dll.addFront(30);
        dll.addFront(40);
        dll.display();
    }
}
