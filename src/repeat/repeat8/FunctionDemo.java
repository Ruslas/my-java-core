package repeat.repeat8;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> describeNumber = number ->
        {
            if (number > 0) {
                return "Положительное";
            } else if (number == 0) {
                return "Ноль";
            } else return "Отрицательное";
        };

        System.out.println(describeNumber.apply(-34));
        System.out.println(describeNumber.apply(0));
        System.out.println(describeNumber.apply(56));
    }

}
