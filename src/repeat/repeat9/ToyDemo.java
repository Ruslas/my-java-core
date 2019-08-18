package repeat.repeat9;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ToyDemo {
    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        toyMap.put("Mishka", new Toy("Mishka", 120, "China"));
        toyMap.put("Mashinka", new Toy("Mashinka", 290, "China"));
        toyMap.put("Kukla", new Toy("Kukla", 150, "Pakistan"));
        toyMap.put("Kran", new Toy("Kran", 360, "German"));
        toyMap.put("Lodka", new Toy("Lodka", 230, "China"));
        printMap(toyMap);
        printNames(toyMap);
        printToys(toyMap);
        BiPredicate<Toy, Integer> toyByPrice = (toy, integer) -> toy.getPrice() < integer;
        System.out.println();
        toyByPrice(toyMap, toyByPrice, 200);
    }

    public static void toyByPrice(Map<String, Toy> toyMap, BiPredicate<Toy, Integer> toyByPrice, Integer price) {
        Set<Map.Entry<String, Toy>> toySet = toyMap.entrySet();
        for (Map.Entry<String, Toy> entry : toySet) {
            Toy t = entry.getValue();
            if (toyByPrice.test(t, price))
                System.out.println(entry.getKey() + " : "
                        + t.getPrice() + "₴ made in "
                        + t.getManufacture());
        }
    }

    public static void printToys(Map<String, Toy> toyMap) {
        Collection<Toy> toyCollection = toyMap.values();
        for (Toy toy : toyCollection) {
            System.out.println(toy);
        }
    }

    public static void printNames(Map<String, Toy> toyMap) {
        Set<String> nameSet = toyMap.keySet();
        for (String key : nameSet) {
            System.out.println(key);
        }
    }

    public static void printMap(Map<String, Toy> toyMap) {
        Set<Map.Entry<String, Toy>> toySet = toyMap.entrySet();
        for (Map.Entry<String, Toy> entry : toySet) {
            System.out.println(entry.getKey() + " : "
                    + entry.getValue().getPrice() + "₴ made in "
                    + entry.getValue().getManufacture());
        }
    }
}
