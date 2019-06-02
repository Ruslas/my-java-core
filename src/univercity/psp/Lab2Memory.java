package univercity.psp;

import java.io.*;

public class Lab2Memory {
    public static void main(String[] args) {
        double start = 0, finish = 1, delta = Math.pow(2, -10);
        double spy = 0.5;
        double dy = spy * delta;
        double dx = log2(spy) - log2(spy - dy);
        int nx = 10, ny = 10;
        System.out.println(dy + "\n" + dx);
        double x = start, y;
        int count = 0;

        try (PrintWriter writer = new PrintWriter("src\\univercity\\psp\\res.txt")) {

            writer.println("WIDTH = " + Math.max(nx, ny) +";");
            writer.println("ADDRESS_RADIX = DEC;");
            writer.println("DATA_RADIX = DEC;");
            writer.println("CONTENT");
            writer.println("BEGIN");
            while (x <= finish) {
                y = Math.pow(x, 0.5);
                System.out.println(x + " : " + y);

                writer.println((int) (x * 100000) + " : " + (int) (y * 100000) + ";");

                x += dx;
                count++;
            }

            writer.println("DEPTH = " + count +";");

            writer.println("END ;");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double log2(double b) {
        return Math.log(b) / Math.log(2);
    }
}
