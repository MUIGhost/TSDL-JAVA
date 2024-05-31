package shri;

import java.util.Scanner;

class Ticket {
	private String passengerName;
	private boolean isBooked;

	public Ticket() {
		this.passengerName = null;
		this.isBooked = false;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void bookTicket(String passengerName) {
		this.passengerName = passengerName;
		isBooked = true;
	}

	public void cancelTicket() {
		this.passengerName = null;
		isBooked = false;
	}
}

public class TicketManagementSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Initialize tickets
		Ticket[] tickets = new Ticket[10];
		for (int i = 0; i < tickets.length; i++) {
			tickets[i] = new Ticket();
		}

		while (true) {
			System.out.println("\nMENU:");
			System.out.println("1. Book Ticket");
			System.out.println("2. Cancel Ticket");
			System.out.println("3. Display Seats");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				bookTicket(scanner, tickets);
				break;
			case 2:
				cancelTicket(scanner, tickets);
				break;
			case 3:
				displaySeats(tickets);
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

	private static void bookTicket(Scanner scanner, Ticket[] tickets) {
		System.out.print("Enter seat number to book (1-10): ");
		int seatNumber = scanner.nextInt();

		if (seatNumber < 1 || seatNumber > tickets.length) {
			System.out.println("Invalid seat number. Please enter a valid seat number.");
			return;
		}

		Ticket ticket = tickets[seatNumber - 1];
		if (ticket.isBooked()) {
			System.out.println("Seat " + seatNumber + " is already booked.");
		} else {
			scanner.nextLine(); // Consume newline
			System.out.print("Enter passenger name: ");
			String passengerName = scanner.nextLine();
			ticket.bookTicket(passengerName);
			System.out.println("Ticket booked successfully for seat " + seatNumber + ".");
		}
	}

	private static void cancelTicket(Scanner scanner, Ticket[] tickets) {
		System.out.print("Enter seat number to cancel (1-10): ");
		int seatNumber = scanner.nextInt();

		if (seatNumber < 1 || seatNumber > tickets.length) {
			System.out.println("Invalid seat number. Please enter a valid seat number.");
			return;
		}

		Ticket ticket = tickets[seatNumber - 1];
		if (ticket.isBooked()) {
			ticket.cancelTicket();
			System.out.println("Ticket canceled successfully for seat " + seatNumber + ".");
		} else {
			System.out.println("No booking found for seat " + seatNumber + ".");
		}
	}

	private static void displaySeats(Ticket[] tickets) {
		System.out.println("Seat Availability:");
		for (int i = 0; i < tickets.length; i++) {
			if (tickets[i].isBooked()) {
				System.out.println("Seat " + (i + 1) + ": Booked by " + tickets[i].getPassengerName());
			} else {
				System.out.println("Seat " + (i + 1) + ": Available");
			}
		}
	}
}
