package univercity.psp;

import java.util.Arrays;

public class DoubleStepMethodDemo2 {
    public static void main(String[] args) {
        int kmax = 14, eps = 1;
        double x = 1.284;
        double y = 1 - x, fi = 0;
        int[] ep = new int[14];
        doubStepMod(kmax, eps, 2, fi, x, y, ep);
        System.out.println(Arrays.toString(ep));
    }

    public static void doubStepMod(int kmax, int eps, int q, double fi, double x, double y, int[] ep) {
        int i;
        double tempx, tempy, tempfi = fi;
        int tempEps = eps;
        boolean flag = false;
        for (int k = 0; k < kmax; k++) {
            tempEps = eps;
            if ( y < 0) {
                eps = -1;
            } else {
                eps = 1;
            }

            if (flag){
                eps = tempEps;
            }
            ep[k] = eps;
            i = k / q + 1;

            tempx = x;
            tempy = y;

           if (!flag) {
               tempfi = fi;
           }
            x = tempx * (1 + eps * Math.pow(2, 0 - i));
            System.out.println("x" + (k+1) + " = " + tempx + "*(1+" + eps + "/"
                    + Math.pow(2, i) + ") = " + x);

            y = tempy - eps * tempx * Math.pow(2, 0 - i);

            System.out.println("y" + (k+1) + " = " + tempy + " - "
                    + tempx*eps + "/"
                    + Math.pow(2, i) + " = " + y);

            fi = tempfi - Math.log(1 + eps * Math.pow(2, 0 - i));

            System.out.println("fi" + (k+1) + " = " + tempfi + " - "
                    + Math.log(1 + eps * Math.pow(2, 0 - i)) + " = " + fi);

            if (Math.abs(1 - Math.abs(x)) > Math.abs(1 - Math.abs(tempx)) && k % 2 != 0) {
                flag = true;
            } else flag = false;


            /*System.out.println("x" + (k + 1) + " = " + x);
            System.out.println("y" + (k + 1) + " = " + y);
            System.out.println("fi" + (k + 1) + " = " + tempfi + " - " + "ln(" + 1 +" + " + eps + " * 2^" + i +
                     ")" + " = " + fi);
            System.out.println(Math.log(1 + eps * Math.pow(2, 0 - i)));*/
            System.out.println();
        }
    }
}
