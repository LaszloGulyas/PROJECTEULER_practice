package Project_Euler_7_1001st_prime;

public class Main {

    public static void main(String[] args) {

        System.out.println(getNthPrime(10001L));
    }

    public static long getNthPrime(long n) {

        long currentNumber = 2;
        long counter = 0;

        while (counter < n) {
            if (isPrime(currentNumber)) {
                counter++;
            }
            currentNumber++;
        }
        return currentNumber - 1;
    }

    public static boolean isPrime(long number) {

        for (long i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}