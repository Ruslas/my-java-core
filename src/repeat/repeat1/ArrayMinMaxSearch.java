package repeat.repeat1;

import java.util.Arrays;

public class ArrayMinMaxSearch {
    public static void main(String[] args) {
        int[][] array = {{45, 12, 324, 56, 13, 89, 15, 7},
                {34, 21, 675, 12, 90, 179, 117, 4},
                {35, 44, 91, 37, 72, 59, 123, 56},
                {47, 234, 573, 157, 464, 81, 45, 7},
                {57, 89, 12, 636, 68, 128, 56, 3}};

        int[][] resalt = new int[5][2];

        for (int i = 0; i < resalt.length; i++) {
            resalt[i][0] = getMin(array[i]);
            resalt[i][1] = getMax(array[i]);
        }

        System.out.println(Arrays.deepToString(resalt));
    }

    public static int getMin(int... arr) {
        int min = arr[0];
        for (int ar : arr) {
            min = ar < min ? ar : min;
        }
        return min;
    }

    public static int getMax(int... arr) {
        int max = arr[0];
        for (int ar : arr) {
            max = ar > max ? ar : max;
        }
        return max;
    }
}
