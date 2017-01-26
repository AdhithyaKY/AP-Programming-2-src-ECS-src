import java.util.Scanner;


public class SecretNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables
		final int SECRET_NUMBER = 13;
		int guess;
		Scanner input = new Scanner (System.in);
		//input
		System.out.println("Enter your guess: ");
		guess = input.nextInt();
		//processing and output
		if (guess == SECRET_NUMBER)
			System.out.println("You guessed it!");
		else {
			if (guess < SECRET_NUMBER)
				System.out.println("TOO LOW");
			else 
				System.out.println("TOO HIGH");
		}
		
	}// end main

}//end SecretNumber
