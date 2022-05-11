package dmdev.java2.collectionsort;

import java.util.Objects;

class Person implements Comparable<Person> {

    private final int id;

    private final String firstName;

    private final String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        // тут подробно, для понимания
       /* if (id == o.id) {
            return 0;
        } else if (id > o.id) {
            return 1;
        } else {
            return -1;
        }*/

        // на самом деле реализовано все то же, что и выше если подумать)
//        return id - o.id;

        // Но чтобы избежать выходов за пределы вместимости int, есть статический метод:
        return Integer.compare(id, o.id);
    }
}
