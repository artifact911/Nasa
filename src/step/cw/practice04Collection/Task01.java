package step.cw.practice04Collection;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("January");
        stringList.add("February");
        stringList.add("Mach");
        stringList.add("April");
        stringList.add("May");

        System.out.println(stringList.size());

        StaticMethods.printFor(stringList);
        StaticMethods.printForEach(stringList);
        StaticMethods.printWhile(stringList);


    }
}
