package week4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class date_time {
    public static void main(String[] args) {
	LocalDate date = LocalDate.now();
	System.out.println("Current Date is " + date);

	LocalTime time = LocalTime.now();
	System.out.println("\nCurrent Time is " + time);

	LocalDateTime dateTime = LocalDateTime.now();
	System.out.println("\nCurrent Date and time is " + dateTime);

	LocalDateTime DateTime = LocalDateTime.now();
	System.out.println("\nBefore formatting : " + DateTime);

	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
	String formatDate = DateTime.format(format);
	System.out.println("\nAfter formatting : " + formatDate + "\n");

	// various formats

	DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd-MM-yy\n");
	String formatDate2 = DateTime.format(format2);
	System.out.println(formatDate2);

	DateTimeFormatter format3 = DateTimeFormatter.ofPattern("dd-MMM-yyyy\n");
	String formatDate3 = DateTime.format(format3);
	System.out.println(formatDate3);

	DateTimeFormatter format4 = DateTimeFormatter.ofPattern("E, dd'th' MMM yyyy\n");
	String formatDate4 = DateTime.format(format4);
	System.out.println(formatDate4);
    }
}
