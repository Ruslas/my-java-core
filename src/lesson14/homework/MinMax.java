package lesson14.homework;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T searchMin() {
        T min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].doubleValue() < min.doubleValue()) {
                min = array[i];
            }
        }
        return min;
    }

    public T searchMax() {
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].doubleValue() > max.doubleValue()) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MinMax<?> minMax = (MinMax<?>) o;

        return Arrays.deepEquals(array, minMax.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
