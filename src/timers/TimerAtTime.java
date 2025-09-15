import java.util.Timer;
import java.util.TimerTask;
import java.util.Date;
import java.util.Calendar;

public class TimerAtTime {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task la timp fix → " + new Date());
                timer.cancel();
            }
        };

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND, 10);
        Date specificTime = calendar.getTime();

        timer.schedule(task, specificTime);

        System.out.println("TimerAtTime programat la " + specificTime);
    }
}
