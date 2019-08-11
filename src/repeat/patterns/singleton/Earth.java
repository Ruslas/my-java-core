package repeat.patterns.singleton;

public class Earth implements Planet{
    private final int RADIUS = 6378;
    private long population = 7530000000L;
    private static Earth instance;


    private Earth() {
    }

    public static Earth getInstance(){
        if (instance == null)
            instance = new Earth();
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
        System.out.println("Мы на планете Земля");
    }
}
