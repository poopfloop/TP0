package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    public void setUp() {
        stack = new Stack();
    }

    @Test
    void popShouldRetireElementToTheTopOFStack() {
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.pop());
        assertEquals(5, stack.pop());
    }

    @Test
    void popShouldExpandArrayIfStackIsEmpty() {
        assertThrows(IllegalStateException.class, ()-> stack.pop());
    }

    @Test
    void peekShouldReturnFirstElemtWithoutPopingIt() {
        stack.push(5);
        assertEquals(5, stack.peek());
        assertEquals(1, stack.size());
        stack.push(10);
        assertEquals(10, stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    void peekShouldExpandArrayIfStackIsEmpty() {
        assertThrows(IllegalStateException.class, ()-> stack.peek());
    }
    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, stack.size());
        stack.push(5);
        assertEquals(1, stack.size());
        stack.push(10);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

    @Test
    public void PushShouldAddElementToTheTopOFStack(){
        stack.push(5);
        assertEquals(1,stack.size());
        assertEquals(1,stack.peek());
    }

    @Test
    public void PushShouldExpandArrayIfStackIsFull(){
        assertEquals(10,stack.size());
        stack.push(10);
        assertEquals(11,stack.size());
        assertEquals(10,stack.peek());
    }
}