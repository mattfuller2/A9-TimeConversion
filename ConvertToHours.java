import java.util.Scanner;

/**
 * This will print the total number of seconds the user inputs and the
 * equivalent amount of time as a combination of hours, minutes, and seconds.
 *
 * @author  Matt Fuller
 * 
 * @version CS 121L Section-4 Spring 2017
 */
public class ConvertToHours {
	/**
	 * Calculates the equivalent amount of time as a fractional number of hours
	 * based on the value the User inputs.
	 * 
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int hours;
		int minutes;
		int seconds;
		int totalseconds;
		double fHours;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of seconds: ");
		totalseconds = scan.nextInt();

		System.out.println("Total seconds: " + totalseconds);

		fHours = ((double) totalseconds) / 3600;

		hours = totalseconds / 3600;

		totalseconds = totalseconds % 3600;

		minutes = totalseconds / 60;

		seconds = totalseconds % 60;

		// Prints the results.
		System.out.println("Hours: " + hours);

		System.out.println("Minutes: " + minutes);

		System.out.println("Seconds: " + seconds + "\n");

		System.out.println("Fractional hours: " + fHours);
	}
}
