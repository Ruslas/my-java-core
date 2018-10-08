package lesson5.homeWork;

import java.util.Arrays;
import java.util.Random;

public class BubbleSorterDemo {
    public static void main(String[] args) {
        final Random random = new Random();
        int[] testArr = {0, 1, 2, 3, 4, 21, 17, 11, 36, 38, 40, 16, 10, 13, 23, 46, 47, 48, 49, 50};
        int[] testArr2 = new int[20];

        for (int i = 0; i < testArr2.length; i++){
            testArr2[i] = random.nextInt(50);
        }

        //testArr2 = testArr;

        System.out.println(Arrays.toString(testArr2));
        System.out.println("-----------------------");
        BubbleSorter.sort(testArr2);
        System.out.println("-----------------------");
        System.out.println(Arrays.toString(testArr2));
    }
}
