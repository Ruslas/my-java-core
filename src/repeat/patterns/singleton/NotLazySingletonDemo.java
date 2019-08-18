package repeat.patterns.singleton;

public class NotLazySingletonDemo {
    public static void main(String[] args) {
        try {
            Class.forName("repeat.patterns.singleton.NotLazySingleton");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
