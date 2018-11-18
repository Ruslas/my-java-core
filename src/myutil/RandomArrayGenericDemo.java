package myutil;

import java.util.Arrays;

public class RandomArrayGenericDemo {
    public static void main(String[] args) {
        Double[][] test = ArrayRandom.randomTwoArray(4,5, 0.0,30.0);
        Long [][] test2 = ArrayRandom.randomTwoArray(3,6);
        System.out.println(Arrays.deepToString(test));
        System.out.println(Arrays.deepToString(test2));
    }
}
