package lesson12.classwork;

import java.util.Formatter;

/**
 * Created by student on 04.11.2018.
 */
public class FormatDemo {
    public static void main(String[] args) {
        print("Ivanov", 5, "Math");

    }

    public static void print(String sername, int mark, String subject) {
        Formatter formatter = new Formatter();
        formatter.format("Студент %s получил %d по %s", sername, mark, subject);
        System.out.println(formatter);
    }

}
