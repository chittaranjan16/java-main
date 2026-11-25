package Collection.Stack;

// stack implementation using linked list
//filo lifo

class Node{
    Node next;
    Object data;

    Node(Object data){
        this.data=data;
    }

    Node(Object data,Node next){
        this.next=next;
        this.data=data;
    }
}

public class stackLL {

    Node head;
    int count;

    public void push(Object ele){
        if(head == null){
            head = new Node(ele,head);
            count++;
            return;
        }

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }

        curr.next = new Node(ele,null);
        count++;
    }

    // removes and return last element
    public Object pop(){
        Node curr = head;
        while (curr.next.next != null){
            curr = curr.next;
        }

        Object temp = curr.next.data;
        curr.next = null;
        count--;

        return temp;
    }

    // return last element
    public Object peek(){
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }

        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }

        return curr.data;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return head == null;
    }

    // to retrieve element from index
    public Object get(int in){
        if(in < 0 || in >= size()){
            throw new IndexOutOfBoundsException();
        }

        Node curr = head;
        for(int i = 0 ; i < in ; i++){

            curr=curr.next;
        }

        return curr.data;
    }

    public void display(){
        for(int i = 0 ; i < size() ; i++){

            System.out.print(get(i) + " <- ");
        }
    }
}


class test1{
    public static void main(String[] args) {

        stackLL stack = new stackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();

        System.out.println();

        System.out.println("pop element : " + stack.pop());

        stack.push(50);
        System.out.println("peek element : " + stack.peek());
        System.out.println("size : " + stack.size());
        System.out.println(stack.isEmpty());

        stack.display();
    }
}