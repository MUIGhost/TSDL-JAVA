package shri;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	private String name;
	private int id;
	private String department;

	public Student(String name, int id, String department) {
		this.name = name;
		this.id = id;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getDepartment() {
		return department;
	}
}

public class StudentManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Student> students = new ArrayList<>();

		while (true) {
			System.out.println("\nMENU:");
			System.out.println("1. Add Student");
			System.out.println("2. Display Students");
			System.out.println("3. Remove Student");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addStudent(scanner, students);
				break;
			case 2:
				displayStudents(students);
				break;
			case 3:
				removeStudent(scanner, students);
				break;
			case 4:
				System.out.println("Exiting program...");
				scanner.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private static void addStudent(Scanner scanner, ArrayList<Student> students) {
		scanner.nextLine(); // Consume newline
		System.out.print("Enter student name: ");
		String name = scanner.nextLine();
		System.out.print("Enter student ID: ");
		int id = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		System.out.print("Enter student department: ");
		String department = scanner.nextLine();

		Student student = new Student(name, id, department);
		students.add(student);
		System.out.println("Student added successfully.");
	}

	private static void displayStudents(ArrayList<Student> students) {
		System.out.println("\nStudent List:");
		if (students.isEmpty()) {
			System.out.println("No students added yet.");
		} else {
			for (Student student : students) {
				System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Department: "
						+ student.getDepartment());
			}
		}
	}

	private static void removeStudent(Scanner scanner, ArrayList<Student> students) {
		System.out.print("Enter student ID to remove: ");
		int idToRemove = scanner.nextInt();

		boolean removed = false;
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getId() == idToRemove) {
				students.remove(i);
				removed = true;
				System.out.println("Student with ID " + idToRemove + " removed successfully.");
				break;
			}
		}
		if (!removed) {
			System.out.println("Student with ID " + idToRemove + " not found.");
		}
	}
}
