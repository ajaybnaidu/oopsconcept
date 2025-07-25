package Exceptionhndling;


abstract class Shape1 {
 
 abstract double area();

 
 void displayShapeType() {
     System.out.println("This is a generic shape.");
 }
}


class Circle5 extends Shape1 {
 double radius;

 Circle5(double radius) {
     this.radius = radius;
 }

 @Override
 double area() {
     return Math.PI * radius * radius;
 }

 @Override
 void displayShapeType() {
     System.out.println("This is a Circle.");
 }
}

public class task2 {
 public static void main(String[] args) {
     Shape1 circle = new Circle5(5);

     circle.displayShapeType();               
     System.out.println("Area: " + circle.area());  

 }
}
