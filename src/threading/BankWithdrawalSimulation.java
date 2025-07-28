package threading;

class BankAccount {
    private int balance = 1000; 
    public synchronized void withdraw(int amount, String threadName) {
        if (balance >= amount) {
            System.out.println(threadName + " is going to withdraw: " + amount);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(threadName + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(threadName + " tried to withdraw " + amount + " but insufficient balance!");
        }
    }
}

class User extends Thread {
    private BankAccount account;
    private int amount;
    public User(BankAccount account, int amount, String name) {
        super(name);
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount, Thread.currentThread().getName());
    }
}

public class BankWithdrawalSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        User user1 = new User(account, 700, "User-1");
        User user2 = new User(account, 200, "User-2");
        user1.start();
        user2.start();
    }
}

