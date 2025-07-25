package Exceptionhndling;


interface RemoteControl {
 
 void turnOn();
 default void batteryStatus() {
     System.out.println("Battery is at 80%.");
 }
}
class TV implements RemoteControl {
 public void turnOn() {
     System.out.println("TV is now ON.");
 }
}
public class task3 {
 public static void main(String[] args) {
     TV myTV = new TV();   
     myTV.turnOn();
     myTV.batteryStatus();
 }
}

