package lesson14.homework;

public class Calculator {
    public static <T extends Number, V extends Number> Number sum(T a, V b){
        return a.doubleValue()+b.doubleValue();
    }

    public static <T extends Number, V extends Number> Number multiply(T a, V b){
        return a.doubleValue()*b.doubleValue();
    }

    public static <T extends Number, V extends Number> Number divide(T a, V b){
        return a.doubleValue()/b.doubleValue();
    }

    public static <T extends Number, V extends Number> Number subtraction(T a, V b){
        return a.doubleValue()-b.doubleValue();
    }
}
