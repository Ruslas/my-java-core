package lesson16.classwork;

import lesson6.Phone;

import java.util.ArrayDeque;

public class QueDemo {
    public static void main(String[] args) {
        Phone myphone1 = new Phone("ET-342342", 213.3, "112242414");
        Phone myphone2 = new Phone("Tf-342342", 200.3, "222324241");
        Phone myphone3 = new Phone("HU-1231245", 120.3, "332352343");
        ArrayDeque<Phone>  phones = new ArrayDeque<>();
        phones.offer(myphone1);
        phones.offer(myphone2);
        phones.offer(myphone3);
        while (phones.size() > 0){
            System.out.println(phones.pop());
        }
    }
}
