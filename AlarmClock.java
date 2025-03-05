import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class AlarmClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        System.out.print("Enter alarm time in seconds: ");
        int seconds = scanner.nextInt();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Alarm: Time's up!");
            }
        }, seconds * 1000); // Convert seconds to milliseconds

        System.out.println("Alarm is set for " + seconds + " seconds.");
        scanner.close();
    }
}