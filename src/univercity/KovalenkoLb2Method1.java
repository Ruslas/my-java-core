package univercity;

import java.util.Arrays;
import java.util.Scanner;

public class KovalenkoLb2Method1 {
    public static void main(String[] args) {
        int N;
        double a, b;
        N = 5;
        a = -2;
        b = 2;
        double[] coefficients = {0, 0, -1, 0, 1, 7};

        System.out.println("Ваш интервал: [" + a + "; " + b + "]");

        uniformScanMethod(N, a, b, coefficients);
    }

    private static void uniformScanMethod(int n, double a, double b, double... koef) {
        double alpha = 10, betta = 1000, f1=0, f2=betta;
        double[] scanPoint = new double[n];
        for (int i = 1; i <= n; i++) {
            scanPoint[i-1] = a + ((b-a)/(2*n))*(2*i-1);
        }
        System.out.println("Массив точек сканирования: " + Arrays.toString(scanPoint));

        double x = 0;
        double x2 = alpha;
        for (int i = 0; i < n; i++){
            x = scanPoint[i];
            f1 = koef[0] * Math.pow(x, 5) + koef[1] * Math.pow(x, 4) + koef[2] * Math.pow(x, 3) +
                    koef[3] * Math.pow(x, 2) + koef[4] * Math.pow(x, 1) + koef[5];
            if (f1 <= f2) {
                f2 = f1;
                x2 = scanPoint[i];
            }

            System.out.printf("f2 = %.3f \tx2 = %.3f%n",  f2, x2);
        }
    }
}
