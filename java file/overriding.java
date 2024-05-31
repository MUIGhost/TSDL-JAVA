package shri;

class vehicle {
	void bike() {
		System.out.println("Hunk Starts");
	}
}

public class overriding extends vehicle {
	void bike() {
		System.out.println("It goes WROOM WROOMM WROOMMM!!");
		System.out.println("RATATATAAAAAAAAAAAAAA!!!!!!");
	}

	public static void main(String[] args) {
		overriding abc = new overriding();
		vehicle pqr = new vehicle();
		pqr.bike();
		abc.bike();
	}
}
