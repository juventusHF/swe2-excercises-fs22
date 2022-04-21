package ch.juventus.exception;

import ch.juventus.object.Person;

public class PersonRepository {

    public Person findById(int id) throws PersonNotFoundException {
        throw new PersonNotFoundException("oh noooo!");
    }

    public Person addPerson(Person person) {
        throw new IllegalArgumentException("Given person could not be added!");
    }

}
