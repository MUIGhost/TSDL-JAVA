package shri;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Input array elements
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Calculate sum of array elements
		int sum = calculateSum(array);

		// Display the sum
		System.out.println("Sum of the array elements: " + sum);

	}

	// Method to calculate the sum of array elements
	public static int calculateSum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return sum;
	}
}
