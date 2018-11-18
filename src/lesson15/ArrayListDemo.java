package lesson15;

import lesson6.Phone;

import java.util.ArrayList;
import java.util.List;

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
    }

    private static void printArray(List<Phone> phones) {
        for (Phone p : phones) {
            System.out.printf("Phone %s: ", phones.indexOf(p));
            p.phoneInfo();
        }
    }
}
