package shri;

public class finallyblock {
	public static void main(String[] args) {
		try {
			int result = divide(10, 0); // Attempting to divide by zero
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception: " + e.getMessage());
		} finally {
			System.out.println("Finally block executed");
		}
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
