package shri;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private boolean isAvailable;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void checkout() {
		isAvailable = false;
	}

	public void checkin() {
		isAvailable = true;
	}
}

public class LibraryManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<Book> library = new ArrayList<>();

		// Adding books to the library
		library.add(new Book("Why Hitler was right?", "Shriyog More"));
		library.add(new Book("Health & Fitness", "Aryan Pawar"));
		library.add(new Book("Business Strategies 101", "Naresh Suthar"));

		while (true) {
			System.out.println("\nMENU:");
			System.out.println("1. Display Books");
			System.out.println("2. Checkout Book");
			System.out.println("3. Checkin Book");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				displayBooks(library);
				break;
			case 2:
				checkoutBook(scanner, library);
				break;
			case 3:
				checkinBook(scanner, library);
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

	private static void displayBooks(ArrayList<Book> library) {
		System.out.println("\nLibrary Catalog:");
		for (Book book : library) {
			System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Status: "
					+ (book.isAvailable() ? "Available" : "Checked out"));
		}
	}

	private static void checkoutBook(Scanner scanner, ArrayList<Book> library) {
		scanner.nextLine(); // Consume newline
		System.out.print("Enter title of the book to checkout: ");
		String title = scanner.nextLine();

		for (Book book : library) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				if (book.isAvailable()) {
					book.checkout();
					System.out.println("Book '" + title + "' checked out successfully.");
					return;
				} else {
					System.out.println("Book '" + title + "' is already checked out.");
					return;
				}
			}
		}
		System.out.println("Book '" + title + "' not found in the library.");
	}

	private static void checkinBook(Scanner scanner, ArrayList<Book> library) {
		scanner.nextLine(); // Consume newline
		System.out.print("Enter title of the book to checkin: ");
		String title = scanner.nextLine();

		for (Book book : library) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				if (!book.isAvailable()) {
					book.checkin();
					System.out.println("Book '" + title + "' checked in successfully.");
					return;
				} else {
					System.out.println("Book '" + title + "' is already available in the library.");
					return;
				}
			}
		}
		System.out.println("Book '" + title + "' not found in the library.");
	}
}
