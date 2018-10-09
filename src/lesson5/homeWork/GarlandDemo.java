package lesson5.homeWork;

import java.util.Arrays;
import java.util.Random;

public class GarlandDemo {
    public static void main(String[] args) {
        final Random random = new Random();

        int[] bulbs = new int[32];
        for (int i = 0; i < bulbs.length; i++) {
            bulbs[i] = random.nextInt(2);
        }

        Garland garland = new Garland(bulbs);

        garland.printGarland();
        garland.bulbsFlicker(6);
        System.out.println("******************************************");
        garland.bulbsTickerL(6);
        System.out.println("******************************************");
        garland.bulbsTickerR(6);
        System.out.println("******************************************");
        garland.checkBulb(2);
        System.out.println("******************************************");
        garland.selectFunction();
    }
}
