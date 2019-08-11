package repeat.patterns.singleton;

public interface Planet {
    int populationDensity();
    int square();
    default void printInfo(){
        System.out.println("Мы на неизвестной планете");
    }
}
