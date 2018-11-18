package lesson14.classwork;

import java.util.function.Predicate;

public class PredekatDemo1 {
    public static void main(String[] args) {
        Predicate<String> pr1 = (String str) -> str != null;
        System.out.println(pr1.test(""));
        System.out.println(pr1.test("wdwdw"));
        System.out.println(pr1.test(null));

        Predicate<String> pr2 = (String str) -> str.isEmpty();
        System.out.println(pr2.test(""));
        System.out.println(pr2.test("wdwdw"));
        Predicate<String> pr3 = pr1.and(pr2);
        System.out.println(pr3.test("2423wq"));
    }
}
