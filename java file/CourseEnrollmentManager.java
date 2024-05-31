package shri;

import java.util.ArrayList;
import java.util.Scanner;

class Course {
	private String courseId;
	private String courseName;
	private ArrayList<String> studentNames;
	private ArrayList<String> studentIds;

	public Course(String courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.studentNames = new ArrayList<>();
		this.studentIds = new ArrayList<>();
	}

	public String getCourseId() {
		return courseId;
	}

	public void addStudent(String studentId, String studentName) {
		studentIds.add(studentId);
		studentNames.add(studentName);
	}

	public boolean removeStudent(String studentId) {
		int index = studentIds.indexOf(studentId);
		if (index != -1) {
			studentIds.remove(index);
			studentNames.remove(index);
			return true;
		}
		return false;
	}

	public void displayDetails() {
		System.out.println("Course ID: " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Students Enrolled:");
		for (int i = 0; i < studentIds.size(); i++) {
			System.out.println("Student ID: " + studentIds.get(i) + ", Student Name: " + studentNames.get(i));
		}
	}
}

public class CourseEnrollmentManager {
	public static void main(String[] args) {
		ArrayList<Course> courses = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMENU:");
			System.out.println("1. Add Course");
			System.out.println("2. Enroll Student");
			System.out.println("3. Remove Student");
			System.out.println("4. Display Course Details");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1:
				addCourse(scanner, courses);
				break;
			case 2:
				enrollStudent(scanner, courses);
				break;
			case 3:
				removeStudent(scanner, courses);
				break;
			case 4:
				displayCourseDetails(scanner, courses);
				break;
			case 5:
				System.out.println("Exiting program...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void addCourse(Scanner scanner, ArrayList<Course> courses) {
		System.out.print("Enter Course ID: ");
		String courseId = scanner.nextLine();
		System.out.print("Enter Course Name: ");
		String courseName = scanner.nextLine();
		courses.add(new Course(courseId, courseName));
		System.out.println("Course added successfully.");
	}

	private static void enrollStudent(Scanner scanner, ArrayList<Course> courses) {
		System.out.print("Enter Course ID: ");
		String courseId = scanner.nextLine();
		Course course = findCourse(courses, courseId);
		if (course != null) {
			System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			System.out.print("Enter Student Name: ");
			String studentName = scanner.nextLine();
			course.addStudent(studentId, studentName);
			System.out.println("Student enrolled successfully.");
		} else {
			System.out.println("Course not found.");
		}
	}

	private static void removeStudent(Scanner scanner, ArrayList<Course> courses) {
		System.out.print("Enter Course ID: ");
		String courseId = scanner.nextLine();
		Course course = findCourse(courses, courseId);
		if (course != null) {
			System.out.print("Enter Student ID: ");
			String studentId = scanner.nextLine();
			if (course.removeStudent(studentId)) {
				System.out.println("Student removed successfully.");
			} else {
				System.out.println("Student not found in the course.");
			}
		} else {
			System.out.println("Course not found.");
		}
	}

	private static void displayCourseDetails(Scanner scanner, ArrayList<Course> courses) {
		System.out.print("Enter Course ID: ");
		String courseId = scanner.nextLine();
		Course course = findCourse(courses, courseId);
		if (course != null) {
			course.displayDetails();
		} else {
			System.out.println("Course not found.");
		}
	}

	private static Course findCourse(ArrayList<Course> courses, String courseId) {
		for (Course course : courses) {
			if (course.getCourseId().equals(courseId)) {
				return course;
			}
		}
		return null;
	}
}
