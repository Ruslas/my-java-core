package lesson4.task2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        final Random negativeRandom = new Random();
        int bulbs = negativeRandom.nextInt(2147483647) - 2147483647;

        Garland garland = new Garland(bulbs);
        System.out.println("bulbs= " + garland.getBulbs());
        garland.printBulbs();
        garland.checkFirstBulb();
/*       garland.bulbsFlicker(5);
        garland.bulbsTickerL(6);
        garland.bulbsTickerR(5);*/
        garland.selectFunction();

    }
}
