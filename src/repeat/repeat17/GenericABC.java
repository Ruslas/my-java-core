package repeat.repeat17;

public class GenericABC {
    public static void main(String[] args) {
        GenericA<Double> genericA = new GenericA<>(45.3);
        GenericB<String, Double> genericB = new GenericB<>(45.1, "dfd");
        NotGenericC notGenericC = new NotGenericC(2, "qqq");

        GenericA<String> genericB1 = new GenericB<Integer, String>("fff", 43);

        genericB1.printInfo();
    }

}
