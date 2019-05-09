package univercity.psp;

public class VMDemo {
    public static void main(String[] args) {
        double x = 1.284;
        double y = 1 - x, fi = 0;
        int[] ep = new int[14];
        PV(x, 14);
    }

    public static void PV(double x, double kmax) {
        double y = 1 - x, fi = 0;
        double tempx = 10000, tempy, tempfi = fi, smally=1000;
        int tempi;
        int smK = 0;
        int i = 0, q = 2, eps = 1;
        for (int k = 0; k < kmax; k++) {

            tempi = i;
            i = k / q + 1;

            if (tempfi != fi) {
                if (y < 0) {
                    eps = -1;
                } else eps = 1;
            }
            System.out.println("k = " + k + "\t Eps = " + eps);

            tempx = x;
            tempy = y;
            tempfi = fi;

            System.out.println("tx = " + tempx + "\n" + "ty = " + tempy + "\n" + "tfi = " + tempfi);

            x = tempx * (1 + eps * Math.pow(2, 0 - i));

            y = tempy - eps * tempx * Math.pow(2, 0 - i);

            fi = tempfi - Math.log(1 + eps * Math.pow(2, 0 - i));

            if ( Math.abs(y) < Math.abs(smally)){
                smally = y;
                smK = k;
            }

            System.out.println("x = " + x + "\n" + "y = " + y + "\n" + "fi = " + fi);

            System.out.println("i = " + i + "\t tempi = " + tempi);

            if (tempi == i) {
                if (Math.abs(1 - Math.abs(x)) > Math.abs(1 - Math.abs(tempx))) {
                    fi = tempfi;
                    x = tempx;
                    y = tempy;
                    System.out.println("++++++++++++++++++++");
                }
            }
            System.out.println();
        }

        System.out.println("K = " + smK + "\t" + smally);
    }
}
