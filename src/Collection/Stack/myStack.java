package Collection.Stack;

import java.util.Arrays;

public class myStack {
    private Object[] arr = new Object[10];
    private int index = 0;

    // Add element to top of stack
    public void push(Object ele) {
        if (index >= arr.length) {
            increase();
        }
        arr[index] = ele;
        index++;
    }

    private void increase() {
        int newCapacity = (arr.length * 3) / 2 + 1;
        Object[] temp = new Object[newCapacity];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }



    // Remove and return top element
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        index--;
        Object top = arr[index];
        arr[index] = null; // avoid memory retention
        return top;
    }


    //View top element without removing
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return arr[index - 1];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    // Return a copy containing only pushed elements
    public Object[] toArray() {
        return Arrays.copyOf(arr, index);
    }


}

class test {
    public static void main(String[] args) {
        myStack stack = new myStack();

        stack.push(10);
        stack.push(20);
        stack.push("thirty");
        stack.push(40);


        System.out.println(Arrays.toString(stack.toArray())); // [10, 20, thirty, 40]
        System.out.println("Top: " + stack.peek());           // Top: 40
        System.out.println("Popped: " + stack.pop());         // Popped: 40
        System.out.println(Arrays.toString(stack.toArray())); // [10, 20, thirty]
    }
}