package lesson11;

/**
 * Created by student on 28.10.2018.
 */
public class DoubleDemo {
    public static void main(String[] args) {
        Double d1 = 3476.354535534;
        Double d2 = new Double("23.4");
        Double d3 = 4.1;
        Double d4 = Double.valueOf("3.4");
        double d5 = Double.parseDouble("56.2332");
        Number in1 = 56;
        Integer in2 = 45;

        System.out.println(d1 + "; " + d2 + "; " + d3 + "; " + d4 + "; " + d5);
        System.out.println(d1.byteValue());
        System.out.println(d1.shortValue());
        System.out.println(d1.longValue());
        System.out.println(d1.floatValue());
        System.out.println(d1.intValue());
        System.out.println(in1);
    }
}
