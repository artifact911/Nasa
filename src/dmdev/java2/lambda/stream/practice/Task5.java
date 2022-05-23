package dmdev.java2.lambda.stream.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Дан класс Person c полями firstName, lastName, age. Вывести полное имя самого старшего человека, у которого длина этого имени
 * не превышает 15 символов.
 */

public class Task5 {

    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Svetlana", "Svetlanova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov", 56)
        );

        persons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<Person>> map = persons.stream()
                                                    .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map);

        Map<Integer, List<String>> map2 = persons.stream()
                                                .collect(Collectors.groupingBy(Person::getAge,
                                                         Collectors.mapping(Person::getFullName, Collectors.toList())));
        System.out.println(map2);
    }
}
