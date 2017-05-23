/*
 * Adhithya Kondalsamy
 * Period: 6
 * 1/26/17
 * Amberg
 * Code that reads in an unlimited number of integers and prints out the
 * number of times each integer was entered. 
 */
import java.util.Scanner;

public class InRange {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int[] numbers = new int[51];
		int x = 0;
		while (x != 100) {
			System.out.print("Enter a number between -25 and 25(100 to quit): ");
			x = keyboard.nextInt();
			if (x >= -25 && x <= 25)
				numbers[x+25]++;
		}
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				int index = i-25;
				System.out.print(index + ": ");
				System.out.println(numbers[i]);
			}

		}

	}// end main
}// end InRange