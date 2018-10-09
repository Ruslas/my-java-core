package myutil;

import java.util.Random;

public class RandomArray {
    public static int[] randomArray(int size, int leftBoundary, int rightBoundary) {
        final Random random = new Random();
        int[] randArrey = new int[size];

        for (int i = 0; i < size; i++) {
            randArrey[i] = random.nextInt(rightBoundary - leftBoundary) + leftBoundary;
        }
        return randArrey;
    }
}
