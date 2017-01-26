/*
 * Adhithya Kondalsamy
 * Period: 3
 * Amberg
 * 6/2/16
 * Code that prompts the user for their full name and then displays their monogram.
 */
import java.util.Scanner;
public class Monogram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		Scanner keyboard = new Scanner(System.in);
		String firstName, middleName, lastName, first, middle, last;
		//input
		System.out.println("Enter your first name: ");
		firstName = keyboard.next();
		System.out.println("Enter your middle initial: ");
		middleName = keyboard.next();
		System.out.println("Enter your last name: ");
		lastName = keyboard.next();
		//processing
		last = lastName.substring(0, 1).toUpperCase();
		middle = middleName.substring(0, 1).toLowerCase();
		first = firstName.substring(0, 1).toLowerCase();
		//output
		System.out.print("Your monogram is " + first + last + middle);
		
		

	}//end main

}//end Monogram
