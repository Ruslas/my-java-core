package univercity.STAD.lab1;

public abstract class Operations {
    private int integer;
    private double floatPoint;

    public Operations(int integer) {
        this.integer = integer;
    }

    public Operations(double floatPoint) {
        this.floatPoint = floatPoint;
    }

    public Operations() {
    }

    public abstract long opLoopInt(WatchTime timer);
    public abstract long opLoopFloat(WatchTime timer);
}
