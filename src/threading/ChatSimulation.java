package threading;



class Chat {
    boolean flag = false;

    public synchronized void question(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Sender: " + msg);
        flag = true;
        notify();
    }

    public synchronized void answer(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Reciever: " + msg);
        flag = false;
        notify();
    }
}

class Task3 implements Runnable {
    Chat m;
    String[] s1 = {"Hi!", "How are you?"};

    public Task3(Chat m) {
        this.m = m;
        new Thread(this, "Question").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.question(s1[i]);
        }
    }
}

class Task4 implements Runnable {
    Chat m;
    String[] s2 = {"Hello", "I'm fine"};

    public Task4(Chat m) {
        this.m = m;
        new Thread(this, "Answer").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.answer(s2[i]);
        }
    }
}

public class ChatSimulation {
    public static void main(String[] args) {
        Chat obj = new Chat();
        new Task3(obj);
        new Task4(obj);
    }
}

