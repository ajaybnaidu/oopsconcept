package File1;

import java.util.Scanner;

public class task10 {
	public static void main(String[] args) {
		 int[] arr = new int[10];
		 Scanner sc = new Scanner(System.in);
		 int sum = 0, min = -199, max = 9999;
		 for (int i = 0; i < arr.length; i++) {
		 arr[i] = sc.nextInt();
		 sum += arr[i];
		 if (arr[i] < min) 
			 min = arr[i];
		 if (arr[i] > max) 
			 max = arr[i];
		 }
		 System.out.println("Average: " + (sum/10.0));
		 System.out.println("Min: " + min + ", Max: " + max);
		 }

}
