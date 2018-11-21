package lesson15.classwork;

import lesson6.Phone;

import java.util.*;

/**
 * Created by student on 18.11.2018.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        Phone myphone1 = new Phone("ET-342342", 213.3, "112242414");
        Phone myphone2 = new Phone("Tf-342342", 200.3, "222324241");
        Phone myphone3 = new Phone("HU-1231245", 120.3, "332352343");
        List<Phone> phones = new ArrayList<>();
        phones.add(myphone1);
        phones.add(myphone2);
        phones.add(myphone3);

        phones.get(0).setWeight(phones.get(0).getWeight() + 50);

        printArray(phones);

        phones.remove(phones.size() - 1);
        System.out.println();
        printArray(phones);

        Phone[] phones1 = phones.toArray(new Phone[0]);
        System.out.println(Arrays.toString(phones1));

        SortedSet<Phone> set = new TreeSet<>();
        set.add(myphone1);
        set.add(myphone2);
        set.add(myphone3);
        set.forEach((s) -> System.out.println("Phone " + s));
    }

    private static void printArray(List<Phone> phones) {
        for (Phone p : phones) {
            System.out.printf("Phone %s: ", phones.indexOf(p));
            p.phoneInfo();
        }
    }
}
