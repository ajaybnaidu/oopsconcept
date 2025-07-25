package Exceptionhndling;

interface RemoteControl1 {
 void turnOn();
 default void batteryStatus() {
     System.out.println("Battery is at 80%.");
 }
 static void info() {
     System.out.println("RemoteControl Interface: Controls electronic devices.");
 }
}
class TV1 implements RemoteControl1 {
 public void turnOn() {
     System.out.println("TV is now ON.");
 }

public class task4 {
 public static void main(String[] args) {
     TV1 myTV = new TV1();
     myTV.turnOn();

     myTV.batteryStatus();

     RemoteControl1.info();
 }
}
}
