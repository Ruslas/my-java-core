package lesson17.classwork;

/**
 * Created by student on 25.11.2018.
 */
public class ExeptionDemo {
    public static void main(String[] args) {
        try {
            verify("1232sfffasdqweqe123213fwfewfwewerwwr", "1111", "1112");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean verify(String login, String password, String confirm) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Too long login");
        }
        if (password.length() < 4 || password != confirm) {
            throw new WrongPasswordException("Too short password or wrong password confirm");
        }
        return true;
    }
}
