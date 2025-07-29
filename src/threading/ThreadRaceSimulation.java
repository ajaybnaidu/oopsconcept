package threading;
import java.util.Random;
class Racer extends Thread {
    public Racer(String name) {
        super(name); 
    }

    public void run() {
        Random rand = new Random();

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " running... " + i);
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " finished the race!");
    }
}
public class ThreadRaceSimulation {
    public static void main(String[] args) {
        Racer tortoise = new Racer("Tortoise");
        Racer rabbit = new Racer("Rabbit");
        Racer dog = new Racer("Dog");
        tortoise.start();
        rabbit.start();
        dog.start();
    }
}

