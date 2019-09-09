package repeat.repeat19;

public class NewRunnableDem {
    public static void main(String[] args) {
        NewRunnable newRunnable = new NewRunnable();

        Thread thread1 = new Thread(newRunnable);
        Thread thread2 = new Thread(newRunnable);
        Thread thread3 = new Thread(newRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
