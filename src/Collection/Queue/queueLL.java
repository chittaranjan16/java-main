package Collection.Queue;

//queue implementation using linked list
//fifo

class Node{
    Node next;
    Object data;

    Node(Object data, Node next){
        this.next=next;
        this.data=data;
    }
}

public class queueLL {
    Node head;
    int count;

    // addLast element in last
    public void enqueue(Object ele){
        if(head == null){
            head = new Node(ele,null);
            count++;
            return;
        }

        Node curr = head;
        while (curr.next != null){
            curr=curr.next;
        }
        curr.next=new Node(ele,null);
        count++;
    }

    public int size(){
        return count;
    }

    // remove and return first element
    public Object dequeue(){
        Object temp = head.data;
        head = head.next;

        count--;
        return temp;
    }

    // returm first element
    public Object peek(){
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        return head.data;
    }

    public boolean isEmpty(){
        return head==null;
    }



    //display
    public void display() {
        if (head == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" <- ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
}


class test1{
    public static void main(String[] args) {

        queueLL queue = new queueLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());

        queue.display();

        queue.dequeue();
        System.out.println(queue.peek());

        queue.display();
        System.out.println(queue.size());
    }
}
