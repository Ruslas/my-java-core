package repeat.repeat16;

import java.util.*;

public class CollDemo {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        Character c = 'A';
        for (int i = 0; i < 10; i++) {
            strings.add(c.toString());
            c++;
        }
        System.out.println(strings);
        strings.remove(3);
        System.out.println(strings);
        strings.remove("H");
        System.out.println(strings);

        Comparator<String> comparator = Comparator.comparing(String::length).thenComparing(String::compareTo);
        Set<String> stringSet = new TreeSet<>(comparator);
        stringSet.add("Mora");
        stringSet.add("Dora");
        stringSet.add("Tom");
        stringSet.add("Bongohuk");

        System.out.println(stringSet);
    }
}
