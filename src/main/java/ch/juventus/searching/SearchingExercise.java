package ch.juventus.searching;

import ch.juventus.sorting.Person;

import java.util.HashMap;
import java.util.Map;

public class SearchingExercise {

    private static final Map<Person, String> personPhoneNumberMap = new HashMap<>();

    public static void main(String[] args) {
        personPhoneNumberMap.put(new Person("Hans", "Muster"), "0791234567");
        personPhoneNumberMap.put(new Person("Lisa", "Meier"), "0792345678");
        personPhoneNumberMap.put(new Person("Peter", "Keller"), "0793456789");

        Person p = getByPhoneNumber("0792345678");
        System.out.println(p);

        Person p2 = getByPhoneNumber("123");
        System.out.println(p2);
    }

    private static Person getByPhoneNumber(String phoneNumber) {
        for (Map.Entry<Person, String> entry : personPhoneNumberMap.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }

        return null;
    }

}
