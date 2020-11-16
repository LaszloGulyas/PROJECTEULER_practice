package Project_Euler_87;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        double statement = 50000000;

        List<Long> solutions = new ArrayList<>();
        List<Long> primes = new ArrayList<>();

        long limitX = findNextPrime((long)Math.sqrt(statement));
        long limitY = findNextPrime((long)Math.pow(statement, 1/3d));
        long limitZ = findNextPrime((long)Math.sqrt(Math.sqrt(statement)));
        long number = 0;

        for(long i=2; i<=limitX; i=findNextPrime(i)) {
            primes.add(i);
        }

        for(int z=0; z<primes.indexOf(limitZ); z++) {

            for(int y=0; y<primes.indexOf(limitY); y++) {

                for(int x=0; x<primes.indexOf(limitX); x++) {
                    number = summer(primes.get(x), primes.get(y), primes.get(z));
                    solutions.add(number);
                }
            }
        }

        //removes duplicates from found numbers
        List<Long> finalSolutions = new ArrayList<>(new HashSet<>(solutions));


        //removes numbers that are higher than provided limit (statement)
        for(int i=0; i<finalSolutions.size(); i++) {
            number = finalSolutions.get(i);
            if(number >= statement) {
                finalSolutions.remove(i);
                i--;
            }
        }

        System.out.println("Final solution is: " + finalSolutions.size());
    }


    public static long summer(long x, long y, long z) {
        return (long)(Math.pow(x,2) + Math.pow(y,3) + Math.pow(z,4));
    }


    public static long findNextPrime(long lastPrime) {

        do {
            lastPrime++;
        } while(isPrime(lastPrime) == false);

        return lastPrime;
    }

    public static boolean isPrime(long number) {
        for(int i=2; i<=(long)Math.sqrt(number)+1; i++ ) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
