package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount ba, ba2;

    @BeforeEach
    public void setUp() {
        ba = new BankAccount(1000, 0.5);
        ba2 = new BankAccount(5000, 0.5);
    }

    @Test
    void depositAmountNegatif() {
        assertThrows(IllegalArgumentException.class, ()-> ba.deposit(-1000));
    }

    @Test
    void depositAmount() {
        ba.deposit(100);
        assertEquals(1100, ba.getBalance());
    }

    @Test
    void withdrawAmoutNegatif() {
        assertThrows(IllegalArgumentException.class, ()->ba.withdraw(-1000));
    }

    @Test
    void withdrawAmoutMoreThanBalance() {
        assertThrows(IllegalStateException.class, ()->ba.withdraw(2000));
    }

    @Test
    void withdrawNormal() {
        ba.withdraw(100);
        assertEquals(900, ba.getBalance());
    }

    @Test
    void transferOtherNull() {
        assertThrows(NullPointerException.class, ()->ba.transfer(100, null));
    }

    @Test
    void transfer() {
        ba.transfer(100, ba2);
        assertEquals(900, ba.getBalance());
        assertEquals(5100, ba2.getBalance());
    }

    @Test
    void addInterest() {
        ba.addInterest();
        assertEquals(1500, ba.getBalance());
    }

    @Test
    void getBalance() {
        assertEquals(5000, ba2.getBalance());
    }
}