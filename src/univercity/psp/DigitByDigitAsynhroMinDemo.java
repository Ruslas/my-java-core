package univercity.psp;

public class DigitByDigitAsynhroMinDemo {
    public static void main(String[] args) {
        double A = 3.15;
        double B = 24.1;
        double C = 0.118;
        int[] ep = new int[100];
        dbdasm(A, B, C, 0.001, ep);
    }

    public static void dbdasm(double A, double B, double C, double delta, int[] ep) {
        double y = A;
        double U = 0;
        double yplus = y, Uplus = U;
        double tempy = y, tempU = U;
        int eps = (int) Math.signum(y);
        int epsplus = eps;
        int tempeps = eps;
        for (int i = 0; i < 20; i=i+2) {

            y = tempy - tempeps * B * Math.pow(2, 0 - i);
            eps = (int) Math.signum(y);
            yplus = tempy - tempeps * B * Math.pow(2, -1 - i);
            epsplus = (int) Math.signum(yplus);

            System.out.println("i = " + i + "\n" + "y = " + tempy + " - " +
                    tempeps*B + "/" + Math.pow(2, i) + " = " + y);
            System.out.println("yplus = " + tempy + " - " +
                    tempeps*B + "/" + Math.pow(2, i+1) + " = " + yplus);

            if (Math.abs(yplus) > Math.abs(y)){
                U = tempU + tempeps * C * Math.pow(2, 0 - i);

                System.out.println("U = " + tempU + " + " +
                        tempeps*C + "/" + Math.pow(2, i) + " = " + U);
                tempy = y;
                tempU = U;
                tempeps = eps;
                i--;

            } else {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            }
            System.out.println();
        }
    }
}
