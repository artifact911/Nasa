package dmdev.java2.collectionsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345", "14", "678");
        Collections.sort(strings);
        System.out.println(strings);


        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "YIvanov"),
                new Person(3, "Petr", "XPetrov"),
                new Person(2, "Sveta", "ASvetikova")
        );
        Collections.sort(personList); // Не работает. Идем в Person реализовывать интерфейс Comparable
        System.out.println(personList);

        // Задача: хотим сравнивать не по id, а как-то иначе. Напишем свой компоратор.
        // Теперь в метод sort мы можем передать свой компоратор
        Collections.sort(personList, new FirstNameComparator());
        System.out.println(personList);
        // А можем компаратор отдать и так:
        personList.sort(new FirstNameComparator());
        // А можем заюзать Java 8))
        personList.sort(Comparator.comparing(Person::getLastName));
        System.out.println(personList);
        personList.sort(Comparator.comparing(Person::getLastName).thenComparing(Person::getFirstName));
        System.out.println(personList);


    }

}
