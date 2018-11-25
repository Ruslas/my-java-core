package lesson17.classwork;

/**
 * Created by student on 25.11.2018.
 */
public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
    }
}
