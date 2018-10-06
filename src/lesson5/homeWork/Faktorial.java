package lesson5.homeWork;

import java.util.Random;

public class Faktorial {
    public static void main(String[] args) {
        final Random random = new Random();
        long n = random.nextInt(50);
        System.out.println("n = " + n);
        long fn = factorial(n);
        System.out.println("n! = " + fn);
    }

    public static long factorial(long n) {
        for (long i = n - 1; i > 1; i--) {
            n *= i;
        }
        return n;
    }
}
