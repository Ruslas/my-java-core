package univercity.STAD.lab1;

public class WatchTime {
    private long startTime = 0, stopTime  = 0;
    private boolean running = false;

    public void start (){
        this.startTime = System.nanoTime();
        this.running = true;
    }

    public void stop (){
        this.stopTime = System.nanoTime();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
}
