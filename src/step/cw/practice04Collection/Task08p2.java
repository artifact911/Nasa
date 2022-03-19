package step.cw.practice04Collection;

import java.util.List;

public class Task08p2 {
    public static void main(String[] args) {
        List<Integer> list = StaticMethods.getBigRandomArrayList(10000);

        int temp;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            temp = list.remove(list.size() - 1);
            list.add(0, temp);
        }
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
