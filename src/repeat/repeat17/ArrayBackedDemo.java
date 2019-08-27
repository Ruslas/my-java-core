package repeat.repeat17;

import java.util.Arrays;
import java.util.List;

public class ArrayBackedDemo {
    public static void main(String[] args) {
        String[] array = {"арбуз", "вишня", "дыня"};
        List<String> list = Arrays.asList(array);

        System.out.println("Список:" + list);
        System.out.println("Массив:" + Arrays.toString(array));

        list.set(0, "яблоко");
        array[1] = "брусника";

        System.out.println("Список:" + list);
        System.out.println("Массив:" + Arrays.toString(array));

    }
}
