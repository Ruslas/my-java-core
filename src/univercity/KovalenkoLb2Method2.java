package univercity;

import myutil.DoubleArray;

public class KovalenkoLb2Method2 {
    private static final double ALPHA = 10, BETTA = 1000;

    public static void main(String[] args) {
        int N0, N;
        double a, b;
        double alpha = ALPHA, betta = BETTA;
        N0 = 50;
        N = ((3 * N0) / 2) + 1;
        a = -2;
        b = 2;
        double[] coefficients = {0, 0, -1, 0, 1, 7};

        printEquation(coefficients);
        System.out.println("Ваш интервал: [" + a + "; " + b + "]");
        specifyUniformScanMethod(N, N0, a, b, alpha, betta, coefficients);
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

    private static void specifyUniformScanMethod(int n, int n0, double a, double b, double alpha, double betta, double... koef) {
        double b1 = (a + b) / 2;
        double a2 = b1;
        double[] fin = new double[n - n0 + 2];
        double[] D1 = uniformScanMethod(n0 / 2, a, b1, alpha, betta, koef);
        double[] D2 = uniformScanMethod(n0 / 2, a2, b, alpha, betta, koef);
        double M1 = average(0, D1.length - 2, D1);
        double M2 = average(0, D2.length - 2, D2);
        System.out.println("----------------------------------");
        System.out.printf("D1 = %s%nD2 = %s%nM1 = %f \t M2 = %f %n",
                DoubleArray.toString(D1, 3), DoubleArray.toString(D2, 3), M1, M2);
        if (M1 < M2) {
            fin = uniformScanMethod(n - n0, a, b1, D1[D1.length - 2], D1[D1.length - 1], koef);
        } else {
            fin = uniformScanMethod(n - n0, a2, b, D2[D2.length - 2], D2[D2.length - 1], koef);
        }
        System.out.println(DoubleArray.toString(fin, 3));
        System.out.printf("x* = %.3f \tf*(x*) = %.3f", fin[fin.length - 2], fin[fin.length - 1]);
    }

    private static double[] uniformScanMethod(int n, double a, double b, double alpha, double betta, double... koef) {
        double f1 = 0, f2 = betta;
        System.out.printf("alpha = %.5f \t betta = %.5f %n", alpha, betta);
        double[] scanPoint = new double[n];
        double[] fun = new double[n + 2];
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
            fun[i] = f1;
            fun[i + 1] = x2;
            fun[i + 2] = f2;
            System.out.printf("f2 = %.3f \tx2 = %.3f%n", f2, x2);
        }
        System.out.println("************************************");
        return fun;
    }

    private static double average(int start, int end, double... arr) {
        double sum = 0;
        int c = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
            c++;
        }
        return sum / c;
    }
}
