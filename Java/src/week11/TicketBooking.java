package week11;

public class TicketBooking {
    int totalSeats = 40;

    void booking(int seats) {
	if (totalSeats >= seats) {
	    System.out.println("Booking Success");
	    totalSeats -= seats;
	} else {
	    System.out.println("Booking failed only " + totalSeats + " are available");
	}
    }
}
