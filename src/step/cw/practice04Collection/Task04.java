package step.cw.practice04Collection;

import java.util.LinkedList;

public class Task04 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = StaticMethods.getLinkedList(10);
        for (String value : linkedList) {
            System.out.println(value);
        }

    }
}
