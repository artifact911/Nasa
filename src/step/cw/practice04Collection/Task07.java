package step.cw.practice04Collection;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Task07 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        List<Integer> arrayList = StaticMethods.getBigRandomArrayList(1000000);
        long finish = System.currentTimeMillis();
        System.out.println("Created ArrayList: " + (finish - start));
        System.out.println("Searching ArrayList: " + StaticMethods.searchCollectionTime(arrayList));
        System.out.println("Deleting ArrayList: " + StaticMethods.deleteCollectionTime(arrayList));
        System.out.println();

        start = System.currentTimeMillis();
        List<Integer> linkedList = StaticMethods.getBigRandomLinkedList(1000000);
        finish = System.currentTimeMillis();
        System.out.println("Created LinkedList: " + (finish - start));
        System.out.println("Searching LinkedList: " + StaticMethods.searchCollectionTime(linkedList));
        System.out.println("Deleting LinkedList: " + StaticMethods.deleteCollectionTime(linkedList));
        System.out.println();

        start = System.currentTimeMillis();
        HashSet<Integer> hashSet = StaticMethods.getBigRandomHashSet(1000000);
        finish = System.currentTimeMillis();
        System.out.println("Created HashSet: " + (finish - start));
        System.out.println("Searching HashSet: " + StaticMethods.searchCollectionTime(hashSet));
        System.out.println("Deleting HashSet: " + StaticMethods.deleteCollectionTime(hashSet));
        System.out.println();

        start = System.currentTimeMillis();
        TreeSet<Integer> treeSet = StaticMethods.getBigRandomTreeSet(1000000);
        finish = System.currentTimeMillis();
        System.out.println("Created TreeSet: " + (finish - start));
        System.out.println("Searching TreeSet: " + StaticMethods.searchCollectionTime(treeSet));
        System.out.println("Deleting TreeSet: " + StaticMethods.deleteCollectionTime(treeSet));
        System.out.println();
    }
}
