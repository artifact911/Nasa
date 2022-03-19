package step.cw.practice04Collection;

import java.util.List;
import java.util.ListIterator;

public class Task02 {
    public static void main(String[] args) {
        List<String> stringList = StaticMethods.getList(5);

        stringList.remove(3);

        ListIterator<String> iterator = stringList.listIterator(stringList.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}

