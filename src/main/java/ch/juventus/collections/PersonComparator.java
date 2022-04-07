package ch.juventus.collections;

import ch.juventus.object.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getLastName().compareTo(p2.getLastName());
    }
}
