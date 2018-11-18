package lesson15;

import java.util.function.Predicate;

/**
 * Created by student on 18.11.2018.
 */
public class PredikatDemo2 {
    public static void main(String[] args) {
        Predicate<String> pr1 = str -> str.startsWith("J");
        Predicate<String> pr2= str -> str.startsWith("N");
        Predicate<String> pr3 = str -> str.endsWith("A");
        Predicate<String> pr4 = pr1.and(pr3);
        Predicate<String> pr5 = pr2.and(pr3);
        Predicate<String> pr6 = pr4.or(pr5);
        System.out.println(pr6.test("NfsdfsdA"));
    }
}
