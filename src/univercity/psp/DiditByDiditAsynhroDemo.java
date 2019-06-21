package univercity.psp;

public class DiditByDiditAsynhroDemo {
    public static void main(String[] args) {
        double A = 0.481;
        double B = 3.81;
        double C = 1;
        int[] ep = new int[100];
        dbdas(A, B, C, 0.001, ep);
    }

    public static void dbdas(double A, double B, double C, double delta, int[] ep) {
        double y = A;
        double U = 0;
        double tempy = 0, tempU = 0;
        int eps = 1;
        for (int i = 0; Math.abs(y) > delta; i++) {

            if (eps != 0) {
                tempy = y;
                tempU = U;
            }
            y = tempy - B * Math.pow(2, 0 - i);

            if (y < 0) {
                eps = 0;
            } else {
                eps = 1;
            }
            ep[i] = eps;

            if (eps != 0) {
                U = tempU + C * Math.pow(2, 0 - i);
            }
            System.out.printf("y%d = %.5f - %.2f/%d = %.5f%n",
                    i+1, tempy, B, (int) Math.pow(2, i), y);
            if (eps != 0) {
                System.out.printf("U%d = %.5f + %d/%d = %.5f%n",
                        i+1, tempU, (int)C, (int) Math.pow(2, i), U);
            } else {
                System.out.println("-=-=-=-=-=-=-=-=-=-==--==---=-");
            }
            System.out.println("---" + eps + "---");
        }
    }
}
