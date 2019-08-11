package repeat.patterns.singleton;

public class Moon implements Planet{
    private final int RADIUS = 1737;
    private long population = 54000L;
    private static Moon instance;


    private Moon() {
    }

    public static Moon getInstance(){
        if (instance == null)
            instance = new Moon();
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
        System.out.println("Мы на Луне");
    }
}
