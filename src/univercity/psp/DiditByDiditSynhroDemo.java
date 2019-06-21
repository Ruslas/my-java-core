package univercity.psp;

import java.util.Arrays;

public class DiditByDiditSynhroDemo {
    public static void main(String[] args) {
        double A = 0.481;
        double B = 3.81;
        double C = 0.281;
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

            System.out.printf("y%d = %.5f - %.2f/%d = %.5f%n",
                    i+1, tempy, eps * B, (int) Math.pow(2, i), y);

            System.out.printf("U%d = %.5f + %.3f/%d = %.5f%n",
                    i+1, tempU, eps * C, (int) Math.pow(2, i), U);

            System.out.println();
        }
    }

}

