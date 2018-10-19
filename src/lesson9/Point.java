package lesson9;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static double distances(Point a, Point b) {
        return Math.sqrt((Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2)));
    }

    public void printPoint() {
        System.out.println("(" + getX() + "; " + getY() + ")");
    }
}
