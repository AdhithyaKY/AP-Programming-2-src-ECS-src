/*
 * Adhithya Kondalsamy
 * Period: 3
 * Amberg
 * 5/6/16
 * Code that prompts the user for a username and password until an eight character password is entered
 * is entered and it displays an output message with their username and password.
 */
import java.util.Scanner;
public class AccountSetup {
	public static void main(String[] args) {
		//variables
		Scanner keyboard = new Scanner(System.in);
		String username, password = null;
		//input and processing
		System.out.print("Enter a user name that is at least 8 characters: ");
		username = keyboard.nextLine();
		do{
			System.out.print("Enter a password that is at least 8 characters: ");
			password = keyboard.nextLine();
		}while(password.length()<8);
		//output
		System.out.print("Your user name is " + username.toLowerCase() + "and your password is " + password.toLowerCase());
			
		}//end main
	
	}//end AccountSetup

