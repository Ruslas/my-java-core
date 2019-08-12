package repeat.repeat15;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExceptionTest {
    public static void main(String[] args) throws SQLException {
        List<Integer> list = new ArrayList<>();
        boolean a = true;
        if (a) {
            throw new SQLException();
        }
        try {
            System.out.println("In try");
            if (a) {
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("In catch");
        } finally {
            System.out.println("In finally");
        }
        System.out.println("after try block");
    }
}
