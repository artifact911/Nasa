package dmdev.java2.lambdastream.stream;

import java.util.List;

public class StreamExample {

    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");

       /* for (String string : strings) {
            String value = string + string;
            Integer intValue = Integer.valueOf(value);
            if(intValue % 2 == 0) {
                System.out.println(intValue);
            }
        }*/

        // перепишем через Stream
        strings.stream()
                .map((val) -> val + val) // если елемент один, скобки можно первого (val) можно опускать
//                .map(val -> Integer.valueOf(val))
        // заменим на лямбду
                .map(Integer::valueOf)
                .filter(val -> val % 2 == 0)
                .sorted()
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }
}
