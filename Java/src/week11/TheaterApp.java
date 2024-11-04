
package week11;

public class TheaterApp extends Thread {
    int seat;
    static TicketBooking tb;

    public void run() {
	tb.booking(seat);
    }

    public static void main(String[] args) throws InterruptedException {
	tb = new TicketBooking();
	TheaterApp arman = new TheaterApp();
	arman.seat = 40;
	arman.start();
	TheaterApp shreyas = new TheaterApp();
	shreyas.seat = 7;
	shreyas.start();
    }
}
