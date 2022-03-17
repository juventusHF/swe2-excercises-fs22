package ch.juventus.logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    private Bank bank;

    @BeforeEach
    public void setup() {
        bank = new Bank(100);
    }

    @Test
    public void testWithdraw() {
        // when
        bank.withdraw(20);

        // then
        assertEquals(80, bank.retrieveBalance());
    }

    @Test
    public void testDeposit() {
        // when
        bank.deposit(50);

        // then
        assertEquals(150, bank.retrieveBalance());
    }

    @Test
    public void testRetrieveBalance() {
        // then
        assertEquals(100, bank.retrieveBalance());
    }

    @Test
    public void testNegativeBalance() {
        // when
        bank.withdraw(200);

        // then
        assertEquals(-100, bank.retrieveBalance());
    }

}