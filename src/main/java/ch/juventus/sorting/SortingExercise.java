package ch.juventus.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortingExercise {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Hans", "Muster"));
        people.add(new Person("Peter", "Keller"));
        people.add(new Person("Peter", "Kuster"));
        people.add(new Person("Lisa", "Muster"));

        System.out.println("Before sorting:");
        people.forEach(System.out::println);

        people.sort(new PersonComparator());

        System.out.println("After sorting:");
        people.forEach(System.out::println);

    }

}
