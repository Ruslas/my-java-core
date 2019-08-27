package repeat.repeat17;

import java.util.Arrays;

public class MinMaxDemo {
    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, 2, 3, 4, 5, 6, 7, 12, 565, -3, -43, 56};
        MinMax<Integer> minMax = new MinMax<>(a);
        System.out.println(Arrays.toString(minMax.getArray()));
        System.out.println("Max " + minMax.computeMax());
        System.out.println("Min " + minMax.computeMin());
    }
}
