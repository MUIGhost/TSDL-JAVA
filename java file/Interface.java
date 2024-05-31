package shri;

//Interface definition
interface Animal {
	void sound(); // Abstract method
}

//Class implementing the interface
class Dog implements Animal {
	@Override
	public void sound() {
		System.out.println("Dog barks");
	}
}

//Main class
public class Interface {
	public static void main(String[] args) {
		// Create an object of Dog class
		Dog dog = new Dog();

		// Call the method defined in the interface
		dog.sound(); // Output: Dog barks
	}
}
