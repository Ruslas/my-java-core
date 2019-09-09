package repeat.repeat18;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        String[] strings = "qqd qwdw qdwdq uuu iiii dddd".split(" ");
        System.out.println(Arrays.toString(strings));
        smash(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void smash(Object[] objects){
        Random random = new Random();
        Object temp;
        int halfLength = objects.length/2;
        int rand;
        for (int i = 0; i < halfLength; i++){
            rand = random.nextInt(halfLength) + halfLength;
           temp = objects[i];
           objects[i] = objects[rand];
           objects[rand] = temp;
        }
    }

}
