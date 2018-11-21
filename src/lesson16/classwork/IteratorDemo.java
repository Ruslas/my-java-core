package lesson16.classwork;

import lesson6.Phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        Phone myphone1 = new Phone("ET-342342", 213.3, "112242414");
        Phone myphone2 = new Phone("Tf-342342", 200.3, "222324241");
        Phone myphone3 = new Phone("HU-1231245", 120.3, "332352343");

        List<Phone> list = new ArrayList<>();
        list.add(myphone1);
        list.add(myphone2);
        list.add(myphone3);

        List<Phone> heavyPhones = sortList(list);

        System.out.println(list);
        System.out.println(heavyPhones);
    }

    private static List<Phone> sortList(List<Phone> p) {
        List<Phone> result = new ArrayList<>();
        Iterator<Phone> iterator = p.iterator();
        while (iterator.hasNext()) {
            Phone phone = iterator.next();
            if (phone.getWeight() > 200) {
                result.add(phone);
                iterator.remove();
            }
        }
        return result;
    }
}
