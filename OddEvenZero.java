/*
 * Adhithya Kondalsamy
 * Period: 6 
 * Amberg
 * 10/18/16
 * code that inputs a number from the user and outputs the number of zeroes, 
 * odd integers, and even integers in that number.  
 */
import java.util.Scanner;

public class OddEvenZero {
	public static void main(String[] args) {
		// variables
		Scanner keyboard = new Scanner(System.in);
		int even = 0, odd = 0, zero = 0;
		// input
		System.out.println("Enter a integer: ");
		int number = keyboard.nextInt();
		// processing
		for (int x = number; x > 0; x = x / 10) {
			if (x % 10 == 0)
				zero++;
			else {
				if ((x % 10) % 2 == 0)
					even++;
				else
					odd++;
			}
		}
		// output
		System.out.println("Zero: " + zero);
		System.out.println("Odd: " + odd);
		System.out.println("Even: " + even);
	}// end main
}// end OddEvenZero