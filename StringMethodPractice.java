/*
 * Adhithya Kondalsamy 
 * Amberg
 * 9/29/16
 * AP Programming
 * code that inputs a string meeting specified requirements and outputs parts
 * of that string in a specified order or determines whether the string contains
 * certain letters.  
 */
import java.util.Scanner;

public class StringMethodPractice {

	public static void main(String[] args) {
		// variables
		Scanner keyboard = new Scanner(System.in);
		// input
		System.out.println("Enter a string of even length: ");
		// processing
		String even = keyboard.nextLine();
		int length = even.length();
		int halfLength = (even.length() / 2);
		// output
		System.out.println(even.substring(0, halfLength));
		System.out.println(even.substring(halfLength));
		// input
		System.out
				.println("Enter a string that is 2 or more characters long: ");
		// processing
		String two = keyboard.nextLine();
		String firstTwo = two.substring(0, 2);
		String remaining = two.substring(2);
		String rotateLeft = remaining + firstTwo;
		// output
		System.out.println(rotateLeft);
		// input
		System.out.println("Enter a string of any length: ");
		// processing
		String anyLength = keyboard.nextLine();
		int result = (anyLength.indexOf("go"));
		// output
		if (result == -1) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

	}// end main

}// end StringMethodPractice
