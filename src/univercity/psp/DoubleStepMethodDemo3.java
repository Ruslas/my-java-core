package univercity.psp;

public class DoubleStepMethodDemo3 {
    public static void main(String[] args) {
        int kmax = 14, eps = 1;
        double x = 1.13883;
        double y = 1 - x, fi = 0;
        int[] ep = new int[14];
        doubStepM(14, eps, 2, fi, x, y, ep);
    }

    public static void doubStepM(int kmax, int eps, int q, double fi, double x, double y, int[] ep) {
        int i;
        double tempx, tempy, tempfi;
        double firstx = 100;
        double firsty = 100;
        int t = 1;
        for (int k = 0; k < 7; k++) {
            i = k + 1;


            for (int j = 0; j < 2; j++) {
                tempx = x;
                tempy = y;
                tempfi = fi;
                eps = (int) Math.signum(y);

                x = tempx * (1 + eps * Math.pow(2, 0 - i));

                System.out.printf("x%d = %.5f*(1+%d/%d) = %.5f%n",
                        t, tempx, eps, (int)Math.pow(2, i), x);

                y = tempy - eps * tempx * Math.pow(2, 0 - i);

                System.out.printf("y%d = %.5f - %.5f/%d = %.5f%n",
                        t, tempy, eps*tempx, (int)Math.pow(2, i), y);

                if (j == 0) {
                    fi = tempfi - Math.log(1 + eps * Math.pow(2, 0 - i));

                    System.out.printf("fi%d = %.5f - %.5f = %.5f%n",
                            t, tempfi, Math.log(1 + eps * Math.pow(2, 0 - i)), fi);

                    firstx = x;
                    firsty = y;
                }

                if (j == 1 && Math.abs(firsty) > Math.abs(y)) {
                    fi = tempfi - Math.log(1 + eps * Math.pow(2, 0 - i));
                    System.out.printf("fi%d = %.6f - %.6f = %.6f%n",
                            t, tempfi, Math.log(1 + eps * Math.pow(2, 0 - i)), fi);
                }

                if (j == 1 && Math.abs(firsty) < Math.abs(y)) {

                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    fi = fi;
                    x = firstx;
                    y = firsty;
                }
                System.out.println();
                t++;
            }
        }
        System.out.println("x = " + x + "\ny = " + y + "\nfi = " + fi);
    }
}
