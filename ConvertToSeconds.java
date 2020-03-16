
import java.util.Scanner; // Declares Scanner class from java.util

/**
 * This will print the total number of seconds after converting hours, minutes,
 * and seconds into total amount of seconds.
 *
 * @author Matt Fuller
 * @version CS 121L Section-4 Spring 2017
 */
public class ConvertToSeconds {
	/**
	 * Calculates the total number of seconds in a combination of hours, minutes,
	 * and seconds based on the value inputted by the User.
	 * 
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;
		int totalseconds;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of hours: ");
		hours = scan.nextInt();

		System.out.print("Enter the number of minutes: ");
		minutes = scan.nextInt();

		System.out.print("Enter the number of seconds: ");
		seconds = scan.nextInt();

		totalseconds = (3600 * hours) + (60 * minutes) + seconds;

		System.out.println("Total number of seconds: " + totalseconds);
	}
}
