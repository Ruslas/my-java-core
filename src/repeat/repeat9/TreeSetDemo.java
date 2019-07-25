package repeat.repeat9;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Box> boxes = new TreeSet<>();
        boxes.add(new Box(4,5,6,34));
        boxes.add(new Box(8,7,5,44));
        boxes.add(new Box(1,8,8,67));
        boxes.add(new Box(3,9,3,14));
        boxes.add(new Box(2,3,1,78));

        for (Box box: boxes){
            System.out.println(box);
        }
    }
}
