package dmdev.java2.iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorTheory {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

//        for (Integer val : list) {
//            System.out.println(val);
//        }

        // how does it work?

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
