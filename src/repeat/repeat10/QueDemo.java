package repeat.repeat10;

import repeat.repeat9.Box;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class QueDemo {
    public static void main(String[] args) {
        Queue<Box> boxes = new ArrayDeque<>();
        boxes.offer(new Box(4, 5,6,7));
        boxes.offer(new Box(4, 6,9,2));
        boxes.offer(new Box(8, 2,3,9));

        System.out.println(boxes);

        boxes.forEach((s) -> System.out.println(boxes.poll()));

        System.out.println(boxes);
    }
}
