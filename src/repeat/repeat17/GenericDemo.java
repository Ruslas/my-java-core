package repeat.repeat17;

import lesson8.clinic.Dog;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String, Dog, Integer> generic = new Generic<>("F0", new Dog(), 45);
        generic.printTypes();
    }
}
