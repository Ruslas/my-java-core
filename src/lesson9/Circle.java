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
}
