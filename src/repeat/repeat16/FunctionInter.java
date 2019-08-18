package repeat.repeat16;

import java.util.function.Predicate;

public class FunctionInter {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> !s.equals(null);
        String s = "fwewf";
        System.out.println(predicate.test(s));
    }
}
