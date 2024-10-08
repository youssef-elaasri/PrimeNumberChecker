package test.java.com.primeNumbers;

import main.java.com.primeNumbers.PrimeNumberOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class PrimeNumberOperationsTest {

    private PrimeNumberOperations primeOps;

    @BeforeEach
    void setUp() {
        primeOps = new PrimeNumberOperations();
    }

    @Test
    void testIsPrime() {
        assertTrue(primeOps.isPrime(2));
        assertTrue(primeOps.isPrime(3));
        assertTrue(primeOps.isPrime(5));
        assertFalse(primeOps.isPrime(4));
        assertFalse(primeOps.isPrime(1));
    }

    @Test
    void testSumPrimesUpTo() {
        assertEquals(41, primeOps.sumPrimesUpTo(13));
        assertEquals(0, primeOps.sumPrimesUpTo(1));
    }

    @Test
    void testFindPrimesInRange() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7);
        assertEquals(expected, primeOps.findPrimesInRange(2, 10));
    }

    @Test
    void testFindNthPrime() {
        assertEquals(2, primeOps.findNthPrime(1));
        assertEquals(3, primeOps.findNthPrime(2));
        assertEquals(5, primeOps.findNthPrime(3));
    }

    @Test
    void testAreTwinPrimes() {
        assertTrue(primeOps.areTwinPrimes(3, 5));
        assertTrue(primeOps.areTwinPrimes(5, 7));
        assertFalse(primeOps.areTwinPrimes(2, 3));
    }

    @Test
    void testLargestPrimeFactorOf() {
        assertEquals(5, primeOps.largestPrimeFactorOf(10));
        assertEquals(7, primeOps.largestPrimeFactorOf(14));
    }

    @Test
    void testIsCircularPrime() {
        assertTrue(primeOps.isCircularPrime(2));
        assertTrue(primeOps.isCircularPrime(3));
        assertTrue(primeOps.isCircularPrime(11));
        assertFalse(primeOps.isCircularPrime(10));
    }
}