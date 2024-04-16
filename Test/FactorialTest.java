package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorial() {
        // Test avec des nombres positifs
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));

        // Test avec n = 10
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
    void testFactorialNegative() {
        // Test avec un nombre négatif
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}