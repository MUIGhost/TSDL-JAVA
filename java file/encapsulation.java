package shri;

public class encapsulation {
	// Private variables
	private String name;
	private int age;

	// Getter methods
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// Setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;
		} else {
			System.out.println("Age cannot be negative.");
		}
	}

	public static void main(String[] args) {
		encapsulation obj = new encapsulation();

		// Setting values using setter methods
		obj.setName("John");
		obj.setAge(30);

		// Getting values using getter methods
		System.out.println("Name: " + obj.getName());
		System.out.println("Age: " + obj.getAge());

		// Attempting to set age to a negative value
		obj.setAge(-5); // This will print "Age cannot be negative."
	}
}
