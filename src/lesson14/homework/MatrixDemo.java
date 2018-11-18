package lesson14.homework;

import myutil.RandomArray;

import java.util.Arrays;

public class MatrixDemo {
    public static void main(String[] args) {
        Integer[][] testArray = RandomArray.randomTwoArrayObj(5, 4, 0, 10);
        Integer[][] testArray2 = RandomArray.randomTwoArrayObj(4, 3, 0, 10);
        Double[][] doubleArray = RandomArray.randomTwoArrayObjDob(5, 4, 0, 10);

        Matrix<Integer> testM1 = new Matrix<>(testArray);
        testM1.printMatrix();

        testArray = RandomArray.randomTwoArrayObj(5, 4, 0, 10);
        Matrix<Integer> testM2 = new Matrix<>(testArray);
        testM2.printMatrix();
        Matrix<Double> testM3 = new Matrix<>(doubleArray);
        testM3.printMatrix();
        Matrix<Double> testMA = new Matrix<>(doubleArray);
        Matrix<Integer> testMB = new Matrix<>(testArray2);
        Matrix result = testM1.sumMatrices(testM3);
        result.printMatrix();
        System.out.println("********MatrixA********");
        testMA.printMatrix();
        System.out.println("********MatrixB********");
        testMB.printMatrix();
        testMA.multiplyMatrices(testMB).printMatrix();
        testM3.multiplyMatrix(3).printMatrix();
    }
}
