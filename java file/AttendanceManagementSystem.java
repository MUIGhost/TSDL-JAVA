package shri;

//Class to represent student attendance for a specific class
class ThreadAttendance extends Thread {
	private String className;
	private String[] studentsPresent;

	public ThreadAttendance(String className, String[] studentsPresent) {
		this.className = className;
		this.studentsPresent = studentsPresent;
	}

	@Override
	public void run() {
		System.out.println("Class: " + className);
		for (String student : studentsPresent) {
			System.out.println("\t- " + student);
		}
	}
}

//Class representing a student arriving late
class RunnableAttendance implements Runnable {
	private String studentName;
	private int minutesLate;

	public RunnableAttendance(String studentName, int minutesLate) {
		this.studentName = studentName;
		this.minutesLate = minutesLate;
	}

	@Override
	public void run() {
		System.out.println(studentName + " arrived " + minutesLate + " minutes late.");
	}
}

public class AttendanceManagementSystem {
	public static void main(String[] args) {
//Create threads for attending classes
		ThreadAttendance mathAttendance = new ThreadAttendance("Mathematics",
				new String[] { "Shriyog", "Aryan", "Naresh" });
		ThreadAttendance englishAttendance = new ThreadAttendance("English",
				new String[] { "Soham", "Sumit", "Varun" });
//Start attendance threads for different classes
		mathAttendance.start();
		englishAttendance.start();
//Simulate students arriving late (using a single thread)
		new Thread(new RunnableAttendance("Shriyog", 5)).start();
		new Thread(new RunnableAttendance("Sumit", 10)).start();
	}
}