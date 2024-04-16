package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {



    @Test
    void fibonacciForZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void fibonacciForOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void fibonacciForMoreThan2() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        assertEquals(13, Fibonacci.fibonacci(7));
        assertEquals(21, Fibonacci.fibonacci(8));
        assertEquals(34, Fibonacci.fibonacci(9));
    }

    @Test
    void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
}