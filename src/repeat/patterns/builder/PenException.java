package repeat.patterns.builder;

public class PenException extends Exception{
    public static final String ILLEGAL_PEN_THICKNESS = "Pen thickness should be 0.1-3 mm";
    public static final String NOT_ENOUGH_INK = "Not enough ink";

    PenException(String massage){
        super(massage);
    }
}
