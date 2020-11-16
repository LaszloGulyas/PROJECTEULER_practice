package Project_Euler_145_reversible_numbers;

public class Main {

    public static void main(String[] args) {
        long counter = 0;
        for(long number=0; number<=1000000000L; number++) {
            if(number % 10 != 0) {
                long sum = number + reverse(number);
                if(!hasEvenDigit(sum)) {
                    counter ++;
                }
            }
        }
        System.out.println(counter);
    }

    public static long reverse(long inputNumber) {
        int temp;
        int n = (int)(Math.log10(inputNumber));
        int[] digits = new int[n+1];
        long outputNumber = 0;
        while(inputNumber>0) {
            digits[n] = (int)(inputNumber % 10);
            inputNumber /= 10;
            n--;
        }
        n = digits.length-1;
        for(int i=n; i>=0; i--) {
            outputNumber *= 10;
            outputNumber += digits[i];
        }
        return outputNumber;
    }

    public static boolean hasEvenDigit(long inputNumber) {
        while(inputNumber > 0) {
            if(inputNumber %2 == 0) {
                return true;
            }
            inputNumber /= 10;
        }
        return false;
    }
}