package dmdev.java2.iterator;

public class IteratorPractice {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>(10);
        myList.add("string1");
        myList.add("string2");
        myList.add("string3");
        myList.add("string4");

        for (String val : myList) {
            System.out.println(val);
        }
        myList.iterator().forEachRemaining(System.out::println);
        myList.forEach(System.out::println);
    }
}
