package main.java.com.primeNumbers;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberOperations {

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int sumPrimesUpTo(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public List<Integer> findPrimesInRange(int start, int end) {
        List<Integer> primes = new ArrayList<>();
        for (int i = Math.max(2, start); i <= end; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return primes;
    }

    public int findNthPrime(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be positive");
        }
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                count++;
            }
            if (count == n) {
                return number;
            }
            number++;
        }
        return -1; // This line should never be reached
    }

    public boolean areTwinPrimes(int num1, int num2) {
        return Math.abs(num1 - num2) == 2 && isPrime(num1) && isPrime(num2);
    }

    public int largestPrimeFactorOf(int number) {
        int largestPrime = -1;
        while (number % 2 == 0) {
            largestPrime = 2;
            number = number / 2;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number = number / i;
            }
        }
        if (number > 2) {
            largestPrime = number;
        }
        return largestPrime;
    }

    public boolean isCircularPrime(int number) {
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            if (!isPrime(Integer.parseInt(numStr))) {
                return false;
            }
            numStr = numStr.substring(1) + numStr.charAt(0);
        }
        return true;
    }
}
