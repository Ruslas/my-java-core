package lesson3.Task3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean finish = false;
        System.out.println("Введите целое число: \nДля завершения программмы введите 0");

        while (finish == false) {

            if (sc.hasNextInt())
            {
                int i = sc.nextInt();
                int o = i % 2;
                if (i == 0)
                {
                    finish = true;
                    System.out.println("Завершение программы");
                }
                else if (o == 0) System.out.println("Это четное число");
                else System.out.println("Это нечетное число");
            }
            else System.out.println("Вы ввели не целое число");
        }
    }

}
