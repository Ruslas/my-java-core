package repeat.repeat19;

import test.A;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NamedBoxDemo {
    public static void main(String[] args) {
        Set<NamedBox> namedBoxes = new HashSet<>();
        fillBoxSet(namedBoxes);
        for (NamedBox namedBox: namedBoxes){
            System.out.println(namedBox);
        }

        System.out.println("+++++++++++++++++");

        NamedBox namedBox1 = new NamedBox("Gav", 12, 11, 10);

        namedBoxes.add(namedBox1);

        for (NamedBox namedBox: namedBoxes){
            System.out.println(namedBox);
        }

        namedBox1.setName("Koooooo");

        System.out.println("++++++++++++++++++++");

        for (NamedBox namedBox: namedBoxes){
            System.out.println(namedBox);
        }

    }

    public static void fillBoxSet(Set<NamedBox> set) {
        Random random = new Random();

        for (int i = 'A'; i < 'Z'; i++) {
            int a = random.nextInt(20);
            int b = random.nextInt(20);
            int c = random.nextInt(20);
            String s = (char)i + "";
            set.add(new NamedBox(s, a, b, c));
        }
    }
}
