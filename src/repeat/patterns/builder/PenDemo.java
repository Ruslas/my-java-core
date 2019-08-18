package repeat.patterns.builder;

public class PenDemo {
    public static void main(String[] args) {
        Pen pen = new Pen();

        try {
            pen = new Pen.Builder().
                    withPenColor(PenColors.BLUE).
                    withMark("BTV").withThickness(1).build();

            System.out.println(pen.getPenFullness());

            pen.wright('g');
            pen.wright("Beg");

            System.out.println(pen.getPenFullness());

        } catch (PenException e) {
            System.out.println(e.getMessage());
        }

    }
}
