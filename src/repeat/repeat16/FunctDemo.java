package repeat.repeat16;

import repeat.patterns.builder.Pen;
import repeat.patterns.builder.PenColors;
import repeat.patterns.builder.PenException;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctDemo {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.startsWith("J");
        Predicate<String> predicate1 = s -> s.startsWith("N");
        Predicate<String> predicate2 = s -> s.endsWith("A");
        System.out.println(predicate.or(predicate1).and(predicate2).test("JAVA"));

        Consumer<Pen> consumer = pen ->
                System.out.println("Заполненность ручки " + pen.getPenFullness());
        Consumer<Pen> consumer1 = pen ->
                System.out.println("Толщина пера " + pen.getThickness() + "mm");

        try {
            Pen pen = new Pen.Builder().
                    withThickness(2).
                    withMark("DOH").
                    withPenColor(PenColors.BLUE).withPenFullness().build();
            pen.wright("sggefwewegwegwgwegwegwegwgdsrerg");
            consumer.andThen(consumer1).accept(pen);
        } catch (PenException e) {
            System.out.println(e.getMessage());
        }
    }
}
