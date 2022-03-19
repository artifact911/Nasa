package step.cw.practice04Collection.task09;

import java.util.*;

public class BoxWork {
    public static void main(String[] args) {
        List<Box> boxList = getListOfBox(5);
        showListSortByComparator(boxList);
        Collections.sort(boxList);
        System.out.println("Sorted by Collections.sort:" + '\n' + boxList);
        TreeSet<Box> boxTreeSet = new TreeSet<>();
        boxTreeSet.addAll(boxList);
        System.out.println("Sorted by TreeSet" + '\n' + boxTreeSet);
    }

    protected static ArrayList<Box> getListOfBox(int length) {
        ArrayList<Box> boxArrayList = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            boxArrayList.add(new Box((int) (1 + Math.random() * 10), (int) (1 + Math.random() * 10),
                    (int) (1 + Math.random() * 10)));
        }
        System.out.println("Source: " + '\n' + boxArrayList);
        return boxArrayList;
    }

    protected static void showListSortByComparator(List<Box> boxList) {
        boxList.sort(new Comparator<Box>() {
            @Override
            public int compare(Box o1, Box o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("Sorted by comparator:" + '\n' + boxList);
    }
}
