package univercity.psp;

public class DigitByDigitAsynhroMinDemo2 {
    public static void main(String[] args) {
        double A = 0.315, B = 1, C = 0.118;
        method(A, B, C, 0.0001);
    }

    public static void method(double A, double B, double C, double delta) {
        double y = A;
        double U = 0;
        int eps = (int) Math.signum(y);
        double tempy = y, tempU = U, tempeps = eps;
        double[] ys = new double[21];
        ys[0] = y;
        int[] ep = new int[21];
        ep[0] = eps;
        for (int i = 0; Math.abs(ys[i]) > delta; i++) {

            ys[i + 1] = tempy - tempeps * B * Math.pow(2, 0 - i);
            ep[i + 1] = (int) Math.signum(ys[i + 1]);

            System.out.printf("y%d = %.6f - (%d/%d) = %.6f%n",
                    i + 1, tempy, (int) (tempeps * B), (int) Math.pow(2, i), ys[i + 1]);

            if (Math.abs(ys[i]) < Math.abs(ys[i + 1]) && i != 0) {
                U = tempU + tempeps * C * Math.pow(2, 0 - i + 1);
                System.out.printf("U%d = %.6f - (%.3f/%d) = %.6f%n",
                        i, tempU, (tempeps * C), (int) Math.pow(2, i - 1), U);

                tempU = U;
                tempy = ys[i];
                tempeps = ep[i];

                ys[i + 1] = tempy - tempeps * B * Math.pow(2, 0 - i);
                ep[i + 1] = (int) Math.signum(ys[i + 1]);

                System.out.printf("y%d = %.6f - (%d/%d) = %.6f%n",
                        i + 1, tempy, (int) (tempeps * B), (int) Math.pow(2, i), ys[i + 1]);
            }
            System.out.println();

        }
    }
}
