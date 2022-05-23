package dmdev.java2.lambda.stream.optionalex;

import dmdev.java2.lambda.stream.Student;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalEx {

    public static void main(String[] args) {

        Stream<Student> studentStream = Stream.of(
                new Student(18, "Ivan"),
                new Student(23, "Petr"),
                new Student(34, "Vasiliy"),
                new Student(45, "Svetlana"),
                new Student(20, "Katya"),
                new Student(68, "Den"),
                new Student(101, "Kira")
        );

        Optional<Student> maybeStudent = studentStream
                .sequential() // свернет в один поток
             /*
                .flatMap(student -> student.getMarks().stream()) // flatMap может вернуть другой стрим
                .map(mark -> mark.intValue())*/
//                                               .map(Student::getAge)
                .reduce((student1, student2) -> student1.getAge() > student2.getAge() ? student1 : student2);

//        maybeStudent.ifPresent(System.out::println);

        maybeStudent.map(Student::getAge)
//                .filter(age -> age > 25)
//                .flatMap(age -> Optional.of(age * 2))
                    .flatMap(age -> Optional.ofNullable(null))// в flatMap мы можем юзать др функции и вернуть Optional
                    .ifPresent(System.out::println); // этот метод безопасен к null и можно не проверять

    }
}
