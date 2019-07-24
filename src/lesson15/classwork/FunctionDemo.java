package lesson15.classwork;

import java.util.function.Function;

/**
 * Created by student on 18.11.2018.
 */
public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, String> function = i ->
        {
            if (i > 0) return "Positiv number";
            else if (i < 0) return "Negativ number";
            else return "Zero";
        };
        System.out.println(function.apply(3));
        System.out.println(function.apply(-3));
        System.out.println(function.apply(0));
    }
}
