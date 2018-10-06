package lesson5;

import java.util.Scanner;

/**
 * Created by student on 30.09.2018.
 */
public class IfTask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");

        if (sc.hasNextInt()) {
            System.out.println("....");
            int n = sc.nextInt();

             if (n == 1) {
                System.out.println("Понедельник");
            } else if (n == 2) {
                System.out.println("Вторник");
            } else if (n == 6 || n == 7) {
                System.out.println("Выходной");
            } else if (n > 2 && n < 6) {
                System.out.println("Среда, Четверг или Пятница");
            } else {
                System.out.println("Введенное число не соответствует ни одному дню недели");
            }

        }
    }
}
