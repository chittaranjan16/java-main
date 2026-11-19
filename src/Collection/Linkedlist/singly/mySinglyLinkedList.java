package Collection.Linkedlist.singly;

class Node{

    Node next;
    Object data;

    Node(Object data , Node next){
        this.data=data;
        this.next=next;
    }
}
public class mySinglyLinkedList {

    Node head;
    int count;

    //to add element
    public void add(Object ele){
        if(head==null){
            addFirst(ele);
            return;
        }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(ele,null);
        count++;
    }


    public void addFirst(Object ele){
        head = new Node(ele,head);
        count++;
    }

    public int size(){
        return count;
    }


    // add at particular index
    public void add(int in, Object ele){
        if(in < 0 || in >= size()){
            throw new IndexOutOfBoundsException();
        }

        if(in == 0){
            addFirst(ele); return;
        }

        Node temp = head;
        for(int i = 1 ; i < in ; i++){
            temp=temp.next;
        }

        temp.next = new Node(ele,temp.next);
        count++;
    }


    // to retrieve element from index
    public Object get(int in){
        if(in < 0 || in >= size()){
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        for(int i = 0 ; i < in ; i++){

            temp= temp.next;
        }
        return temp.data;
    }

    //update element
    public void set(int in , Object ele){
        if(in < 0  || in >= size() ){
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        for(int i = 0 ; i < in ; i++){
            temp=temp.next;
        }
        temp.data=ele;
    }


    //remove
    public void remove(int in){
        if(in < 0 || in >= size() ){
            throw new IndexOutOfBoundsException();
        }

        if(in == 0){
            head= head.next;
            return;
        }

        Node temp = head;

        for(int i = 1 ; i < in ; i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        count--;
    }


    //display
    public void display(){
        for(int i = 0 ; i < size() ; i++){

            System.out.print(get(i) + " ");
        }
    }


}


class Test{
    public static void main(String[] args) {

        mySinglyLinkedList list= new mySinglyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.add(2,"add value");
        list.set(2,"new value");

        list.remove(list.size()-1);
        list.remove(2);

        System.out.println("Size: " + list.size());
        System.out.println("Element at: " + list.get(1));
        list.display();


    }
}