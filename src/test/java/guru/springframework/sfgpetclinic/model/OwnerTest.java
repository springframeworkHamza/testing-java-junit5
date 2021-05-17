package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {

        Owner owner = new Owner(1l, "Hamza", "Chaoui");
        owner.setCity("Brussels");
        owner.setTelephone("122566555");

        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                            () -> assertEquals("Hamza", owner.getFirstName(), "First Name Did Not Match"),
                            () -> assertEquals("Chaoui", owner.getLastName())),
                () -> assertAll("Owner Properties",
                            () -> assertEquals("Brussels", owner.getCity(), "City Did Not Match"),
                            () -> assertEquals("122566555", owner.getTelephone())
                ));
    }
}