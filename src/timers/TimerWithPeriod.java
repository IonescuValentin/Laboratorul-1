package timers;

import java.util.Timer;
import java.util.TimerTask;

public class TimerWithPeriod {
    private Timer timer;

    public void start(long delay, long period) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int counter = 0;

            @Override
            public void run() {
                counter++;
                System.out.println("Punctul 3: Executare repetata #" + counter + " (period = " + period + " ms)");
                if (counter >= 5) {
                    timer.cancel();
                    System.out.println("TimerWithPeriod: stopped after 5 runs.");
                }
            }
        }, delay, period);
    }

    public void start() {
        start(1000, 3000);
    }
}
