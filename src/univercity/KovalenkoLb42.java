package univercity;

import java.util.Arrays;

public class KovalenkoLb42 {
    public static void main(String[] args) {
        float[][] s = new float[][]{
                {4, 5, 6, 10},
                {1, 8, 7, 11},
                {8, 7, 12, 2},
                {12, 3, 11, 13}
        };
        System.out.println(Arrays.deepToString(new Hungarian(s).execute()));
    }
}
