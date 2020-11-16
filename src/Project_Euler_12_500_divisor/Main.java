package Project_Euler_12_500_divisor;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        long i = 1L;
        long sum = 0L;

        while (countOfDivisors(sum) < 501) {

            sum += i;
            i++;
        }
        System.out.println(sum);
    }


    public static int countOfDivisors(Long number) {

        List<Integer> primePowers = new ArrayList<Integer>();
        int countOfDivisors = 1;

        getPrimePowers(number, primePowers);

        for (int i = 0; i < primePowers.size(); i++) {

            countOfDivisors *= primePowers.get(i) + 1;
        }
        return countOfDivisors;
    }


    public static void getPrimePowers(long number, List primePowers) {

        int powerCounter = 0;
        long i = 2L;

        do {
            if (number % i == 0) {
                powerCounter++;
                number /= i;
            } else {
                if (isGreaterThanNull(powerCounter)) {
                    primePowers.add(powerCounter);
                }
                powerCounter = 0;
                i++;
            }
        } while (number >= i);

        primePowers.add(powerCounter);
    }


    public static boolean isGreaterThanNull(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}