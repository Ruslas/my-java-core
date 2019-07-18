package repeat.repeat1;

import java.util.Arrays;

public class DeepArray {
    public static void main(String[] args) {
        String[][] arr = new String[3][6];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = "" + (char) ('a' + i) + (j + 1);
            }
        for (String[] ar : arr) {
            System.out.println();
            for (String a : ar) {
                System.out.print(a + "\t");
            }
        }
    }
}
