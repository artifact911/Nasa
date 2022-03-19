package step.cw.practice04Collection;

import java.util.*;

public abstract class StaticMethods {

    protected static <T> void printFor(List<T> list) {
        System.out.println("Printed by for");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    protected static <T> void printForEach(List<T> list) {
        System.out.println("Printed by for-each");
        for (T value : list) {
            System.out.println(value);
        }
    }

    protected static <T> void printWhile(List<T> list) {
        System.out.println("Printed by while");
        Iterator<T> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    protected static ArrayList<String> getList(int length) {
        ArrayList<String> stringList = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < length; i++) {
                stringList.add(input.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        }
        return stringList;
    }

    protected static LinkedList<String> getLinkedList(int length) {
        LinkedList<String> stringList = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < length; i++) {
            stringList.addFirst(input.nextLine());
        }
        return stringList;
    }

    protected static <T> HashSet<T> getWithoutRepeat(Collection<T> collection) {
        return new HashSet<T>(collection);

    }

    protected static LinkedList<Integer> getBigRandomLinkedList(int length) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random ran = new Random();
        for (int i = 0; i < length; i++) {
            linkedList.add(ran.nextInt());
        }
        return linkedList;

    }

    protected static ArrayList<Integer> getBigRandomArrayList(int length) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random ran = new Random();
        for (int i = 0; i < length; i++) {
            arrayList.add(ran.nextInt());
        }
        return arrayList;

    }

    protected static HashSet<Integer> getBigRandomHashSet(int length) {
        HashSet<Integer> hashSet = new HashSet<>();
        Random ran = new Random();
        for (int i = 0; i < length; i++) {
            hashSet.add(ran.nextInt());
        }
        return hashSet;

    }

    protected static TreeSet<Integer> getBigRandomTreeSet(int length) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random ran = new Random();
        for (int i = 0; i < length; i++) {
            treeSet.add(ran.nextInt());
        }
        return treeSet;

    }

    protected static Deque<Integer> getBigRandomDeque(int length) {
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Random ran = new Random();
        for (int i = 0; i < length; i++) {
            deque.add(ran.nextInt());
        }
        return deque;

    }

    protected static Queue<Integer> getBigRandomQueue(int length) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        Random ran = new Random();
        for (int i = 0; i < length; i++) {
            queue.add(ran.nextInt());
        }
        return queue;

    }

    protected static long searchCollectionTime(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        Random ran = new Random();
        int key = ran.nextInt();
        for (Integer value : collection) {
            if (value == key) {
                System.out.println(key + " was found");
            }
        }
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    protected static long deleteCollectionTime(Collection<Integer> collection) {
        long start = System.currentTimeMillis();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.remove(1);
        collection.remove(2);
        collection.remove(3);
        collection.remove(4);
        long finish = System.currentTimeMillis();
        return finish - start;

    }

}
