package myutil;

import java.util.Random;

public class ArrayRandom{
    public static Double[][] randomTwoArray(int rows, int columns, double leftBoundary, double rightBoundary){
        final Random random = new Random();
        Double[][] randArray = new Double[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                randArray[i][j] = random.nextDouble()*(rightBoundary-leftBoundary)+leftBoundary;
            }
        return randArray;
    }

    public static Integer[][] randomTwoArray(int rows, int columns, int leftBoundary, int rightBoundary){
        final Random random = new Random();
        Integer[][] randArray = new Integer[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                randArray[i][j] = random.nextInt(rightBoundary - leftBoundary) + leftBoundary;
            }
        return randArray;
    }

    public static Long[][] randomTwoArray(int rows, int columns){
        final Random random = new Random();
        Long[][] randArray = new Long[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                randArray[i][j] = random.nextLong();
            }
        return randArray;
    }

    public static Float[][] randomTwoArray(int rows, int columns, float leftBoundary, float rightBoundary){
        final Random random = new Random();
        Float[][] randArray = new Float[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++) {
                randArray[i][j] = random.nextFloat()*(rightBoundary-leftBoundary)+leftBoundary;
            }
        return randArray;
    }
}
