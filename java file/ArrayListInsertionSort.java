package shri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListInsertionSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Enter the number of elements: ");
		int n = scanner.nextInt();

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			numbers.add(num);
		}

		// Sort the elements
		Collections.sort(numbers);

		System.out.println("Elements inserted into the ArrayList (sorted):");
		for (int num : numbers) {
			System.out.print(num + " ");
		}

		scanner.close();
	}
}
