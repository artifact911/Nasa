package dmdev.java2.serialdeserial;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    // чтобы не было проблем при десериализации. Мы тип явно указали версию
    @Serial
    private static final long serialVersionUID = -8810833282540601919L;
    private final int age;
//    private transient final int age; // transient - не участвует в сериализации
    private final String firstName;

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
