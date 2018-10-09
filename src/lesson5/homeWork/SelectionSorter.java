package lesson5.homeWork;

public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;
                    min = array[j];
                }
            }
            if (array[pos] != array[i]){
            array[pos] = array[i];
            array[i] = min;
            }
        }
    }
}
