package repeat.repeat9;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        Comparator<Person> personComparator =
                Comparator.comparing(Person::getLastName)
                        .thenComparing(Person::getAge);

        SortedSet<Person> people = new TreeSet<>(personComparator);
        people.add(new Person("Gucha", "Merzlyakov", 28));
        people.add(new Person("Lida", "Hanova", 23));
        people.add(new Person("Foll", "Kol", 29));
        people.add(new Person("Bill", "Kol", 20));

        people.forEach(System.out::println);
    }
}
