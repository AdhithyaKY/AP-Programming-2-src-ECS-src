/*Adhithya Kondalsamy
 * 5/4/16
 * Period 3
 * Amberg
 * User inputs a value and the program sums up all of the odd numbers up to the value
 * entered by the user 
 */
import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// variables
		Scanner kb = new Scanner(System.in);
		int num, sum = 0, count;
		// input & processing
		System.out.println("Enter a positive number: ");
		num = kb.nextInt();
		for (count = 1; count <= num; count += 2) {
			sum += count;
		}
		System.out.println("The Sum of all odd numbers to the number entered is: " + sum);
	}// end main
}// end odd sum