package timers;

public class TimerManager {
    private TimerInterval t1 = new TimerInterval();
    private TimerAtTime t2 = new TimerAtTime();
    private TimerWithPeriod t3 = new TimerWithPeriod();

    public void startAll() {
        System.out.println("Starting all timers...");
        t1.start();  // Punctul 1
        t2.start();  // Punctul 2
        t3.start();  // Punctul 3
    }
}
