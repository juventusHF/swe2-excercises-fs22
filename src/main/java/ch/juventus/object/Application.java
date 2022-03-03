package ch.juventus.object;

public class Application {

    public static void main(String[] args) {

        Address address = new Address("Heimstrasse", 8, 8953, "Dietikon");
        Address address2 = new Address("Heimstrasse", 8, 8953, "Dietikon");

        Person person = new Person("Linda", "Krueger", address, 29, false);
        Person person2 = new Person("Linda", "Krueger", address2, 29, false);

        System.out.println(person);

        System.out.println("== Operator vergleicht die Speicheradresse von Objekten: " + (person == person2));
        System.out.println("equals() soll Objekte inhaltlich vergleichen: " + person.equals(person2));

    }

}
