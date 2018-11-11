package myutil;

/**
 * Created by student on 11.11.2018.
 */
public class DoubleArrayDemo {
    public static void main(String[] args) {
        double[] array = {44.2132412, 12.45474575, 89.1231442};
        DoubleArray.printArray(array, 3);
        System.out.println(DoubleArray.toString(array, 3));
    }
}
