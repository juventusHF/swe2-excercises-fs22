package ch.juventus.object;

public class Application {

    public static void main(String[] args) {

        Address address = new Address("Heimstrasse", 8, 8953, "Dietikon");
        Person linda = new Person("Linda", "Krueger", address, 29, false);

        System.out.println(linda);

    }

}
