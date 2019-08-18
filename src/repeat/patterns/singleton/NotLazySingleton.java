package repeat.patterns.singleton;

public class NotLazySingleton {
    private static NotLazySingleton instance = new NotLazySingleton();

    private NotLazySingleton() {
        System.out.println("NotLazy");
    }

    public static NotLazySingleton getInstance() {
        return instance;
    }
}
