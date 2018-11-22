package lesson16.homework;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> someSet1 = new HashSet<>();
        someSet1.add("A");
        someSet1.add("B");
        someSet1.add("C");
        someSet1.add("D");
        someSet1.add("E");
        someSet1.add("F");
        someSet1.add("G");
        Set<String> someSet2 = new LinkedHashSet<>();
        someSet2.add("A");
        someSet2.add("C");
        someSet2.add("E");
        someSet2.add("G");
        someSet2.add("T");
        someSet2.add("H");
        Set<String> someSet3 = new HashSet<>();
        someSet3.add("A");
        someSet3.add("C");
        someSet3.add("F");
        someSet3.add("T");
        Set<Integer> someSet4 = new HashSet<>();
        someSet4.add(6);
        someSet4.add(9);
        System.out.println(intersect(someSet1, someSet2, someSet3));
        System.out.println(union(someSet2, someSet3, someSet4));
    }

    private static Set<?> intersect(Set<?>... sets) {
        Set<?> intersectSet = new LinkedHashSet<>(sets[0]); //?
        for (int i = 1; i < sets.length; i++) {
            intersectSet.retainAll(sets[i]);
        }
        return intersectSet;
    }

    private static Set<?> union(Set<?>... sets) {
        Set<Object> unionSet = new LinkedHashSet<>(sets[0]); //?
        for (int i = 1; i < sets.length; i++) {
            unionSet.addAll(sets[i]);
        }
        return unionSet;
    }
}
