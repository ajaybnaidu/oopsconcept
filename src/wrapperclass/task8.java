package wrapperclass;

public class task8 {
    private String accountNumber;
    private Double balance; 
    public task8(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        if (balance == null) {
            this.balance = 0.0;
        } else {
            this.balance = balance;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid or insufficient funds.");
        }
    }
    public void showBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
    public static void main(String[] args) {
        task8 acc = new task8("SB1001", null);

        acc.showBalance();
        acc.deposit(1000.0);
        acc.withdraw(300.0);
        acc.showBalance();
        acc.withdraw(800.0); 
        acc.showBalance();
    }
}
