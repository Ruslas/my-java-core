package repeat.repeat15.hierarchy;

public class CarException extends Exception {
    public static final String INCORRECT_YEAR = "incorrect year";
    public static final String INCORRECT_SPEED = "incorrect speed";

    CarException(String massage){
        super(massage);
    }
}
