package threading;
class CountdownTimer extends Thread {
    public void run() {
        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                Thread.sleep(1000); // Pause for 1 second
            }
            System.out.println("Time’s up!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted!");
        }
    }
}
public class CountDownMain {
    public static void main(String[] args) {
        CountdownTimer timer = new CountdownTimer();
        timer.start();
    }
}
