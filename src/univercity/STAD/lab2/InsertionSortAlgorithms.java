package univercity.STAD.lab2;

public class InsertionSortAlgorithms {
    public static void insertionSort(int array[]) {
        int tmp, i, j;
        for (i = 0; i < array.length; i++) {
            tmp = array[i];
            for (j = i - 1; j >= 0 && array[j] > tmp; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
    }
}
