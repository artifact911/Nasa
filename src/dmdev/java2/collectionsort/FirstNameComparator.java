package dmdev.java2.collectionsort;

import java.util.Comparator;

class FirstNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
