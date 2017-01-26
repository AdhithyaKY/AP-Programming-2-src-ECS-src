/*
 * Adhithya Kondalsamy
 * Period: 6
 * 10/14/16
 * LeapYear
 * Code that inputs a year greater than 1582 and outputs whether the year 
 * inputted is a leap year or not.
 */
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// variables
		Scanner keyboard = new Scanner(System.in);
		int year = 0;
		final int SENTINEL = -1;
		// processing and output
		while (year != -1) {
			System.out.println("Enter a year after 1582: ");
			year = keyboard.nextInt();

			if (year == SENTINEL)
				System.out.println("Program stopped");
			else if (year >= 1582) {
				if (year % 4 == 0) {
					if (year % 100 == 0 && year % 400 != 0) {
						System.out.println(year + " is not a leap year");
					} else
						System.out.println(year + " is a leap year");
				} else
					System.out.println(year + " is not a leap year");
			}//end else if statement
		}//end while loop
	}// end main
}// end LeapYear