package andersen.fromLabFinish;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Working1 {
    public static void main(String[] args) {

        // Вызов методов рассчета факториала Итерационным и Рекурсивным методом
        System.out.println(Util.getFactorialIteration(4));
        System.out.println(Util.getFactorialRecursive(3));

        //Фибоначчи
        System.out.println(Util.getFibonacci(10));

        //перевернуть массив без использования Collection
        final int[] array = {1, 2, 3, 4, 5};
        Integer[] wrappedInts = Arrays.stream(array)
                .boxed()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(Util.reversArray(wrappedInts)));

        //перевернуть массив c использованием Collection
        final List<Integer> integerList = Arrays.stream(array).boxed().collect(Collectors.toList());
        Collections.reverse(integerList);
        System.out.println(Arrays.toString(integerList.toArray()));

        //разбиение на строки
        String row = "Надо разбить эту строку";
        System.out.println(Arrays.toString(row.split(" ")));
        System.out.println(Arrays.toString(row.split(" ", 2)));
        System.out.println(Arrays.toString(row.split("а")));
    }
}
