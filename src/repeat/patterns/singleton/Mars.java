package repeat.patterns.singleton;

public class Mars implements Planet {
    private final int RADIUS = 3488;
    private long population = 358000L;
    private static Mars instance;


    private Mars() {
        System.out.println("Create Mars");
    }

    public static Mars getInstance(){
        if (instance == null)
            instance = new Mars();
        return instance;
    }

    public int getRADIUS() {
        return RADIUS;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public int populationDensity() {
        return (int) (square() / population);
    }

    @Override
    public int square() {
        return (int) (4 * Math.PI * RADIUS * RADIUS);
    }

    @Override
    public void printInfo() {
        System.out.println("Мы на планете Марс");
    }
}
