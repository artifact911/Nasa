package step.cw.practice04Collection;

import java.util.Deque;

public class Task08p3 {
    public static void main(String[] args) {
        Deque<Integer> list = StaticMethods.getBigRandomDeque(10000);

        //int temp;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            /*temp = list.pollLast();
            list.addFirst(temp);*/
            list.addFirst(list.pollLast());
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
