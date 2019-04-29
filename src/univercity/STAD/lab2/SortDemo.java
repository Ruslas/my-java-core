package univercity.STAD.lab2;

import myutil.RandomArray;
import univercity.STAD.lab1.WatchTime;

public class SortDemo {
    public static void main(String[] args) {
        int array[] = RandomArray.randomArray(10000, 0, 1000);
        WatchTime timer = new WatchTime();
        timer.start();
        InsertionSortAlgorithms.insertionSort(array);
        timer.stop();
        System.out.println("Вставками " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        InsertionSortAlgorithms.insertionSortNoStore(array);
        timer.stop();
        System.out.println("Вставками без хранения " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        BubbleSortAlgorithms.bubbleSort(array);
        timer.stop();
        System.out.println("Пузырек " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        BubbleSortAlgorithms.shakerSort(array);
        timer.stop();
        System.out.println("Шейкер " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        BubbleSortAlgorithms.shakerStopSort(array);
        timer.stop();
        System.out.println("Шейкер с остановкой " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        BubbleSortAlgorithms.bubbleSortNoStore(array);
        timer.stop();
        System.out.println("Пузырек без хранения " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        BubbleSortAlgorithms.shakerSortNoStore(array);
        timer.stop();
        System.out.println("Шейкер без хранения " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        BubbleSortAlgorithms.shakerStopSortNoStore(array);
        timer.stop();
        System.out.println("Шейкер с остановкой без хранения " + timer.getElapsedTime());

        array = RandomArray.randomArray(10000, 0, 1000);
        timer.start();
        QuickSort.quickSort(array);
        timer.stop();
        System.out.println("Быстрая сортировка " + timer.getElapsedTime());
    }
}
