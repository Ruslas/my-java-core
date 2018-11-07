package lesson12.classwork;

import java.util.Formatter;

/**
 * Created by student on 04.11.2018.
 */
public class FormatDemo {
    public static void main(String[] args) {
        print("Ivanov", 5, "Mathematics");
    }

    public static void print(String sername, int mark, String subject) {
        System.out.printf("Студент %15s получил %3d по %10s", sername, mark, subject);
    }
}
