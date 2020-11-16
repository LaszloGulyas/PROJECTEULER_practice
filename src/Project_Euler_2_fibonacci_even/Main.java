package Project_Euler_2_fibonacci_even;

public class Main {

    public static void main(String[] args) {
        long z;
        long y = 1L;
        long x = 0L;
        long sum = 0L;

        long i = 0L;
        while (y <= 4000000L) {

            y += x;
            x = y - x;

            if (isEven(y)) {
                sum += y;
            }

            i++;
        }
        System.out.println(sum);
    }


    public static boolean isEven(long number) {

        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}