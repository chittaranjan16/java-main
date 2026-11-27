package Collection.Set;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}


class HashSet {
    Node[] arr = new Node[10];
    int count = 0;

    public boolean add(int key)
    {
        int index = key % 10;

        if (arr[index] == null) {
            arr[index] = new Node(key, null);
            count++;
            return true;
        }
        Node curr = arr[index];
        while (curr.next != null) {
            if (curr.data == key)
                return false;
            curr = curr.next;
        }
        curr.next = new Node(key, null);
        count++;
        return true;
    }

    public int size() {
        return count;
    }

    public void display() {
        for (int i = 0; i < arr.length; i++) {

            Node curr = arr[i];
            while (curr != null) {
                System.out.println(curr.data);
                curr = curr.next;
            }
        }
    }
    public void remove(int key)
    {
        int index=key%10;
        if(arr[index]!=null)
        {
            if(arr[index].data==key)
            {
                arr[index]=arr[index].next;
                count--;
                return;
            }
        }
        Node prev=arr[index];
        Node curr=arr[index].next;
        while(curr!=null)
        {
            if(curr.data==key)
            {
                prev.next=prev.next.next;
                count--;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }

    public boolean contains(int key)
    {
        for (int i = 0; i < arr.length; i++) {

            Node curr = arr[i];
            while (curr != null) {
                if(curr.data==key)
                    return true;
                curr = curr.next;
            }
        }
        return false;
    }
}

public class Test1 {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(38);
        hs.add(10);
        hs.add(7);
        hs.add(11);
        hs.add(50);

//        hs.remove(7);
//        hs.remove(10);
//        hs.remove(38);
//        hs.addLast(58);
//        hs.addLast(98);
//        hs.remove(58);
        hs.display();
//        System.out.println(hs.contains(98));
    }

}