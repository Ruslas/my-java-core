package lesson9;

public class Circle extends Shape {
    private int radius;
    private Point center;

    public Circle(String color, int radius, Point center) {
        super(color);
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.print("Drawing " + getColor() + " circle with radius = " + radius + " and center in ");
        getCenter().printPoint();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle circle = (Circle) o;

        if (radius != circle.radius) return false;
        return center.equals(circle.center);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + radius;
        result = 31 * result + center.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                "} " + super.toString();
    }
}
