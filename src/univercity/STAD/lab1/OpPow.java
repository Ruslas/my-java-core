package univercity.STAD.lab1;

public class OpPow extends Operations {
    private double floatPoint;

    public OpPow(double floatPoint) {
        super(floatPoint);
    }

    public OpPow() {
    }

    public  long opLoopInt(WatchTime timer){
        return 0;
    }

    public  long opLoopFloat(WatchTime timer){
        long time = 0;
        double s = 0;
        for (int i = 0; i<20; i++) {
            timer.start();
            for (int j = 0; j < 10000; j++) {
                s = Math.pow(floatPoint, 2.1);
            }
            time += timer.getElapsedTime();
        }
        return time/20;
    }
}
