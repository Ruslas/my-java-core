package lesson7.homework;

import myutil.RandomArray;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] testArray = RandomArray.randomTwoArray(5, 4, 0, 10);
        int[][] testArray2 = RandomArray.randomTwoArray(4, 3, 0, 10);

        Matrix testM1 = new Matrix(testArray);
        testM1.printMatrix();

        testArray = RandomArray.randomTwoArray(5, 4, 0, 10);

        Matrix testM2 = new Matrix(testArray);
        testM2.printMatrix();

        Matrix testMA = new Matrix(testArray);
        Matrix testMB = new Matrix(testArray2);

        Matrix result = new Matrix();
        result = testM1.sumMatrices(testM2);
        result.printMatrix();

        result = testM1.multiplyMatrix(5);
        result.printMatrix();

        testMA.printMatrix();
        testMB.printMatrix();

        result = Matrix.multiplyMatrices(testMA, testMB);
        result.printMatrix();
    }
}
