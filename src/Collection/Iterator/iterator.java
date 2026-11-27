package Collection.Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(50);

        Iterator<Integer> i = hs.iterator();

        while (i.hasNext()) {
            Integer n = i.next();
            if (n.equals(20)) {
                i.remove();
            } else {
                System.out.println(n);
            }
        }

        System.out.println(i.hasNext());// false

        // iterator works on all sub-classes

        // hasNext()    --> it check if element is present or not next. true / false
        // next()       --> it returns cursor value
        // remove()     --> it removes the element
    }
}