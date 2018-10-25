package lesson10.instruments;

public class Trumpet implements Instrument {
    private float diameter;

    public Trumpet(float diameter) {
        this.diameter = diameter;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба " + getDiameter() + "\"");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return Float.compare(trumpet.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        return (diameter != +0.0f ? Float.floatToIntBits(diameter) : 0);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "diameter=" + diameter +
                '}';
    }
}
