package univercity.psp;

import java.util.Arrays;

public class VolderMethodDemo {
    private static final double CT = 1.647;

    public static void main(String[] args) {
        double fi = 37;
        int eps = 1, n = 10, i = 0;
        double x = 1/CT, y = 0;
        int[] ep = new int[10];
        firstStep(fi, eps, n, i, ep);
        secondStep(x, y, n, i, ep);
    }

    public static void firstStep(double fi, int eps, int n, int i, int[] ep) {

        for (i = 0; i < n; i++) {
            if (fi < 0) {
                eps = -1;
            } else {
                eps = 1;
            }
            ep[i] = eps;
            System.out.printf("fi%d = %.3f - %.3f = ", (i + 1), fi, eps * converter(Math.atan(Math.pow(2, 0 - i))));
            fi = fi - eps * converter(Math.atan(Math.pow(2, 0 - i)));
            System.out.printf("%.4f%n", fi);
        }
    }

    public static void secondStep(double x, double y, int n, int i, int[] ep) {
        System.out.println();
        double tempX, tempY;
        for (i = 0; i < n; i++) {
            tempX = x;
            tempY = y;
            y = tempY + ep[i] * tempX * Math.pow(2, 0 - i);
            x = tempX - ep[i] * tempY * Math.pow(2, 0 - i);
            System.out.printf("y%d = %.3f + %.3f/%d = %.3f%n",
                    (i+1), tempY, ep[i] * tempX, (int)Math.pow(2, i), y);
            System.out.printf("x%d = %.3f - %.3f/%d = %.3f%n%n",
                    (i+1), tempX, ep[i] * tempY, (int)Math.pow(2, i), x);
        }
    }

    public static double converter(double a) {
        return a * (180 / Math.PI);
    }
}
