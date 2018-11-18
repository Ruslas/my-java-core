package myutil;

import java.util.Random;

public class RandomArray {
    public static int[] randomArray(int size, int leftBoundary, int rightBoundary) {
        final Random random = new Random();
        int[] randArray = new int[size];

        for (int i = 0; i < size; i++) {
            randArray[i] = random.nextInt(rightBoundary - leftBoundary) + leftBoundary;
        }
        return randArray;
    }

    public static int[][] randomTwoArray(int rows, int columns, int leftBoundary, int rightBoundary) {
        final Random random = new Random();
        int[][] randArray = new int[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                randArray[i][j] = random.nextInt(rightBoundary - leftBoundary) + leftBoundary;
            }
        return randArray;
    }

    public static Integer[] randomArrayObj(int size, int leftBoundary, int rightBoundary) {
        final Random random = new Random();
        Integer[] randArray = new Integer[size];

        for (int i = 0; i < size; i++) {
            randArray[i] = random.nextInt(rightBoundary - leftBoundary) + leftBoundary;
        }
        return randArray;
    }

    public static Integer[][] randomTwoArrayObj(int rows, int columns, int leftBoundary, int rightBoundary) {
        final Random random = new Random();
        Integer[][] randArray = new Integer[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                randArray[i][j] = random.nextInt(rightBoundary - leftBoundary) + leftBoundary;
            }
        return randArray;
    }

    public static Double[][] randomTwoArrayObjDob(int rows, int columns, int leftBoundary, int rightBoundary) {
        final Random random = new Random();
        Double[][] randArray = new Double[rows][columns];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                randArray[i][j] = random.nextDouble()*(rightBoundary-leftBoundary)+leftBoundary;
            }
        return randArray;
    }
}

