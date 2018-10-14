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
        b = 2;
        double[] koef = {0, 0, 0, 0, 0, 0};
        String koefS;

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите коефициенты при х");
        if (sc.hasNextLine()){
            koefS = sc.nextLine();
            System.out.println(koefS);
            String[] k = koefS.split(" ");
            for (int i = 0; i < koef.length; i++){
            koef[i] = Double.parseDouble(k[i]);
            }
        }


        dihotomiaExtremum(N, eps, a, b, koef);
    }

   /* public static void goldExtremum(int n, double eps, double a, double b) {
        double x1 = 0, x2 = 0, f1 = 0, f2 = 0, fi1 = 0.382, fi2 = 0.618;
        for (int i = 0; i < n / 2; i++) {

            x1 = a + fi1 * (b - a);
            x2 = a + fi2 * (b - a);
            f1 = Math.pow(x1, 3) - 4 * x1 + 4;
            f2 = Math.pow(x2, 3) - 4 * x2 + 4;
            if (f1 <= f2) {
                b = x2;
            } else {
                a = x1;
            }
            System.out.println("a = " + a + " \tb = " + b);
        }

        if (f1 <= f2) {
            f1 = Math.pow(x1, 3) - 4 * x1 + 4;
            System.out.println("f(" + x1 + ") = " + f1);
        } else {
            f1 = Math.pow(x2, 3) - 4 * x2 + 4;
            System.out.println("f(" + x2 + ") = " + f1);
        }
    }*/

    public static void dihotomiaExtremum(int n, double eps, double a, double b, double... koef) {
        double x1 = 0, x2 = 0, f1 = 0, f2 = 0;
        for (int i = 0; i < n / 2; i++) {

            x1 = (a + b) / 2 - eps / 2;
            x2 = (a + b) / 2 + eps / 2;
            f1 = koef[0]*Math.pow(x1, 5) + koef[1]*Math.pow(x1, 4) + koef[2]*Math.pow(x1, 3) + koef[3]*Math.pow(x1, 2) + koef[4]*Math.pow(x1, 1) + koef[5];
            f2 = koef[0]*Math.pow(x2, 5) + koef[1]*Math.pow(x2, 4) + koef[2]*Math.pow(x2, 3) + koef[3]*Math.pow(x2, 2) + koef[4]*Math.pow(x2, 1) + koef[5];
            if (f1 <= f2) {
                b = x2;
            } else {
                a = x1;
            }
            System.out.println("a = " + a + "\tb = " + b);
        }

        if (f1 <= f2) {
            f1 = koef[0]*Math.pow(x1, 5) + koef[1]*Math.pow(x1, 4) + koef[2]*Math.pow(x1, 3) + koef[3]*Math.pow(x1, 2) + koef[4]*Math.pow(x1, 1) + koef[5];
            System.out.println("f(" + x1 + ") = " + f1);
        } else {
            f1 = koef[0]*Math.pow(x2, 5) + koef[1]*Math.pow(x2, 4) + koef[2]*Math.pow(x2, 3) + koef[3]*Math.pow(x2, 2) + koef[4]*Math.pow(x2, 1) + koef[5];
            System.out.println("f(" + x2 + ") = " + f1);
        }
    }
}
