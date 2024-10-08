package test.java.com.primeChecker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.java.com.primeChecker.PrimeNumberChecker;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {

    private PrimeNumberChecker primeChecker;

    @BeforeEach
    void setUp() {
        primeChecker = new PrimeNumberChecker();
    }

    /* Testing 'isPrime' method */
    @Test
    void testIsPrimeWithPrimeNumbers() {
        assertTrue(primeChecker.isPrime(2));
        assertTrue(primeChecker.isPrime(3));
        assertTrue(primeChecker.isPrime(5));
        assertTrue(primeChecker.isPrime(7));
        assertTrue(primeChecker.isPrime(11));
    }

    @Test
    void testIsPrimeWithNonPrimeNumbers() {
        assertFalse(primeChecker.isPrime(1));
        assertFalse(primeChecker.isPrime(4));
        assertFalse(primeChecker.isPrime(15));
        assertFalse(primeChecker.isPrime(21));
    }

    @Test
    void testIsPrimeWithNegativeNumbers() {
        assertFalse(primeChecker.isPrime(-1));
        assertFalse(primeChecker.isPrime(-5));
        assertFalse(primeChecker.isPrime(-10));
    }

    @Test
    void testIsPrimeWithZero() {
        assertFalse(primeChecker.isPrime(0));
    }

    /* Testing 'sumPrimesUpTo' method */
    @Test
    void testSumPrimesUpToWithSmallNumbers() {
        assertEquals(0, primeChecker.sumPrimesUpTo(1));
        assertEquals(2, primeChecker.sumPrimesUpTo(2));
        assertEquals(5, primeChecker.sumPrimesUpTo(3));
        assertEquals(5, primeChecker.sumPrimesUpTo(4));
        assertEquals(10, primeChecker.sumPrimesUpTo(5));
    }

    @Test
    void testSumPrimesUpToWithLargerNumbers() {
        assertEquals(41, primeChecker.sumPrimesUpTo(13));
        assertEquals(100, primeChecker.sumPrimesUpTo(25));
        assertEquals(129, primeChecker.sumPrimesUpTo(30));
    }

    @Test
    void testSumPrimesUpToWithNegativeNumbers() {
        assertEquals(0, primeChecker.sumPrimesUpTo(-1));
        assertEquals(0, primeChecker.sumPrimesUpTo(-10));
    }

    @Test
    void testSumPrimesUpToWithZero() {
        assertEquals(0, primeChecker.sumPrimesUpTo(0));
    }
}