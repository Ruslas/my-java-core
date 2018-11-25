package lesson17.classwork;

/**
 * Created by student on 25.11.2018.
 */
public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }
}
