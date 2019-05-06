package univercity.psp;

import java.util.Arrays;

public class VolderMethodDemo2 {
    public static void main(String[] args) {
        double x = 0.53 , y = 0.848, fi = 0;
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
            System.out.println("x" + (i + 1) + " = " + tempX + " + "
                    + eps * tempY + " / " + Math.pow(2, i) + " = " + x);
            System.out.println("y" + (i + 1) + " = " + tempY + " - "
                    + eps * tempX + " / " + Math.pow(2, i) + " = " + y);
            System.out.println();
        }
    }

    public static void secondStep(double fi, int [] ep, int n, int i){
        for (i = 0; i < n; i++){
            System.out.print("fi" + (i+1) + " = " + fi + " + "
                    + ep[i] * converter(Math.atan(Math.pow(2, 0 - i))));
            fi = fi + ep[i] * converter(Math.atan(Math.pow(2, 0 - i)));
            System.out.println(" = " + fi);
        }
    }

    public static double converter(double a) {
        return a * (180 / Math.PI);
    }
}
