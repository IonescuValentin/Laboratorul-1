package timers;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;

public class TimerInterval {
    public void start() {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task interval → " + new Date());
            }
        };

        timer.scheduleAtFixedRate(task, 0, 2000);

        System.out.println("TimerInterval pornit...");
    }
}