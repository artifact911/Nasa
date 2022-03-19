package step.cw.practice04Collection;

import java.util.Comparator;
import java.util.List;

public class Task03 {
    public static void main(String[] args) {
        List<String> stringList = StaticMethods.getList(5);

        stringList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(stringList.get(0));

        int min = stringList.get(0).length();
        int index = 0;
        for (int i = 0; i < stringList.size(); i++) {
            if (min > stringList.get(i).length()) {
                min = stringList.get(i).length();
                i = index;
            }
        }

        System.out.println(index);


    }

}
