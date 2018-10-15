package univercity;

import java.util.Scanner;

/**
 * Created by student on 14.10.2018.
 */
public class KovalenkoLb {
    public static void main(String[] args) {
        int N;
        double eps = 0.002, a, b;
        N = 50;
        a = 0;
        b = 0;
        double[] coefficients = {0, 0, 0, 0, 0, 0};
        String coefficientsStr;

        System.out.println("Введите коефициенты при х\n" +
                "Например: 1 6 5 0 2");

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            coefficientsStr = sc.nextLine();
            String[] coefficientStrs = coefficientsStr.split(" ");
            for (int i = 0; i < coefficientStrs.length; i++) {
                coefficients[i + coefficients.length - coefficientStrs.length] = Double.parseDouble(coefficientStrs[i]);
            }
        }
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

        System.out.println("Введите границы интервала\n" +
                "Например: 0;2");
        if (sc.hasNextLine()) {
            String ambit = sc.nextLine();
            String[] ambits = ambit.split(";", 2);
            a = Double.parseDouble(ambits[0]);
            b = Double.parseDouble(ambits[1]);
        }
        System.out.println("Ваш интервал: [" + a + "; " + b + "]");

        dihotomiaExtremum(N, eps, a, b, coefficients);
        goldExtremum(N, a, b, coefficients);
    }

    public static void goldExtremum(int n, double a, double b, double... koef) {
        double x1 = 0, x2 = 0, f1 = 0, f2 = 0, fi1 = 0.382, fi2 = 0.618;
        for (int i = 0; i < n / 2; i++) {

            x1 = a + fi1 * (b - a);
            x2 = a + fi2 * (b - a);
            f1 = koef[0] * Math.pow(x1, 5) + koef[1] * Math.pow(x1, 4) + koef[2] * Math.pow(x1, 3) + koef[3] * Math.pow(x1, 2) + koef[4] * Math.pow(x1, 1) + koef[5];
            f2 = koef[0] * Math.pow(x2, 5) + koef[1] * Math.pow(x2, 4) + koef[2] * Math.pow(x2, 3) + koef[3] * Math.pow(x2, 2) + koef[4] * Math.pow(x2, 1) + koef[5];
            if (f1 <= f2) {
                b = x2;
            } else {
                a = x1;
            }
            System.out.println("a = " + a + " \tb = " + b);
        }

        if (f1 <= f2) {
            f1 = koef[0] * Math.pow(x1, 5) + koef[1] * Math.pow(x1, 4) + koef[2] * Math.pow(x1, 3) + koef[3] * Math.pow(x1, 2) + koef[4] * Math.pow(x1, 1) + koef[5];
            System.out.println("f(" + x1 + ") = " + f1);
        } else {
            f1 = koef[0] * Math.pow(x2, 5) + koef[1] * Math.pow(x2, 4) + koef[2] * Math.pow(x2, 3) + koef[3] * Math.pow(x2, 2) + koef[4] * Math.pow(x2, 1) + koef[5];
            System.out.println("f(" + x2 + ") = " + f1);
        }
    }

    public static void dihotomiaExtremum(int n, double eps, double a, double b, double... koef) {
        double x1 = 0, x2 = 0, f1 = 0, f2 = 0;
        for (int i = 0; i < n / 2; i++) {

            x1 = (a + b) / 2 - eps / 2;
            x2 = (a + b) / 2 + eps / 2;
            f1 = koef[0] * Math.pow(x1, 5) + koef[1] * Math.pow(x1, 4) + koef[2] * Math.pow(x1, 3) + koef[3] * Math.pow(x1, 2) + koef[4] * Math.pow(x1, 1) + koef[5];
            f2 = koef[0] * Math.pow(x2, 5) + koef[1] * Math.pow(x2, 4) + koef[2] * Math.pow(x2, 3) + koef[3] * Math.pow(x2, 2) + koef[4] * Math.pow(x2, 1) + koef[5];
            if (f1 <= f2) {
                b = x2;
            } else {
                a = x1;
            }
            System.out.println("a = " + a + "\tb = " + b);
        }

        if (f1 <= f2) {
            f1 = koef[0] * Math.pow(x1, 5) + koef[1] * Math.pow(x1, 4) + koef[2] * Math.pow(x1, 3) + koef[3] * Math.pow(x1, 2) + koef[4] * Math.pow(x1, 1) + koef[5];
            System.out.println("f(" + x1 + ") = " + f1);
        } else {
            f1 = koef[0] * Math.pow(x2, 5) + koef[1] * Math.pow(x2, 4) + koef[2] * Math.pow(x2, 3) + koef[3] * Math.pow(x2, 2) + koef[4] * Math.pow(x2, 1) + koef[5];
            System.out.println("f(" + x2 + ") = " + f1);
        }
    }
}
