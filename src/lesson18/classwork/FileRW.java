package lesson18.classwork;

import java.io.*;

public class FileRW {
    public static void main(String[] args) {
        try (Reader reader = new FileReader("src\\lesson18\\classwork\\a.txt");
             Writer writer = new FileWriter("src\\lesson18\\classwork\\b.txt")) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                writer.write(symbol);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
