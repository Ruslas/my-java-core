package repeat.repeat10.zoo;

public class Cat extends Pet {
    private String color;

    public Cat() {
    }

    public Cat(String petName, int wight, String color) {
        super(petName, wight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return color != null ? color.equals(cat.color) : cat.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
