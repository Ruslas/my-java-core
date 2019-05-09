package univercity.psp;

import java.util.Arrays;

public class DoubleStepMethodDemo {
    public static void main(String[] args) {
        int kmax = 14, eps = 1;
        double fi = 0.25, x = 1;
        int[] ep = new int[14];
        doubStep(kmax, eps, 2, fi, x, ep);
        System.out.println(Arrays.toString(ep));
    }

    public static void doubStep(int kmax, int eps, int q, double fi, double x, int[] ep) {
        int i;
        for (int k = 0; k < kmax; k++) {
            if (fi < 0) {
                eps = -1;
            } else {
                eps = 1;
            }
            ep[k] = eps;
            i = k / q + 1;

            System.out.print("fi" + (k + 1) + " = " + fi + " - " +
                    Math.log(1 + eps * Math.pow(2, 0 - i)));
            fi = fi - Math.log(1 + eps * Math.pow(2, 0 - i));
            System.out.println(" = " + fi);
            System.out.print("x" + (k + 1) + " = " + x + " * " + (1 + eps * Math.pow(2, 0 - i)));
            x = x * (1 + eps * Math.pow(2, 0 - i));
            System.out.println(" = " + x);
            System.out.println();

        }
    }
}
