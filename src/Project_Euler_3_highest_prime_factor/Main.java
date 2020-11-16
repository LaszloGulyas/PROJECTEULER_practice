package Project_Euler_3_highest_prime_factor;

public class Main {

    public static void main(String[] args) {

        System.out.println(getHighestPrimeFactor(600851475143L));
    }


    public static long getHighestPrimeFactor(long number) {
        long i = 2;
        while (i <= number) {
            if (number % i == 0) {
                number /= i;
            } else {
                i++;
            }
        }
        return i;
    }
}
