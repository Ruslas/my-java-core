package lesson4.task2;

import java.util.Scanner;

public class Garland {
    private int bulbs;

    public int getBulbs() {
        return bulbs;
    }

    public void printBulbsS(){
        System.out.print("---");
        for (int i = Integer.numberOfLeadingZeros(this.bulbs); i>0; i-- ){
           System.out.print("0");
       }
        System.out.println(Integer.toBinaryString(this.bulbs) + "---");
    }

    public void printBulbs(){
            System.out.println("---" + Integer.toBinaryString(this.bulbs) + "---");
        }

    public void bulbsTickerL (int steps){
        for (int i=0; i<steps; i++) {
            this.bulbs = bulbs << 1;
            printBulbsS();
        }
    }

    public void bulbsTickerR (int steps){
        for (int i=0; i<steps; i++) {
            this.bulbs = bulbs >> 1;
            printBulbsS();
        }
    }


    public void bulbsFlicker (int steps){
        for (int i=0; i<steps; i++) {
        this.bulbs = ~bulbs;
        printBulbsS();
        }
    }

    public void checkFirstBulb(){
        int check = bulbs & 1;
        if (check == 1){
            System.out.println("Первая лампочка горит");
        }
        else {
            System.out.println("Первая лампочка не горит");
        }
    }

    Garland (int bulbs){
        this.bulbs = bulbs;
    }

    public void selectFunction() {
        String defaultMessage = "Вводите число из указанного диапазона";
        Scanner sc = new Scanner(System.in);
        String st = "";

        while (!(st.equals("stop"))) {
            System.out.println("Выберите функцию для гирлянды(0-2)\n" +
                    "Для левого сдвига введите 0\n" +
                    "Для правого сдвига введите 1\n" +
                    "Для мигания введите 2");

            if (sc.hasNextInt()) {
                int sw = sc.nextInt();
                System.out.println("Введите число выбранных операций");

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
            default:
                System.out.println(defaultMessage);
        }
    }

}


