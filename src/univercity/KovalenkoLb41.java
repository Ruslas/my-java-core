package univercity;

import java.util.Arrays;

public class KovalenkoLb41 {
    public static void main(String[] args) {
        double[][] res = new double[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        double[][] price = new double[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        double[][] c = new double[][]{
                {0, 2, 1},
                {2, 1, 5},
                {2, 4, 3}
        };
        double[] a = new double[]{5, 5, 10};
        double[] b = new double[]{6, 9, 5};
        System.out.println("c");
        printArray(c);
        System.out.println("a - " + Arrays.toString(a));
        System.out.println("b - " + Arrays.toString(b));

        if (arraySum(a) == arraySum(b)) {
            int indexA = 0;
            int indexB = 0;

            while (arraySum(a) != 0 && arraySum(b) != 0) {
                double tempA = a[indexA];
                res[indexB][indexA] = c[indexB][indexA];
                price[indexB][indexA] = min(a[indexA], b[indexB]);
                a[indexA] = a[indexA] - min(a[indexA], b[indexB]);
                b[indexB] = b[indexB] - min(tempA, b[indexB]);
                if (a[indexA] == 0) {
                    for (double[] num : c) {
                        num[indexA] = 0;
                    }
                    indexA++;
                } else {
                    for (int i = 0; i < c[indexB].length; i++) {
                        c[indexB][i] = 0;
                    }
                    indexB++;
                }
            }
            System.out.println("F(x) = " + sumMult(res, price));
            System.out.println("res");
            printArray(res);
            System.out.println("price");
            printArray(price);
            System.out.println("c");
            printArray(c);
            System.out.println("a - " + Arrays.toString(a));
            System.out.println("b - " + Arrays.toString(b));
        }
    }

    public static double arraySum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        return sum;
    }

    public static double min(double x, double y) {
        if (x <= y) return x;
        else return y;
    }

    public static void printArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static double sumMult(double[][] x, double[][] y) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] *= y[i][j];
            }
        }
        for (double[] nums : x) {
            sum += arraySum(nums);
        }
        return sum;
    }
}
