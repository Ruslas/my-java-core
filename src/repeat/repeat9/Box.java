package repeat.repeat9;

public class Box implements Comparable<Box> {
    private int high, wight, deeps;
    private int weight;

    public Box() {
    }

    public Box(int high, int wight, int deeps, int weight) {
        this.high = high;
        this.wight = wight;
        this.deeps = deeps;
        this.weight = weight;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getDeeps() {
        return deeps;
    }

    public void setDeeps(int deeps) {
        this.deeps = deeps;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;

        if (high != box.high) return false;
        if (wight != box.wight) return false;
        if (deeps != box.deeps) return false;
        return Double.compare(box.weight, weight) == 0;
    }

    @Override
    public int compareTo(Box box) {
        return this.wight - box.wight;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = high;
        result = 31 * result + wight;
        result = 31 * result + deeps;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Box{" +
                "high=" + high +
                ", wight=" + wight +
                ", deeps=" + deeps +
                ", weight=" + weight +
                '}';
    }
}
