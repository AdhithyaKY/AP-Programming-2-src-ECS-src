/*Adhithya Kondalsamy
 * Period: 6
 * 10/14/16
 * Code that generates a random integer and asks the user to enter
 * guesses until the user guesses the random integer correctly.  
 */
import java.util.Scanner;

public class HilLoGame {

	public static void main(String[] args) {
		// variables
		Scanner keyboard = new Scanner(System.in);
		int guess = -3;
		int count = 0;
		final int SENTINAL = -1;
		boolean playAgain = true;
		// input, processing, and output
		while (playAgain == true) {
			int number = (int) (Math.random() * (99)) + 1;
			while (guess != number && guess != -1) {
				System.out.println("Enter a guess: ");
				guess = keyboard.nextInt();
				keyboard.nextLine();
				count++;
				if (guess == -1) {
					System.out.println("Game Stopped.");
				} else if (guess < number) {
					System.out.println("Your guess is low");
				} else if (guess > number) {
					System.out.println("You guess is high");
				} else if (guess == number) {
					System.out
							.println("Your guess of " + guess + " is correct");
					System.out.println("You attempted " + count + " times");
				}
				

			}// end while loop
			if(guess == -1){
				System.out.println("game over");
			}
			System.out.println("Do you want to play again? yes or no : ");
			String replay = keyboard.nextLine();
			if (replay.equals("yes")){
				count = 0;
			}else
				playAgain = false;
				System.out.println("Game over.");
		}//end while loop
	}// end main

}// end HiLoGame
