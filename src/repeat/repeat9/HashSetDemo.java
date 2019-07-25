package repeat.repeat9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Харьков");
        hashSet.add("Киев");
        hashSet.add("Львов");
        hashSet.add("Кременчуг");
        hashSet.add("Харьков");

        System.out.println(hashSet);Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Харьков");
        linkedHashSet.add("Киев");
        linkedHashSet.add("Львов");
        linkedHashSet.add("Кременчуг");
        linkedHashSet.add("Харьков");

        System.out.println(linkedHashSet);

    }
}
