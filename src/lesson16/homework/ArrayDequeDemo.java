package lesson16.homework;

import lesson6.Phone;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Phone> phones = new ArrayDeque<>();
        phones.offer(new Phone("ET-342342", 213.3, "112242414"));
        phones.offer(new Phone("Tf-342342", 200.3, "222324241"));
        phones.offer(new Phone("HU-1231245", 120.3, "332352343"));
        printInfo(phones);
        while (phones.size()!=0){
            phones.poll();
        }
        printInfo(phones);
    }

    public static void printInfo(Deque<Phone> phones) {
        for (Phone phone: phones){
            phone.phoneInfo();
        }
    }
}
