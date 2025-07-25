package File1;


public class task4 {

 
 public static void main(String[] args) {

     
     final int x = 10;

     
     if (x > 5) {
         System.out.println("x is large");
     } else {
         System.out.println("x is small");
     }

     
     for (int i = 0; i < 5; i++) {
         if (i == 2) {
             continue; 
         }
         if (i == 4) {
             break; 
         }
         System.out.println("i = " + i);
     }

   
     boolean isActive = true;
     if (isActive) {
         System.out.println("The program is active.");
     }

     return;
 }
}
