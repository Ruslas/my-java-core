package univercity.psp;

import java.util.Arrays;

public class DiditByDiditSynhroDemo {
    public static void main(String[] args) {
        double A = 3.15;
        double B = 24.1;
        double C = 0.118;
        int[] ep = new int[10];
        dbds(A, B, C, 10, ep);
        System.out.println(Arrays.toString(ep));
    }

    public static void dbds(double A, double B, double C, int imax, int[] ep) {
        double y = A;
        double U = 0;
        double tempy, tempU;
        int eps = 1;
        for (int i = 0; i < imax; i++) {
            eps = (int) Math.signum(y);
            ep[i] = eps;

            tempy = y;
            tempU = U;

            y = tempy - eps * B * Math.pow(2, 0 - i);
            U = tempU + eps * C * Math.pow(2, 0 - i);

            System.out.println("y" + (i + 1) + " = " + tempy + " - " + eps * B +
                    "/" + Math.pow(2, i) + " = " + y);
            System.out.println("U" + (i + 1) + " = " + tempU + " + " + eps * C +
                    "/" + Math.pow(2, i) + " = " + U);
            System.out.println();
        }
    }

}

