package timers;

import javax.swing.*;
import java.awt.*;

public class TimerUI extends JFrame {
    private TimerManager manager;

    public TimerUI() {
        super("Manager Timere");
        manager = new TimerManager();

        // Setări fereastră
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        // Butoane
        JButton btnStartAll = new JButton("Start Toate Timerele");
        JButton btnTimer1 = new JButton("Start Timer Interval");
        JButton btnTimer2 = new JButton("Start Timer la Timp Fix");
        JButton btnTimer3 = new JButton("Start Timer cu Perioadă");

        // Acțiuni
        btnStartAll.addActionListener(e -> manager.startAll());
        btnTimer1.addActionListener(e -> new TimerInterval().start());
        btnTimer2.addActionListener(e -> new TimerAtTime().start());
        btnTimer3.addActionListener(e -> new TimerWithPeriod().start());

        // Adăugare butoane în UI
        add(btnStartAll);
        add(btnTimer1);
        add(btnTimer2);
        add(btnTimer3);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TimerUI::new);
    }
}
