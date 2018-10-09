package lesson5.homeWork;

import java.util.Scanner;

public class Garland {
    private int[] bulbs = new int[32];

    Garland(int[] bulbs) {
        if (bulbs.length == this.bulbs.length) {
            System.arraycopy(bulbs, 0, this.bulbs, 0, this.bulbs.length);
        } else {
            System.out.println("Не корректный размер массива");
        }
    }

    public int[] getBulbs() {
        return this.bulbs;
    }

    public void printGarland() {
        System.out.print("-----");
        for (int i = 0; i < bulbs.length; i++) {
            System.out.print(getBulbs()[i]);
        }
        System.out.println("-----");
    }

    public void bulbsTickerL(int steps) {
        for (int i = 0; i < steps; i++) {
            System.arraycopy(this.bulbs, 1, this.bulbs, 0, this.bulbs.length - 1);
            printGarland();
        }
    }

    public void bulbsTickerR(int steps) {
        for (int i = 0; i < steps; i++) {
            System.arraycopy(this.bulbs, 0, this.bulbs, 1, this.bulbs.length - 1);
            printGarland();
        }
    }

    public void bulbsFlicker(int steps) {
        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < bulbs.length; j++) {
                bulbs[j] = Math.abs(bulbs[j] - 1);
            }
            printGarland();
        }
    }

    public void checkBulb(int pos) {
        if (bulbs[pos] == 1) {
            System.out.println(pos + "-я лампочка горит");
        } else {
            System.out.println(pos + "-я лампочка не горит");
        }
    }

    public void selectFunction() {
        String defaultMessage = "Вводите число из указанного диапазона";
        Scanner sc = new Scanner(System.in);
        String st = "";

        while (!(st.equals("stop"))) {
            System.out.println("Выберите функцию для гирлянды(0-3)\n" +
                    "Для левого сдвига введите 0\n" +
                    "Для правого сдвига введите 1\n" +
                    "Для мигания введите 2\n" +
                    "Для проверки лампочки введите 3");

            if (sc.hasNextInt()) {
                int sw = sc.nextInt();
                if (sw != 3) {
                    System.out.println("Введите число выбранных операций");
                } else {
                    System.out.println("Введите номер лампочки, которую проверить");
                }

                if (sc.hasNextInt()) {
                    int step = sc.nextInt();
                    swichMethod(sw, step, defaultMessage);
                } else {
                    System.out.println("Введите целое число");
                    st = sc.next();
                }
            } else {
                System.out.println("Введите целое число из указанного диапазона");
                st = sc.next();
            }
            System.out.println("Для завершения введите stop\n" +
                    "Для продолжения введите что угодно");
            st = sc.next();
        }
    }

    private void swichMethod(int sw, int step, String defaultMessage) {
        switch (sw) {
            case 0:
                bulbsTickerL(step);
                break;
            case 1:
                bulbsTickerR(step);
                break;
            case 2:
                bulbsFlicker(step);
                break;
            case 3:
                checkBulb(step);
                break;
            default:
                System.out.println(defaultMessage);
        }
    }
}
