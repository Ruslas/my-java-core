package myutil;

/**
 * Created by student on 11.11.2018.
 */
public class DoubleArray {
    public static void printArray(double[] arr, int signs) {
        StringBuilder b = new StringBuilder("%.f");
        b.insert(2, signs);

        if (arr == null)
            System.out.println("null");
        int iMax = arr.length - 1;
        if (iMax == -1)
            System.out.println("[]");

        System.out.print('[');
        for (int i = 0; ; i++) {
            System.out.printf(b.toString(), arr[i]);
            if (i == iMax) {
                System.out.println(']');
                break;
            }
            System.out.print(", ");
        }
    }

    public static String toString(double[] a, int signs) {
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder("%.f");
        b.insert(2, signs);
        StringBuilder d = new StringBuilder();
        d.append('[');
        for (int i = 0; ; i++) {
            d.append(String.format(b.toString(), a[i]));
            if (i == iMax)
                return d.append(']').toString();
            d.append(", ");
            if (i%5 == 0 && i !=0) d.append("\n");
        }
    }
}
