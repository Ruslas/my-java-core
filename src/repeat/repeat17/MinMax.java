package repeat.repeat17;

import java.util.Arrays;

public class MinMax<T extends Number> {
    private T[] array;
    private T min;
    private T max;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
        max = null;
        min = null;
    }

    public T getMin() {
        return min;
    }

    private void setMin(T min) {
        this.min = min;
    }

    public T getMax() {
        return max;
    }

    private void setMax(T max) {
        this.max = max;
    }

    public T computeMin() {
        if (min.equals(Integer.MIN_VALUE)) {
            T temp = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].doubleValue() < temp.doubleValue())
                    temp = array[i];
            }
            min = temp;
        }
        return min;
    }

    public T computeMax() {
        if (max.equals(Integer.MAX_VALUE)) {
            T temp = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i].doubleValue() > temp.doubleValue())
                    temp = array[i];
            }
            max = temp;
        }
        return max;
    }
}
