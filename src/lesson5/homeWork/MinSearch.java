package lesson5.homeWork;

import java.util.Arrays;

public class MinSearch {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 5, 6, 2, 3, 7, 2, 4},
                {5, 7, 9, 2, 4, 6, 8, 15},
                {12, 45, 23, 78, 11, 59, 41, 17},
                {32, 44, 12, 93, 15, 71, 10, 33},
                {21, 47, 51, 43, 76, 28, 90, 19}
        };

        int[][] arrResalt = new int[5][2];

        minLineToErrey(arr1, arrResalt);
        System.out.println(Arrays.deepToString(arrResalt));
    }

    public static void minLineToErrey(int[][] arr, int[][] arrResalt) {
        int k = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }

            if (n < arrResalt[0].length) {
                arrResalt[k][n] = min;
            } else {
                n = 0;
                k++;
                arrResalt[k][n] = min;
            }
            n++;
        }
    }
}
