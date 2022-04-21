package ch.juventus.exception;

import ch.juventus.object.Person;

public class Application {

    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();

        try {
            personRepository.findById(42);
        } catch (PersonNotFoundException e) {
            e.printStackTrace();
        }

        personRepository.addPerson(new Person("Hans", "Muster"));

    }

}
