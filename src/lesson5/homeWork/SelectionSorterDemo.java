package lesson5.homeWork;

import myutil.RandomArray;

import java.util.Arrays;

public class SelectionSorterDemo {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr = RandomArray.randomArray(20, 0, 50);
        System.out.println(Arrays.toString(arr));
        SelectionSorter.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
