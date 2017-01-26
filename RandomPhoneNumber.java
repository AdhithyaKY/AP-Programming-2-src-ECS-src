/*
 * Adhithya Kondalsamy
 * Period: 6
 * Amberg
 * Code that generates a random phone number based on a set of restrictions.
 */
import java.text.DecimalFormat;

public class RandomPhoneNumber {

	public static void main(String[] args) {
		// variables
		int num1, num2, num3, mid3, last4;
		// processing and formatting
		DecimalFormat threePlaces = new DecimalFormat("000");
		DecimalFormat fourPlaces = new DecimalFormat("0000");
		num1 = (int) (Math.random() * (8)) + 0;
		num2 = (int) (Math.random() * (8)) + 0;
		num3 = (int) (Math.random() * (8)) + 0;
		mid3 = (int) (Math.random() * (743)) + 0;
		last4 = (int) (Math.random() * (1000)) + 0;
		// output
		System.out.println("" + num1 + num2 + num3 + "-"
				+ threePlaces.format(mid3) + "-" + fourPlaces.format(last4));

	}// end main

}// end RandomPhoneNumber
