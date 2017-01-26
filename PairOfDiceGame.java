/*
 * Adhithya Kondalsamy 
 * Michael Lum
 * 11/21/16
 * Period: 6
 * Amberg
 * Code for a game in which a user battles against the computer.  The player
 * and computer roll a pair of dice until one of them reaches 100 points total.
 * However, if they roll a single 1 or double 1's, their score resets accordingly.
 */
import java.util.Scanner;

public class PairOfDiceGame {

	public static void main(String[] args) {
		// variables
		int playerTotal = 0, compTotal = 0, pointsEarned = 0;
		boolean playAgain = true;
		String replay;
		final int WIN_SCORE = 100;
		PairOfDice p1 = new PairOfDice();
		Scanner keyboard = new Scanner(System.in);
		// while loop that loops until either player or computer win.
		while (playerTotal < WIN_SCORE && compTotal < WIN_SCORE && playAgain) {
			// checks if computer total is not 100 before going into the
			// player's turn.
			if (compTotal < WIN_SCORE)
				System.out
						.println("Beginning Player turn. Current player total: "
								+ playerTotal);
			// while loop for player
			while (playerTotal < WIN_SCORE && compTotal < WIN_SCORE
					&& playAgain) {

				p1.roll();
				// prints what the player rolls.
				System.out.println("Player roll: " + p1.toString());
				// resets player total and points earned to 0 if player rolls a
				// single 1 or two 1's.
				if (p1.getFaceValue1() == 1 || p1.getFaceValue2() == 1) {
					if (p1.getFaceValue1() == 1 && p1.getFaceValue2() == 1) {
						playerTotal = 0;
						pointsEarned = 0;
						playAgain = false;
						System.out
								.println("You rolled two 1's.\nPlayer's total is now 0.");
						System.out.println("Press Enter to continue.");
						keyboard.nextLine();
					} else {
						pointsEarned = 0;
						playAgain = false;
						System.out
								.println("You rolled a single 1.\nPlayer's points earned this round is now 0.");
						System.out.println("Press Enter to continue.");
						keyboard.nextLine();
					}
				} else {
					// adds points earned to the player total and prints points
					// earned.
					pointsEarned += p1.getTotalValue();
					System.out.println("Current player points this round: "
							+ pointsEarned);
					// checks if the player has 100 after points earned are
					// added.
					if (playerTotal + pointsEarned >= 100) {
						System.out.println();
						playAgain = false;
					} else {
						// asks if the player wants to roll again
						System.out
								.println("Do you want to roll again?(yes or no):");
						replay = keyboard.nextLine();
						if (replay.equals("yes")) {
							playAgain = true;
							System.out.println("Rolling again.");
						} else
							playAgain = false;
					}
				}
			}// end player while loop
				// resets points earned and adds points earned into player total
			if (compTotal < WIN_SCORE) {
				playerTotal += pointsEarned;
				System.out.println("Player round ended.\nPlayer total points: "
						+ playerTotal);
				pointsEarned = 0;
				playAgain = true;
				System.out.println("Press Enter to continue.");
				keyboard.nextLine();
			}
			// checks if player has already won before proceeding into the
			// computer's while loop.
			if (playerTotal < WIN_SCORE)
				System.out
						.println("Begin Computer turn. Current computer total: "
								+ compTotal);
			// while loop for computer that has points earned bounded at 20
			while (playerTotal < WIN_SCORE && compTotal < WIN_SCORE
					&& pointsEarned < 20 && playAgain) {
				p1.roll();
				System.out.println(p1.toString());
				// checks if the computer rolled a single 1 or two 1's and
				// adjusts variables as necessary.
				if (p1.getFaceValue1() == 1 || p1.getFaceValue2() == 1) {
					if (p1.getFaceValue1() == 1 && p1.getFaceValue2() == 1) {
						compTotal = 0;
						pointsEarned = 0;
						playAgain = false;
						System.out
								.println("Computer rolled two 1's.\nComputer's total is now 0.");
						System.out.println("Press Enter to continue.");
						keyboard.nextLine();
					} else {
						pointsEarned = 0;
						playAgain = false;
						System.out
								.println("Computer rolled a single 1.\nComputer's points earned this round is now 0.");
						System.out.println("Press Enter to continue.");
						keyboard.nextLine();
					}
				} else {
					// adds points earned in current round to the computer total
					pointsEarned += p1.getTotalValue();
					System.out.println("Current Computer points this round: "
							+ pointsEarned);
					System.out.println("Press Enter to continue.");
					keyboard.nextLine();
					// checks if the computer as won and, if so, sets playAgain
					// to false.
					if (compTotal + pointsEarned >= 100) {
						System.out.println();
						playAgain = false;
					}
				}

			}// end computer while loop
				// adds points earned to computer total and checks if the player
				// has already won before running through the loop again.
			compTotal += pointsEarned;
			if (playerTotal < WIN_SCORE) {
				System.out
						.println("Computer round ended.\nComputer total points: "
								+ compTotal);
				pointsEarned = 0;
				playAgain = true;
				System.out.println("Press Enter to continue.");
				keyboard.nextLine();
			}
		}// end overall while loop(including both player and computer loops).
			// outputs winner
		if (playerTotal >= WIN_SCORE)
			System.out.println("Player wins!");
		else
			System.out.println("Computer wins!");

	}// end main
}// end Pig
