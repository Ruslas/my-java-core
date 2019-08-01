package repeat.repeat11;

public class Turtle {
    public int size;

    public Turtle(int s) {
        size = s;
    }

    public boolean equals(Object o) {
        return (this.size == ((Turtle) o).size);
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "size=" + size +
                '}';
    }
}
