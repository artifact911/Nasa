package dmdev.java2.lambdastream.stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamForPrimitive {

    public static void main(String[] args) {
        List<String> strings = List.of("88", "11", "22", "33", "44", "55", "66");
        // если елемент один, скобки можно первого (val) можно опускать
        IntSummaryStatistics intSummaryStatistics = strings.stream().map((val) -> val + val)
//                                                           .map(val -> Integer.valueOf(val))
                                                           // заменим на лямбду
                                                           .map(Integer::valueOf)
                                                           .filter(val -> val % 2 == 0)
                                                           .sorted()
//                                                           .skip(1)
                                                           .limit(2)
                                                           .mapToInt(Integer::intValue) // смапил на Integer и дал его методы
//                                                           .mapToObj() // смапит в объект
//                                                           .max() // вернет максимальное
//                                                           .min() // вернет минимальное
//                                                           .sum() // вернет сумму
//                                                           .average() // среднее
                                                           .summaryStatistics();// получим все предыдущие команды

        System.out.println(intSummaryStatistics);

        // Стрим из примитивов
        IntStream.of(1, 2, 3, 4, 5);
        IntStream.range(0, 10)
                .forEach(System.out::println);
        IntStream.iterate(0, operand -> operand + 3)
                .skip(10)
                .limit(20)
                .forEach(System.out::println);
        // Стрим из объектов
        List<String> collect = Stream.of("11", "22", "33")
                                     .peek(System.out::println) // можно распечатать, но функция не терминальная
                                     .collect(Collectors.toList());

    }

}
