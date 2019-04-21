package univercity.STAD.lab2;

import myutil.RandomArray;
import univercity.STAD.lab1.WatchTime;

import java.util.Arrays;

public class SortDemo {
    public static void main(String[] args) {
        int array[] = RandomArray.randomArray(10000, 0, 99);
        WatchTime timer = new WatchTime();
        /*timer.start();
        InsertionSortAlgorithms.insertionSort(array);
        timer.stop();
        System.out.println("Вставками " + timer.getElapsedTime());

        timer.start();
        BubbleSortAlgorithms.bubbleSort(array);
        timer.stop();
        System.out.println("Пузырек " + timer.getElapsedTime());

        timer.start();
        BubbleSortAlgorithms.shakerSort(array);
        timer.stop();
        System.out.println("Шейкер " + timer.getElapsedTime());

        timer.start();
        BubbleSortAlgorithms.shakerStopSort(array);
        timer.stop();
        System.out.println("Шейкер с остановкой " + timer.getElapsedTime());

        timer.start();
        BubbleSortAlgorithms.bubbleSortNoStore(array);
        timer.stop();
        System.out.println("Пузырек без хранения " + timer.getElapsedTime());

        timer.start();
        BubbleSortAlgorithms.shakerSortNoStore(array);
        timer.stop();
        System.out.println("Шейкер без хранения " + timer.getElapsedTime());

        timer.start();
        BubbleSortAlgorithms.shakerStopSortNoStore(array);
        timer.stop();
        System.out.println("Шейкер с остановкой без хранения " + timer.getElapsedTime());*/

        timer.start();
        QuickSort.quickSort(array);
        timer.stop();
        System.out.println(timer.getElapsedTime());
    }
}
