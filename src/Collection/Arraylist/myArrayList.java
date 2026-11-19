
package Collection.Arraylist;

public class myArrayList {

    Object[] arr = new Object[10];
    int index = 0;

    // Add element at the end
    public void add(Object ele) {

        if(index >= arr.length) {
            increase();
        }

        arr[index] = ele;
        index++;
    }

    // Increase array capacity
    private void increase() {

        Object[] temp = new Object[(arr.length * 3) / 2 + 1];

        for(int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp;
    }

    // Return size
    public int size() {
        return index;
    }

    // Check whether empty
    public boolean isEmpty() {
        return size() == 0;
    }

    // Get element
    public Object get(int in) {

        if(in < 0 || in >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        return arr[in];
    }

    // Update element
    public void set(int in, Object newValue) {

        if(in < 0 || in >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        arr[in] = newValue;
    }

    // Add element at particular index
    public void add(int in, Object ele) {

        if(in < 0 || in > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if(index >= arr.length) {
            increase();
        }

        for(int i = size(); i > in; i--) {
            arr[i] = arr[i-1];
        }

        arr[in] = ele;
        index++;
    }


    //remoove element
    public void remove(int in){
        if(in < 0 || in >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }

        for(int i = in ; i < size()-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[size()-1] = null;
        index--;
    }

    // Display elements
    public void display() {

        for(int i = 0; i < size(); i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}









// Test class
class Test {

    public static void main(String[] args) {

        myArrayList as1 = new myArrayList();

        as1.add(10);
        as1.add(20);
        as1.add(40);

        as1.add(2, 30);

        as1.add(50);
        as1.remove(1);

        as1.display();

        System.out.println("Size: " + as1.size());
        System.out.println("Element: " + as1.get(2));
        System.out.println("Empty: " + as1.isEmpty());
    }
}
