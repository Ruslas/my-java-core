package univercity.psp;

import java.util.Arrays;

public class VolderMethodDemo2 {
    public static void main(String[] args) {
        double x = 0.798, y = 0.602, fi = 0;
        int n = 10, i = 0, eps = 1;
        int[] ep = new int[10];
        firstStep(x, y, n, i, eps, ep);
        System.out.println("----------------------------------------");
        System.out.println(Arrays.toString(ep));
        secondStep(fi, ep, n, i);
    }

    public static void firstStep(double x, double y, int n, int i, int eps, int[] ep) {
        double tempX, tempY;
        for (i = 0; i < n; i++) {
            if (y < 0) {
                eps = -1;
            } else {
                eps = 1;
            }
            ep[i] = eps;
            tempX = x;
            tempY = y;
            y = tempY - eps * tempX * Math.pow(2, 0 - i);
            x = tempX + eps * tempY * Math.pow(2, 0 - i);

            System.out.printf("x%d = %.5f + %.5f/%d = %.5f%n",
                    (i + 1), tempX, ep[i] * tempY, (int) Math.pow(2, i), x);
            System.out.printf("y%d = %.5f - %.5f/%d = %.6f%n%n",
                    (i + 1), tempY, ep[i] * tempX, (int) Math.pow(2, i), y);
        }
    }

    public static void secondStep(double fi, int[] ep, int n, int i) {
        for (i = 0; i < n; i++) {
            System.out.printf("fi%d = %.5f + %.5f = ", (i + 1), fi, ep[i] * converter(Math.atan(Math.pow(2, 0 - i))));
            fi = fi + ep[i] * converter(Math.atan(Math.pow(2, 0 - i)));
            System.out.printf("%.5f%n", fi);
        }
    }

    public static double converter(double a) {
        return a * (180 / Math.PI);
    }
}
