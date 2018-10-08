package lesson5.homeWork;

import java.util.Arrays;

public class BubbleSorter {
    public static void sort(int[] array) {
        int steps = 0;
        int ifof = 0;
        out:
        for (int i = 0; i < array.length; i++) {
            boolean b = false;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    b = true;
                    ifof++;
                }
                steps++;
            }
            if (!b) {
                break out;
            }
        }
        System.out.println("ifof - " + ifof + " steps - " + steps);
    }
}

