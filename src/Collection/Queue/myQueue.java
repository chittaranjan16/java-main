package Collection.Queue;

import java.util.Arrays;

public class myQueue {
    private Object[] arr = new Object[10];
    private int index = 0;

    // Add element to back of queue
    public void enqueue(Object ele) {
        if (index >= arr.length) {
            increase();
        }
        arr[index] = ele;
        index++;
    }

    private void increase() {
        Object[] temp = new Object[(arr.length * 3) / 2 + 1];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }


    // Remove and return front element
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        Object front = arr[0];

        // Shift remaining active elements left by 1
        for (int i = 0; i < index - 1; i++) {
            arr[i] = arr[i + 1];
        }

        index--;
        arr[index] = null; // clear duplicate reference at old tail
        return front;
    }

    // View front element without removing
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return arr[0];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    public Object[] toArray() {
        return Arrays.copyOf(arr, index);
    }

}


class test{
    public static void main(String[] args) {

        myQueue queue = new myQueue();


        queue.enqueue(10);            //first
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);            //last


        System.out.println("Queue contents: " + Arrays.toString(queue.toArray()));
        System.out.println("Front (peek): " + queue.peek());                      // 10
        System.out.println("Size: " + queue.size());                              // 4

        // Dequeue FIFO order
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Dequeued: " + queue.dequeue()); // 20
        System.out.println("After two dequeues: " + Arrays.toString(queue.toArray()));
    }
}