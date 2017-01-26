/*
 * Adhithya Kondalsamy
 * Period: 3
 * Mrs. Amberg
 * Code that prompts user for number of eggs purchased and calculates bill.
 */

import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
		//variables
		double number, bill1, bill2, bill3, bill4;
		Scanner input = new Scanner(System.in);
		//input
		System.out.println("Enter the number of eggs purchased: ");
		number = input.nextInt();
		//processing
		bill1 = (number % 12) * (0.5 * (1 / 12)) + ((int) (number / 12)) * 0.5;

		bill2 = (number % 12) * (0.45 * (1 / 12)) + ((int) (number / 12))
				* 0.45;

		bill3 = (number % 12) * (0.4 * (1 / 12)) + ((int) (number / 12)) * 0.4;

		bill4 = (number % 12) * (0.35 * (1 / 12)) + ((int) (number / 12))
				* 0.35;
		//output
		if (number < 48){
			System.out.print("The bill is equal to:$" + bill1);
		}
		if (number >= 48 && number < 72){
			System.out.print("The bill is equal to:$" + bill2);
		}
		if (number >= 72 && number < 132){ 
			System.out.print("The bill is equal to:$" + bill3);
		}
		if (number >= 132){ 
			System.out.print("The bill is equal to:$" + bill4);
		}

	}
}
