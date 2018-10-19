package lesson9;

public class Rectangle extends Shape {
    private Point a, b, c, d;

    public Rectangle(String color, Point a, Point b, Point c, Point d) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    public void draw() {
        System.out.print("Drawing " + getColor() + " rectangle " + Point.distances(a, b) + "x" + Point.distances(b, c));
    }
}
