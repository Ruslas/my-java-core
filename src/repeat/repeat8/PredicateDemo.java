package repeat.repeat8;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<String> notNull = s -> !s.isEmpty();
        System.out.println(notNull.test("adds"));
        System.out.println(notNull.test(""));

        Predicate<String> specialCondition = s -> (s.startsWith("J") || s.startsWith("N")) && s.endsWith("A");
        System.out.println(specialCondition.test("JAVA"));
        System.out.println(specialCondition.test("NAVA"));
        System.out.println(specialCondition.test("FAVA"));
        System.out.println(specialCondition.test("JAVO"));
        System.out.println(specialCondition.test("VAVO"));
    }
}
