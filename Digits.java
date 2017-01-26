import java.util.Scanner;
/* Adhithya Kondalsamy
 * 1/8/16
 * Outputs the ones-place and tens-place value in a two digit number that is inputted.
 */

public class Digits {
	public static void main(String[] args) {
		int Number, ten, one;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a Two-Digit Number: ");
		Number = keyboard.nextInt();
		ten = Number/10;
		one = Number%10;
		
		System.out.println("Tens place is "+ ten);
	    System.out.println("Ones place is "+ one);
		
		
		
	}//end main

}//end class
