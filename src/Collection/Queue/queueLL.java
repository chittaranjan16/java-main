package Collection.Queue;

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

    // add element in last
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
        Object temp = head;
        head = head.next;

        return temp;
    }

    // returm first element
    public Object peek(){
        return head.data;
    }

}


class test1{
    public static void main(String[] args) {

        queueLL queue = new queueLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());

        queue.dequeue();
        System.out.println(queue.peek());
    }
}
