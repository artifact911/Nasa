package step.cw.practice04Collection;

import java.util.*;

public class Task06 {
    public static void main(String[] args) {
        List<Integer> arrayList = StaticMethods.getBigRandomArrayList(1000000);
        List<Integer> linkedList = StaticMethods.getBigRandomLinkedList(1000000);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            arrayList.get(new Random().nextInt(arrayList.size()));
        }
        long finish = System.currentTimeMillis();

        System.out.println("ArrayList: " + (finish - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            linkedList.get(new Random().nextInt(linkedList.size()));
        }
        finish = System.currentTimeMillis();

        System.out.println("LinkedList: " + (finish - start));


    }


}
