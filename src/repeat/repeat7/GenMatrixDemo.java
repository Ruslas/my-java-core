package repeat.repeat7;

import java.util.Random;

public class GenMatrixDemo {
    public static void main(String[] args) {
        Integer[][] array1 = new Integer[10][5];
        Integer[][] array2 = new Integer[10][5];
        Double[][] array3 = new Double[10][5];
        fillIntArray(array1);
        fillIntArray(array2);
        fillDoubArray(array3);

        GenMatrix<Integer> m1 = new GenMatrix<>(array1);
        GenMatrix<Integer> m2 = new GenMatrix<>(array2);
        GenMatrix<Double> m3 = new GenMatrix<>(array3);

        m1.printMatrix();
        m2.printMatrix();
        m3.printMatrix();

        GenMatrix<Double> resalt =  m1.sumMatrix(m2);

        resalt.printMatrix();
    }

    public static void fillIntArray(Integer[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(99);
            }
    }

    public static void fillDoubArray(Double[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextDouble()*99;
            }
    }
}

