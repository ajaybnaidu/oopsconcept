package exceptionhndling;

import java.util.Scanner;
public class task6 {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int num;
 System.out.print("Enter a number: ");
 num = sc.nextInt();
 try {
 int result = 100 / num;
 System.out.println("Result: " + result);
 } catch (ArithmeticException e) {
 System.out.println("Cannot divide by zero");
 }
 }
}