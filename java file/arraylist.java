package shri;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
		// Creating an ArrayList of strings
		ArrayList<String> fruits = new ArrayList<>();

		// Adding elements to the ArrayList
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");

		// Displaying the elements of the ArrayList
		System.out.println("Fruits in the list:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Getting the size of the ArrayList
		int size = fruits.size();
		System.out.println("Size of the list: " + size);

		// Checking if the ArrayList is empty
		boolean isEmpty = fruits.isEmpty();
		System.out.println("Is the list empty? " + isEmpty);

		// Removing an element from the ArrayList
		fruits.remove("Banana");

		// Displaying the updated list
		System.out.println("Fruits after removing Banana:");
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
