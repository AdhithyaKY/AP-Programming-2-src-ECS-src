/*
 * Adhithya Kondalsamy
 * Period: 3
 * Amberg
 * 6/3/16
 * Code that prompts user to type in the preset password and displays whether the user is correct or incorrect.
 */
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		// variables
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		String password = "wade";
		String guess;
		boolean passwordTrue = false;
		// input & processing & output
		for (int x = 1; x <= 3; x++) {
			System.out.println("Enter the password: ");
			guess = keyboard.next();
			if (guess.compareToIgnoreCase(password) == 0) {
				System.out.println("Welcome");
				passwordTrue = true;
				x = 4;
			}
			if (passwordTrue == false) {
				System.out.println("The password you typed is incorrect.");
			}
		}//end for loop

		if (passwordTrue == false) {
			System.out.println("Access denied.");
		}
		
	}//end main
	
}//end Password
