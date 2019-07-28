package repeat.repeat10;

import repeat.repeat9.Box;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(4, 5, 6, 34));
        boxes.add(new Box(8, 7, 5, 44));
        boxes.add(new Box(1, 8, 8, 67));
        boxes.add(new Box(3, 9, 3, 14));
        boxes.add(new Box(2, 3, 1, 78));

        Set<Box> heavyBoxes = new TreeSet<>();
        int wight = 40;

        chooseByWight(boxes, heavyBoxes, wight);

        System.out.println(boxes);
        System.out.println(heavyBoxes);
    }

    public static void chooseByWight(List<Box> boxes, Set<Box> heavyBoxes, int wight) {
        Iterator<Box> boxIterator = boxes.iterator();
        while (boxIterator.hasNext()) {
            Box currentBox = boxIterator.next();
            if (currentBox.getWeight() > wight) {
                heavyBoxes.add(currentBox);
                boxIterator.remove();
            }
        }
    }
}
