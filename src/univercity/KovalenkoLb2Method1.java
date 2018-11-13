package univercity;

import myutil.DoubleArray;

public class KovalenkoLb2Method1 {
    public static void main(String[] args) {
        int N;
        double a, b;
        N = 25;
        a = -2;
        b = 2;
        double[] coefficients = {0, 0, -1, 0, 1, 7};

        printEquation(coefficients);
        System.out.println("Ваш интервал: [" + a + "; " + b + "]");
        uniformScanMethod(N, a, b, coefficients);
    }

    public static void printEquation(double[] coefficients) {
        System.out.println("Ваше уравнение:");
        System.out.print("f = ");
        for (int i = 0; i < coefficients.length; i++) {
            if (coefficients[i] < 0) {
                System.out.print("- ");
            } else {
                System.out.print("+ ");
            }
            if (i == coefficients.length - 1) {
                System.out.print(coefficients[i]);
            } else if (coefficients[i] == 1 || coefficients[i] == -1) {
                System.out.print("x^" + (coefficients.length - i - 1) + " ");
            } else if (coefficients[i] == 0) {
                System.out.print("0 ");
            } else {
                System.out.print(Math.abs(coefficients[i]) + "*x^" + (coefficients.length - i - 1) + " ");
            }
        }
        System.out.println();
    }

    private static void uniformScanMethod(int n, double a, double b, double... koef) {
        double alpha = 10, betta = 1000, f1 = 0, f2 = betta;
        double[] scanPoint = new double[n];
        for (int i = 1; i <= n; i++) {
            scanPoint[i - 1] = a + ((b - a) / (2 * n)) * (2 * i - 1);
        }
        System.out.println("Массив точек сканирования: \n" + DoubleArray.toString(scanPoint, 3));

        double x = 0;
        double x2 = alpha;
        for (int i = 0; i < n; i++) {
            x = scanPoint[i];
            f1 = koef[0] * Math.pow(x, 5) + koef[1] * Math.pow(x, 4) + koef[2] * Math.pow(x, 3) +
                    koef[3] * Math.pow(x, 2) + koef[4] * Math.pow(x, 1) + koef[5];
            if (f1 <= f2) {
                f2 = f1;
                x2 = scanPoint[i];
            }

            System.out.printf("f2 = %.3f \tx2 = %.3f%n", f2, x2);
        }
    }
}
