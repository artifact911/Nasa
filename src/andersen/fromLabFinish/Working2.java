package andersen.fromLabFinish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Working2 {
    public static void main(String[] args) {
        final List<Integer> sourceList = new ArrayList<>(Arrays.asList(0, 303, 7, -201, 211, -14, 91, 16, -2));

        System.out.println(Arrays.toString(changeNegativeElements(sourceList).toArray()));
        System.out.println(Arrays.toString(changeAllNumbers(sourceList).toArray()));
    }

    public static List<Integer> changeNegativeElements(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();

        for (Integer value : list) {
            if (value < 0) {
                newList.add(value * -1);
            } else {
                newList.add(value);
            }
        }
        return newList;
    }

    public static List<Integer> changeAllNumbers(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();

        for (Integer value : list) {
            if (value % 2 == 0) {
                newList.add(value * 100);
            } else {
                newList.add(value - 100);
            }
        }
        return newList;
    }
}
