
/*Adhithya Kondalsamy
 * 5/17/16
 * Period: 3 Amberg
 * Determines whether a number entered by the user is prime or not.
 */
import java.util.Scanner;

public class PrimeNumberA {

	public static void main(String[] args) {
		// variables
		Scanner keyboard = new Scanner(System.in);
		int number, x = 2;
		boolean isPrime = true;
		// input and processing
		System.out.println("Input a number: ");
		number = keyboard.nextInt();
		while (x < number && isPrime == true) {
			if (number % x == 0) {
				isPrime = false;

			}//end if statement
			x += 1;
		}//end while loop
		
		//output
		if (isPrime == false)
			System.out.println("Number is not Prime");
		else {
			System.out.println("Number is Prime");
		}//end else statement

	}// end main

}// end PrimeNumberA