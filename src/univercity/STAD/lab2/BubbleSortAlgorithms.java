package univercity.STAD.lab2;

public class BubbleSortAlgorithms {
    public static void bubbleSort(int array[]) {
        int tmp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static void shakerSort(int array[]) {
        int buff;
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    buff = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buff;
                }
            }
            left++;
        } while (left < right);
    }

    public static void shakerStopSort(int array[]) {
        int buff;
        int left = 0;
        int right = array.length - 1;
        boolean sort = true;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                    sort = false;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    buff = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buff;
                    sort = false;
                }
            }
            left++;
        } while (left < right && !sort);
    }

    public static void bubbleSortNoStore(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    array[j] = array[j] + array[j - 1];
                    array[j - 1] = array[j] - array[j - 1];
                    array[j] = array[j] - array[j - 1];
                }
            }
        }
    }

    public static void shakerSortNoStore(int array[]) {
        int left = 0;
        int right = array.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i + 1] = array[i + 1] + array[i];
                    array[i] = array[i + 1] - array[i];
                    array[i + 1] = array[i + 1] - array[i];
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i - 1] = array[i - 1] + array[i];
                    array[i] = array[i + 1] - array[i];
                    array[i - 1] = array[i - 1] - array[i];
                }
            }
            left++;
        } while (left < right);
    }

    public static void shakerStopSortNoStore(int array[]) {
        int left = 0;
        int right = array.length - 1;
        boolean sort = true;
        do {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i + 1] = array[i + 1] + array[i];
                    array[i] = array[i + 1] - array[i];
                    array[i + 1] = array[i + 1] - array[i];
                    sort = false;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i - 1] = array[i - 1] + array[i];
                    array[i] = array[i + 1] - array[i];
                    array[i - 1] = array[i - 1] - array[i];
                    sort = false;
                }
            }
            left++;
        } while (left < right && !sort);
    }
}
