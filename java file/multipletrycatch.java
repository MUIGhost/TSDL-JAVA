package shri;

public class multipletrycatch {
	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[4]); // Accessing an element out of bounds
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds exception: " + e.getMessage());
		}

		try {
			String str = null;
			System.out.println(str.length()); // Attempting to invoke a method on null reference
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception: " + e.getMessage());
		}

		try {
			int result = 10 / 0; // Attempting to divide by zero
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception: " + e.getMessage());
		}

		System.out.println("End of program");
	}
}
