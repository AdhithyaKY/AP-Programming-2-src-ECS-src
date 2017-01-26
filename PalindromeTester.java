/*
 * Adhithya Kondalsamy
 * Period: 6
 * 10/26/16
 * This code takes in a string input and outputs whether that input 
 * is a palindrome or not.
 */
import java.util.Scanner;

public class PalindromeTester {

	public static void main(String[] args) {
		// variables
		boolean repeat = true;
		String playAgain;
		String possiblePalindrome;
		String editedWord = "";
		String palindrome = "";
		Scanner keyboard = new Scanner(System.in);
		// input and processing
		while (repeat == true) {
			System.out.println("Enter a possible Palindrome:");
			possiblePalindrome = keyboard.nextLine();

			for (int x = 0; x < possiblePalindrome.length(); x++) {
				char letter = possiblePalindrome.charAt(x);
				if (letter >= 'A' && letter <= 'Z' || letter >= 'a'
						&& letter <= 'z')
					editedWord += letter;
			}
			for (int x = editedWord.length() - 1; x >= 0; x--) {
				palindrome += editedWord.charAt(x);

			}
			// output
			if (palindrome.equalsIgnoreCase(editedWord))
				System.out.println("This is a palindrome.");
			else
				System.out.println("This is not a palindrome.");
			System.out
					.println("Your original input was: " + possiblePalindrome);
			repeat = false;
			System.out.println("Do you want to test another word?(y/n)");
			// repeat prompting
			playAgain = keyboard.next();
			keyboard.nextLine();
			if (playAgain.equals("y")) {
				repeat = true;
				editedWord = "";
				palindrome = "";
			} else
				System.out.println("End");
		}// end while loop
	}// end main
}// end PalindromeTester