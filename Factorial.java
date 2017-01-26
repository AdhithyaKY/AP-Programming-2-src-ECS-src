/*Adhithya Kondalsamy
 * 5/4/16
 * Period: 3
 * Amberg
 * Prompts user for a number and outputs its factorial.  
 */
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//variables
		int number, factorial, startnum;
		Scanner kb = new Scanner(System.in);
		//input & processing
		System.out.println("Enter a Number: ");
		number = kb.nextInt();
		startnum = number;
		factorial = number;
		number -= 1;
		for (; number >= 1; number--) {
			factorial *= number;
		}
		//output
		System.out.println("The factorial of " + startnum + " is: " + factorial);
	}// end main

}// end Factorial