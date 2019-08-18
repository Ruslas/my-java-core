package repeat.repeat16;

import java.util.function.Function;
import java.util.function.Supplier;

public class FunctDemo3 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> (int)(Math.random()*10);

        String s = "Favan";
        Supplier<String> supplier = () -> s + "-fanata";

        System.out.println(s);
        System.out.println(supplier.get());
        System.out.println(s);

        Integer number = 6;

        Function<Integer, String> function = n -> number + ++n + "mm";

        System.out.println(function.apply(3));
    }
}
