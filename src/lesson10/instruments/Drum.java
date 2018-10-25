package lesson10.instruments;

public class Drum implements Instrument {
    private float diameter, depth;

    public Drum(float diameter, float depth) {
        this.diameter = diameter;
        this.depth = depth;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан " + getDiameter() + "\"x" + getDepth() + "\"");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        if (Float.compare(drum.diameter, diameter) != 0) return false;
        return Float.compare(drum.depth, depth) == 0;
    }

    @Override
    public int hashCode() {
        int result = (diameter != +0.0f ? Float.floatToIntBits(diameter) : 0);
        result = 31 * result + (depth != +0.0f ? Float.floatToIntBits(depth) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "diameter=" + diameter +
                ", depth=" + depth +
                '}';
    }
}
