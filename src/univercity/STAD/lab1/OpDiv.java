package univercity.STAD.lab1;

public class OpDiv extends Operations {
    private static final double FLAT = 2 / 3;
    private int integer;
    private double floatPoint;

    public OpDiv(int integer) {
        super(integer);
    }

    public OpDiv(double floatPoint) {
        super(floatPoint);
    }

    public OpDiv() {
    }

    public long opLoopInt(WatchTime timer) {
        long time = 0;
        int a = 0;
        for (int i = 0; i < 20; i++) {
            timer.start();
            for (int j = 0; j < 10000; j++) {
                a = integer / 3;
            }
            time += timer.getElapsedTime();
        }
        return time / 20;
    }

    public long opLoopFloat(WatchTime timer) {
        long time = 0;
        for (int i = 0; i < 20; i++) {
            timer.start();
            for (int j = 0; j < 10000; j++) {
                floatPoint = floatPoint / FLAT;
            }
            time += timer.getElapsedTime();
        }
        return time / 20;
    }
}
