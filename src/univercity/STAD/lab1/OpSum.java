package univercity.STAD.lab1;

public class OpSum extends Operations {
    private int integer;
    private double floatPoint;

    public OpSum(int integer) {
        super(integer);
    }

    public OpSum(double floatPoint) {
        super(floatPoint);
    }

    public OpSum() {
    }

    public  long opLoopInt(WatchTime timer){
        long time = 0;
        for (int i = 0; i<20; i++) {
            timer.start();
            for (int j = 0; j < 10000; j++) {
                integer = integer + j;
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
                floatPoint = floatPoint + floatPoint;
            }
            time += timer.getElapsedTime();
        }
        return time/20;
    }
}
