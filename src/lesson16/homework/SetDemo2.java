package lesson16.homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetDemo2 {
    public static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку чисел");
        if (sc.hasNextLine()) {
            String numbersStr = sc.nextLine();
            String[] numbers = numbersStr.split(" ");
            for (int i = 0; i < numbers.length; i++) {
                num.add(Integer.parseInt(numbers[i]));
            }
            Iterator<Integer> iter = num.iterator();
            while (iter.hasNext()) {
                System.out.print(iter.next() + " ");
            }
        }
    }
}
