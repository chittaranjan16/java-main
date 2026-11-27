package Collection.Linkedlist.Doubly;

//  difference between singly and doubly ll is that doubly can [two way - travarsel]

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

    public boolean isEmpty(){
        return (head==null && tail==null);
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


    //remove from last
    public Object removeLast(){
        Object removed = tail.data;

        if(head == tail){
            head = null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
        count--;
        return removed;
    }

    // remove from front
    public Object removeFront(){
        Object removed = head.data;

        if(head == tail){
            head = null;
            tail=null;
        }

        else {
            head=head.next;
            head.prev=null;
        }
        count--;
        return removed;
    }


    //remove from particular index
    public void remove(int in){
        Node curr = head;
        for(int i = 0 ; i<in ; i++ ){
            curr=curr.next;
        }
        curr.prev.next=curr.next;
        //10.next=30;
        curr.next.prev=curr.prev;
        //30.prev=10;
    }

    void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+ " <-> ");

            temp = temp.next;
        }
        System.out.println("Null");
    }

    void displayReverse(){
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
    }
}

class test{
    public static void main(String[] args) {

        myDoubleLL dll = new myDoubleLL();
        dll.addLast(30);
        dll.addLast(40);
        dll.addLast(50);

        dll.addFront(20);
        dll.addFront(10);

        dll.add(35,3);

        dll.display();

        dll.removeLast();
        dll.remove(1);

        dll.display();
        System.out.println(dll.isEmpty());

        dll.displayReverse();
    }
}
