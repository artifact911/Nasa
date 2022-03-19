package step.cw.practice04Collection;

import java.util.HashSet;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {
        List<String> list = StaticMethods.getList(7);
        HashSet<String> hashSet = StaticMethods.getWithoutRepeat(list);
        for (String value : hashSet) {
            System.out.println(value);
        }

    }


}
