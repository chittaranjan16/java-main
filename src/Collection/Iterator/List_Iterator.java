package Collection.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("java");
        ll.add("is");
        ll.add("very");
        ll.add("easy!");

//        ll.remove();
//        ll.set(ll.size()-1,"python");

        ListIterator<String> i = ll.listIterator(ll.size());


        while (i.hasPrevious()){                                   //print backward
            System.out.println(i.previous());
        }

        System.out.println("---------------------------------");

        while (i.hasNext()){                                      // print forward
            System.out.println(i.next());
            System.out.println(i.previousIndex());               // returns the index

        }


        // cam be used in only list.

        // add()
        // hasNext()  , hasPrevious()
        // next() , previous()
        // remove() , set()
    }
}
