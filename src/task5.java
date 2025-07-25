class Vehicle {
 String brand;
 int speed;
 void showDetails() {
 System.out.println("Brand: " + brand + ", Speed: " + speed + "km/h");
 }
}
class Car extends Vehicle {
 int wheels = 4;
}
class Bike extends Vehicle {
 int wheels = 2;
}
public class task5 {
 public static void main(String[] args) {
 Car car = new Car();
 car.brand = "Suzuki";
 car.speed = 1860;
 car.showDetails();
 Bike bike = new Bike();
 bike.brand = "Hero";
 bike.speed = 100;
 bike.showDetails();
 }
}