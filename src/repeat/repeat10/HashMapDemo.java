package repeat.repeat10;

import lesson16.homework.Toy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> product = new HashMap<>();
        Toy toy1 = new Toy("Car", 120);
        Toy toy2 = new Toy("Doll", 180);
        Toy toy3 = new Toy("Lego", 360);
        Toy toy4 = new Toy("Teddy", 150);
        Toy toy5 = new Toy("Assault rifle ", 240);

        product.put(toy1.getName(), toy1);
        product.put(toy2.getName(), toy2);
        product.put(toy3.getName(), toy3);
        product.put(toy4.getName(), toy4);
        product.put(toy5.getName(), toy5);

        System.out.println(product);

        printValues(product);
        printKeys(product);
        printEntrySet(product);

    }

    private static void printEntrySet(Map<String, Toy> product) {
        Set<Map.Entry<String, Toy>> pairs = product.entrySet();
        pairs.forEach((s) -> System.out.println("Kay " + s.getKey() + " Value " + s.getValue()));
    }

    private static void printKeys(Map<String, Toy> product) {
        Set<String> keys = product.keySet();
        for (String key: keys){
            System.out.println("Key " + key);
        }
    }

    private static void printValues(Map<String, Toy> product) {
        Collection<Toy> values = product.values();
        for (Toy toy: values){
            System.out.println("Value " + toy);
        }
    }
}
