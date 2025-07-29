package file1;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int result = num1; 

        
        switch (operator) {
            case '+':
                result += num2; 
                break;
            case '-':
                result -= num2; 
                break;
            case '*':
                result *= num2; 
                break;
            case '/':
                if (num2 != 0) {
                    result /= num2; 
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            case '%':
                result %= num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }

        
        System.out.println("Result: " + result);
    }
}
