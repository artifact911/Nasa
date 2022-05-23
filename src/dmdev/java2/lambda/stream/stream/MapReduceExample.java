package dmdev.java2.lambda.stream.stream;

import dmdev.java2.lambda.stream.Student;

import java.util.stream.Stream;

public class MapReduceExample {

    /**
     * [1000_000] -> age -> max
     *
     * [1000_000] -> age -> max -> max
     *
     * [1000_000] -> age -> max
     *
     */

    public static void main(String[] args) {
        Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasiliy"),
                new Student(45, "Svetlana"),
                new Student(20, "Katya"),
                new Student(68, "Den"),
                new Student(101, "Kira")
        )
                .parallel() // запустили параллельно
//                .sequential() // свернет в один поток
                .map(Student::getAge)
//                .reduce((age1, age2) -> Math.max(age1, age2))
//                .reduce(Math::max)
//                .reduce(Math::max)
//                .reduce(0, Integer::sum)
                .reduce(Integer::sum)
                .ifPresent(System.out::println);
    }
}
