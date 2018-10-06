package lesson5;

import java.util.Scanner;

/**
 * Created by student on 30.09.2018.
 */
public class IfTask2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            checkn(n);
        }
    }

    private static void checkn(int n) {
        if (n > 0 && n < 10) {
            System.out.println("Число " + n + " меньше 10");
        } else {
            System.out.println("Число " + n + " меньше 0 или больше 10");
        }
    }
}
