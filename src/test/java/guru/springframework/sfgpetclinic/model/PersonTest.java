package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupAssertions() {
        //given
        Person person = new Person(1l, "Hamza", "Chaoui");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Hamza"),
                () -> assertEquals(person.getLastName(), "Chaoui"));
    }

    @Test
    void groupAssertionsMsgs() {
        //given
        Person person = new Person(1l, "Hamza", "Chaoui");

        //then
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Hamza", "First Name Failed"),
                () -> assertEquals(person.getLastName(), "Chaoui", "Last Name Failed"));
    }
}