/*
 * Adhithya Kondalsamy
 * Period: 3
 * 5/24/16
 * Amberg
 * Code that prompts user for two numbers and then displays the prime numbers between the two inputted numbers.
 */
import java.util.Scanner;

public class PrimeNumberB {
	public static void main(String args[]) {
		//variables
		Scanner keyboard = new Scanner(System.in);
		int number1, number2;
		//input
		System.out.println("Enter the first(smaller) number:");
		number1 = keyboard.nextInt();
		System.out.println("Enter the second(larger) number:");
		number2 = keyboard.nextInt();
		System.out.println("Prime numbers: ");
		//processing
		for (int i = number1; i <= number2; i++) {
			int k;
			for (k = 2; k < i; k++) {
				int number = i % k;
				if (number == 0) {
					break;
				}//end if statement
				
			}//end nested for loop
			
		//output
			if (i == k) {
				System.out.print(" " + i);
				
			}//end if statement
			
		}//end for loop
		
	}//end main
	
}//end PrimeNumberB
