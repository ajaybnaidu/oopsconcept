package threading;



public class ThreadJoinExample extends Thread {
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread1 - Number: " + i);
         try {
             Thread.sleep(1000); 
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 }
 public static void main(String[] args) {
     ThreadJoinExample thread1 = new ThreadJoinExample(); 
     thread1.start();                                     

     try {
         thread1.join(); 
     } catch (InterruptedException e) {
         System.out.println("Main thread interrupted: " + e.getMessage());
     }
     System.out.println("Main thread done.");
 }
}

