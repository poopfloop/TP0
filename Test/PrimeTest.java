package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeTest {

    @Test
    void isPrimeLessThanTwo() {
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(0));
    }

    @Test
    void isPrimeNonPremier() {
        // Test de nombres non premiers
        assertFalse(Prime.isPrime(1));
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        assertFalse(Prime.isPrime(10));
    }

    @Test
    void isPrimePremier() {
        // Test de nombres premiers
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
    }

    @Test
    void isPrimeForOneOrTwo() {
        // Test de nombres premiers
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
    }
}