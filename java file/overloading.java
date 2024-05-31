package shri;

public class overloading {
	public void area() {
		System.out.println("Find Area of:");
	}

	public void area(double r) {
		System.out.println("Circle:" + 3.14 * r * r);
	}

	public void area(double b, double h) {
		System.out.println("Triangle:" + 0.5 * b * h);
	}

	public static void main(String[] args) {
		overloading sh = new overloading();
		sh.area();
		sh.area(6);
		sh.area(6, 7);
	}
}