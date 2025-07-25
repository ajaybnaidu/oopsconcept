package File1;

import java.util.Scanner;

public class task99 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = 10, b = 5;
		 System.out.println("1. Add\n2. Sub\n3. Mul\n4. Div");
		 System.out.println("Enter the choice: ");
		 int choice = sc.nextInt();
		 switch (choice) {
		 case 1: System.out.println(a + b); 
		 break;
		 case 2: System.out.println(a - b); 
		 break;
		 case 3: System.out.println(a * b); 
		 break;
		 case 4: System.out.println(a / b); 
		 break;
		 default: System.out.println("Invalid");
		 }
		 }
}
