//package shri;
//
//class ThreadAttendance extends Thread {
//	 private String className;
//
//	 public ThreadAttendance(String className) {
//	     this.className = className;
//	 }
//
//	 @Override
//	 public void run() {
//	     for (int day = 1; day <= 5; day++) {
//	         System.out.println("Class: " + className + ", Day: " + day);
//	         // Simulate attendance marking by printing names of students present
//	         System.out.println("   Shriyog: Present");
//	         System.out.println("   Naresh: Present");
//	         System.out.println("   Aryan: Present");
//
//	         try {
//	             Thread.sleep(1000); // Simulating a day's duration
//	         } catch (InterruptedException e) {
//	             e.printStackTrace();
//	         }
//	     }
//	 }
//	}
//
//	class RunnableAttendance implements Runnable {
//	 private String studentName;
//
//	 public RunnableAttendance(String studentName) {
//	     this.studentName = studentName;
//	 }
//
//	 @Override
//	 public void run() {
//	     for (int day = 1; day <= 5; day++) {
//	         // Simulate a student arriving late
//	         System.out.println("Day " + day + ": " + studentName + " is late!");
//
//	         try {
//	             Thread.sleep(500); // Simulating a day's duration
//	         } catch (InterruptedException e) {
//	             e.printStackTrace();
//	         }
//	     }
//	 }
//	}
//
//	public class Attendance {
//	 public static void main(String[] args) {
//	     // Create instances of ThreadAttendance for different classes and start them
//	     ThreadAttendance class1 = new ThreadAttendance("Class 1");
//	     ThreadAttendance class2 = new ThreadAttendance("Class 2");
//
//	     class1.start();
//	     class2.start();
//
//	     // Create instances of RunnableAttendance for different students and execute them using a single thread
//	     RunnableAttendance student1 = new RunnableAttendance("Shriyog");
//	     RunnableAttendance student2 = new RunnableAttendance("Naresh");
//	     RunnableAttendance student3 = new RunnableAttendance("Aryan");
//
//	     // Execute RunnableAttendance instances using a single thread
//	     Thread studentThread = new Thread(student1);
//	     studentThread.start();
//
//	     // Wait for studentThread to finish before starting the next student
//	     try {
//	         studentThread.join();
//	     } catch (InterruptedException e) {
//	         e.printStackTrace();
//	     }
//
//	     new Thread(student2).start();
//	     new Thread(student3).start();
//	 }
//	}
//
