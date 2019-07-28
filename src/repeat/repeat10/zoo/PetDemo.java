package repeat.repeat10.zoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PetDemo {
    public static void main(String[] args) {
        Map<String, Pet> pets = new HashMap<>();
        Pet cat1 = new Cat("Murr", 4, "Black");
        Pet cat2 = new Cat("Myau", 6, "White");
        Pet dog1 = new Dog("Wau", 9, "Yur");
        Pet dog2 = new Dog("Tim", 14, "Bufl");
        Pet parrot1 = new Parrot("Kuku", 9, true);

        pets.put(cat1.getPetName(), cat1);
        pets.put(cat2.getPetName(), cat2);
        pets.put(dog1.getPetName(), dog1);
        pets.put(dog2.getPetName(), dog2);
        pets.put(parrot1.getPetName(), parrot1);

        System.out.println(pets);

        printKeys(pets);
    }

    private static void printKeys(Map<String, ?> map) {
        Set<String> keys = map.keySet();
        keys.forEach(System.out::println);
    }
}
