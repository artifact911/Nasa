package dmdev.java2.lambdastream.practice;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Дан список целых чисел. Найти среднее всех нечетных чисел, делящихся на 5.
 */
public class Task1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 3, 4, 6, 8, 5, 15, 20, 25, 10);

        double average = integers.stream()
                                 .filter(i -> i % 2 != 0)
                                 .filter(i -> i % 5 == 0)
                                 .mapToInt(Integer::intValue)
                                 .average()
                                 .getAsDouble();

        System.out.println(average);


        // не мой варик
        OptionalDouble average1 = integers.stream()
                                          .filter(i -> i % 2 != 0)
                                          .filter(i -> i % 5 == 0)
                                          .mapToInt(Integer::intValue)
                                          .average();

        average1.ifPresent(System.out::println);

        //варик от Кирьянушки
        double average3 = integers.stream()
                                  .filter(i -> i % 2 != 0)
                                  .filter(i -> i % 5 == 0)
                                  .mapToInt(Integer::intValue)
                                  .summaryStatistics().getAverage();

        System.out.println(average3);
    }
}
