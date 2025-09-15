import timers.TimerManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Application started.");

        TimerManager manager = new TimerManager();
        manager.startAll();

        try {
            Thread.sleep(20000); // 20 secunde pentru ca timerele să ruleze
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Application finished.");
    }
}
