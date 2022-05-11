package dmdev.java2.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTheory {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6); // immutable collection
        List<Integer> list2 = new ArrayList<>(list);

        //only for read!!!
        for (Integer val : list) {
            System.out.print(val);
        }
        System.out.println();

        //how does it work?
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
          System.out.print(iterator.next());
        }
        System.out.println();

        for (Iterator<Integer> iterator2 = list.iterator(); iterator2.hasNext();) {
            System.out.print(iterator2.next());
        }
        System.out.println();

        for (Iterator<Integer> iterator3 = list2.iterator(); iterator3.hasNext();) {
            Integer next = iterator3.next();
            if(next == 3 || next == 4) {
                iterator3.remove();
            }
        }
        System.out.println(list2);
    }
}

