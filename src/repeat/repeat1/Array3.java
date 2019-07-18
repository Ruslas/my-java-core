package repeat.repeat1;

import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        int[] array3 = new int[20];
        int[] array4 = new int[10];
        divideBy3(array1.length, array1);
        for (int ar : array1)
            System.out.print(ar + " ");

        System.out.println();

        threeInRow(array2.length, array2);
        for (int ar : array2)
            System.out.print(ar + " ");

        System.out.println();

        twoOne(array3.length, array3);
        for (int ar : array3)
            System.out.print(ar + " ");

        System.out.println();

        moreOne(array4.length, array4);
        for (int ar : array4)
            System.out.print(ar + " ");
    }

    public static void divideBy3(int leng, int... array) {
        for (int i = 1; i < array.length * 3 + 1; i++) {
            if (i % 3 == 0) {
                array[i / 3 - 1] = i;
            }
        }
    }

    public static void threeInRow(int leng, int... array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i / 3;
        }
    }

    public static void twoOne(int leng, int... array) {
        final Random random = new Random();
        int a = random.nextInt(leng);
        int b = random.nextInt(leng);
        for (int i = 0; i < leng; i++) {
            if (i == a || i == b) {
                array[i] = 1;
            } else {
                array[i] = random.nextInt(10) + 2;
            }
        }
    }

    public static void moreOne(int leng, int... array) {
        final Random random = new Random();
        for (int i = 0; i < leng; i++)
            array[i] = random.nextInt(2);

        double sum = 0;
        for (int ar : array) {
            sum += ar;
        }
        int rand;
        while (leng - sum < leng / 2) {
            rand = random.nextInt(leng + 1);
            sum = 0;
            System.out.println("-");
            array[rand] = 1;

            for (int ar : array) {
                sum += ar;
            }
        }
    }
}
