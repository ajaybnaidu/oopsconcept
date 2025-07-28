package threading;

class Buffer {
    private int item;
    private boolean hasItem = false;
    public synchronized void produce(int value) {
        while (hasItem) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        item = value;
        System.out.println("Produced: " + item);
        hasItem = true;
        notify(); 
    }
    public synchronized void consume() {
        while (!hasItem) {
            try {
                wait(); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + item);
        hasItem = false;
        notify(); 
    }
}
class Producer implements Runnable {
    Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
        new Thread(this, "Producer").start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer implements Runnable {
    Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ProducerConsumerExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Producer(buffer);
        new Consumer(buffer);
    }
}
