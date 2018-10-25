package lesson10.instruments;

public class Guitar implements Instrument {
    private int numberOfChord;

    public Guitar(int numberOfChord) {
        this.numberOfChord = numberOfChord;
    }

    public int getNumberOfChord() {
        return numberOfChord;
    }

    public void setNumberOfChord(int numberOfChord) {
        this.numberOfChord = numberOfChord;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара c " + getNumberOfChord() + " струнами");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return numberOfChord == guitar.numberOfChord;
    }

    @Override
    public int hashCode() {
        return numberOfChord;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfChord=" + numberOfChord +
                '}';
    }
}
