package main.java.com.primeChecker;

public class PrimeNumberChecker {

    // Vérifie si un nombre est premier
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

    // Retourne la somme des nombres premiers jusqu'à un certain nombre
    public int sumPrimesUpTo(int limit) {
        int sum = 0;
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
