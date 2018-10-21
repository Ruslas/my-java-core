package lesson9;

public class ShapeDemo {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 5);
        Point p3 = new Point(3, 5);
        Point p4 = new Point(0, 5);
        Shape circle1 = new Circle("grey", 3, p1);
        Shape rectangle1 = new Rectangle("red", p1, p2, p3, p4);
        Shape circle2 = new Circle("grey", 3, p1);

        Shape[] shapes = {circle1, circle2, rectangle1};
        for (Shape shape: shapes){
            shape.draw();
        }
    }

}