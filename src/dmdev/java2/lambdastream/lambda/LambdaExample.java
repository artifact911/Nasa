package dmdev.java2.lambdastream.lambda;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {

/*        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };*/
        // перепишем с возможностями лямбды

        Comparator<Integer> comparator = Integer::compare;

        System.out.println(comparator.compare(25, 100));
    }
}
