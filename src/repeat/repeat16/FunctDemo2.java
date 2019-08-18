package repeat.repeat16;

import java.util.function.Function;

public class FunctDemo2 {
    public static void main(String[] args) {
        Function<Integer, String> f1 = n -> {
            if (n > 0) return "Положительное число";
            else if (n < 0) return "Отрицательное число";
            else return "Ноль";
        };

        System.out.println(f1.apply(-78));
    }
}
