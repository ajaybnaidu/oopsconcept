package threading;
public class RunnableCounter implements Runnable {
 @Override
 public void run() {
     for (int i = 1; i <= 10; i++) {
         System.out.println("Number: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 }
 public static void main(String[] args) {
     RunnableCounter counter = new RunnableCounter();    
     Thread thread = new Thread(counter);                 
     thread.start();                                     
 }
}

