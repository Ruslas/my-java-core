package lesson3.Task4;

import java.util.Scanner;

public class RightSum {
    int a;
    int b;

    public static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b;

        while (true) {

            System.out.println("Введите два слогаемых");
            try {
                a = sc.nextInt();
                b = sc.nextInt();
                System.out.println("a+b = " + sum(a, b));
            } catch (RuntimeException er) {
                System.err.println("Oшибка ввода " + er);
            }
            System.out.println("Для продолжения введите любой символ \n" +
                                "Для выхода введите q");
            String str = sc.next();
            if("q".equals(str)) {
                break;
            }
        }
    }
}
