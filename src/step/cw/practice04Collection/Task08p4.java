package step.cw.practice04Collection;

import java.util.TreeSet;

public class Task08p4 {
    public static void main(String[] args) {
        TreeSet<Integer> list = StaticMethods.getBigRandomTreeSet(10000);

        int temp;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            temp = list.pollLast();
            list.add(temp);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
