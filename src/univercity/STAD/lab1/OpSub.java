package univercity.STAD.lab1;

public class OpSub extends Operations{
    private static final double FLAT = 2/3;
    private int integer;
    private double floatPoint;

    public OpSub(int integer) {
        super(integer);
    }

    public OpSub(double floatPoint) {
        super(floatPoint);
    }

    public OpSub() {
    }

    public  long opLoopInt(WatchTime timer){
        long time = 0;
        for (int i = 0; i<20; i++) {
            timer.start();
            for (int j = 0; j < 10000; j++) {
                integer = integer - j;
            }
            time += timer.getElapsedTime();
        }
        return time/20;
    }

    public  long opLoopFloat(WatchTime timer){
        long time = 0;
        for (int i = 0; i<20; i++) {
            timer.start();
            for (int j = 0; j < 10000; j++) {
                floatPoint = floatPoint - FLAT;
            }
            time += timer.getElapsedTime();
        }
        return time/20;
    }
}
