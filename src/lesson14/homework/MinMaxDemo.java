package lesson14.homework;

import java.util.Arrays;

public class MinMaxDemo {
    public static void main(String[] args) {
        MinMax<Integer> test1 = new  MinMax<>(new Integer[]{2,8,12,90,31,156,1,45});
        MinMax<Double> test2 = new  MinMax<>(new Double[]{2.3,8.2,57.9,12.6,0.1,134.5,11.4});
        System.out.println(Arrays.toString(test1.getArray()));
        System.out.println(test1.searchMin());
        System.out.println(test1.searchMax());
        System.out.println(Arrays.toString(test2.getArray()));
        System.out.println(test2.searchMin());
        System.out.println(test2.searchMax());
    }
}
