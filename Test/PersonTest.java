package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class PersonTest {

    @Test
    public void testGetFullName() {
        // Création d'une instance de Person avec un prénom, un nom et un âge
        Person person = new Person("benelhocine", "narcisse", 23);

        // Vérification du nom complet
        assertEquals("Benelhocine Narcisse", person.getFullName());

    }

    @Test
    public void testIsAdult() {
        // Création d'une instance de Person avec un prénom, un nom et un âge
        Person adult = new Person("nana", "elho", 22);
        Person minor = new Person("bekri", "ilhem", 23);

        // Vérification si la personne est majeure
        assertTrue(adult.isAdult());
        assertFalse(minor.isAdult());
    }
}
