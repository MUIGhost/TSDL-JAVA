package shri;

public class constructors {
	private int value;

	// Default constructor
	public constructors() {
		System.out.println("Default constructor called.");
		this.value = 0;
	}

	// Parameterized constructor
	public constructors(int value) {
		System.out.println("Parameterized constructor called with value: " + value);
		this.value = value;
	}

	// Copy constructor
	public constructors(constructors original) {
		System.out.println("Copy constructor called.");
		this.value = original.value;
	}

	// Getter method
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		// Creating objects using different constructors
		constructors obj1 = new constructors(); // Default constructor
		constructors obj2 = new constructors(10); // Parameterized constructor
		constructors obj3 = new constructors(obj2); // Copy constructor

		// Displaying values of objects
		System.out.println("\nValues of objects:");
		System.out.println("obj1 value: " + obj1.getValue());
		System.out.println("obj2 value: " + obj2.getValue());
		System.out.println("obj3 value: " + obj3.getValue());
	}
}
