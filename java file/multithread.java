package shri;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread: " + Thread.currentThread().getId() + " - Count: " + i);
			try {
				Thread.sleep(1000); // Sleep for 1 second
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class multithread {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();

		thread1.start(); // Start the first thread
		thread2.start(); // Start the second thread
	}
}
