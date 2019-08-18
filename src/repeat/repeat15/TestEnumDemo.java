package repeat.repeat15;

public class TestEnumDemo {
    public static void main(String[] args) {
        System.out.println("Start");
        try {
            Class.forName("repeat.repeat15.TestEnum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }
}
