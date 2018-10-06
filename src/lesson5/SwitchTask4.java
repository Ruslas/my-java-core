package lesson5;

import java.util.Scanner;

/**
 * Created by student on 30.09.2018.
 */
public class SwitchTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");

        if (sc.hasNextInt()) {
            System.out.println("....");
            int n = sc.nextInt();

            switch (n){
                case 1:
                    System.out.println("Понедельник");
                    break;
                case  2:
                    System.out.println("Вторник");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Среда, Четверг или Пятница");
                    break;
                case 6:
                case 7:
                    System.out.println("Выходной");
                    break;
                    default:
                        System.out.println("Введенное число не соответствует ни одному дню недели");
            }

        }else System.out.println("Error!!!");
    }
}
