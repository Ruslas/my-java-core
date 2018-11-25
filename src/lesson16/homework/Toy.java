package lesson16.homework;

/**
 * Created by student on 25.11.2018.
 */
public class Toy {
    private String name;
    private int cost;

    public Toy(String name, int cost) {
        this(name);
        this.cost = cost;
    }

    public Toy(String name) {
        this();
        this.name = name;
    }

    public Toy() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Toy toy = (Toy) o;

        if (cost != toy.cost) return false;
        return name != null ? name.equals(toy.name) : toy.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}