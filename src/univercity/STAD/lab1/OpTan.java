package univercity.STAD.lab1;

public class OpTan extends Operations{
    private double floatPoint;

    public OpTan(double floatPoint) {
        super(floatPoint);
    }

    public OpTan() {
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
                s = Math.tan(floatPoint);
            }
            time += timer.getElapsedTime();
        }
        return time/20;
    }
}
