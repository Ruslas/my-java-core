package univercity.STAD.lab1;

public class OpOr extends Operations{
    private int integer;

    public OpOr(int integer) {
        super(integer);
    }

    public OpOr() {
    }

    public  long opLoopInt(WatchTime timer){
        long time = 0;
        int a=0;
        for (int i = 0; i<20; i++) {
            timer.start();
            for (int j = 0; j < 10000; j++) {
                a = integer | j;
            }
            time += timer.getElapsedTime();
        }
        return time/20;
    }

    public  long opLoopFloat(WatchTime timer) {
        return 0;
    }
}
