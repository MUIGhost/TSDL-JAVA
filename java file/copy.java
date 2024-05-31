package shri;

public class copy {
	private String name;
	private int age;

	// Copy constructor
	public copy(copy original) {
		this.name = original.name;
		this.age = original.age;
	}

	// Constructor
	public copy(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// Creating an object using constructor
		copy person1 = new copy("John", 30);

		// Creating a copy of the object using the copy constructor
		copy person2 = new copy(person1);

		// Displaying the details of both objects
		System.out.println("Details of person1:");
		System.out.println("Name: " + person1.getName());
		System.out.println("Age: " + person1.getAge());

		System.out.println("\nDetails of person2 (copy of person1):");
		System.out.println("Name: " + person2.getName());
		System.out.println("Age: " + person2.getAge());
	}
}
