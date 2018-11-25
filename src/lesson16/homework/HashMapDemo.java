package lesson16.homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 25.11.2018.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> toys = new HashMap<>();
        toys.put("sqere", new Toy("sqere", 34));
        toys.put("doll", new Toy("doll", 50));
        toys.put("car", new Toy("car", 28));

        printValues(toys);
        printKeys(toys);
        printKayValue(toys);
    }

    private static void printKayValue(Map<String, Toy> toys) {
        Set<Map.Entry<String, Toy>> pairs = toys.entrySet();
        pairs.forEach((s)-> System.out.println("Key " + s.getKey() + " Value " + s.getValue() ));
    }

    private static void printKeys(Map<String, Toy> toys) {
        Set<String> set = toys.keySet();
        for (String key: set){
            System.out.println("Key" + key);
        }
    }

    private static void printValues(Map<String, Toy> toys) {
        Collection<Toy> values = toys.values();
        for (Toy toy: values) {
            System.out.println("Value" + toy);
        }
    }
}
