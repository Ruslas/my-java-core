package repeat.repeat7;

public class GenericsDemo {
    public static void main(String[] args) {
        SomeGenerics<String, Integer, Boolean> someGenerics =
                new SomeGenerics<>("Simple", 45, true);
        someGenerics.printTypes();
    }
}
