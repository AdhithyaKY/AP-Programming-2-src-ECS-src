/*
 * Adhithya Kondalsamy
 * Period: 6
 * 12/8/16
 * Amberg
 * Represents the players in the Nim game, accounting for the expert and 
 * beginner mode for the computer player.  
 */
import java.util.Scanner;

public class NimPlayer {
	// instance variables
	private int playerType;
	private String playerName;
	// constants
	private final int BEGINNER = 0;
	private final int EXPERT = 1;
	private final int HUMAN = 2;

	// constructors- constructs a player with a type and a name.
	public NimPlayer(int playerType, String playerName) {
		this.playerType = playerType;
		this.playerName = playerName;

	}

	/*
	 * Precondition: a player object. Postcondition: returns the string
	 * representation of the player name and the player type.
	 */
	public String toString() {
		return playerName + " " + playerType;
	}

	/*
	 * Precondition: a pile of marbles. Postcondition: directs pile to helper
	 * methods based on player type.
	 */
	public void removeMarbles(Pile p1) {
		if (playerType == BEGINNER) {
			beginnerRemoveMarbles(p1);

		} else if (playerType == EXPERT) {
			expertRemoveMarbles(p1);

		} else if (playerType == HUMAN) {
			humanRemoveMarbles(p1);

		}

	}
	
	//private helper methods
	
	/*
	 * Precondition: a player object that is of player type human or 2 
	 * and a valid pile object.
	 * postcondition: removes the number of marbles the human player enters to
	 * remove from the pile of marbles.
	 */
	private void humanRemoveMarbles(Pile p1) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number of marbles to remove: ");
		int numberRemove = keyboard.nextInt();
		while (numberRemove >= 1 && numberRemove > (p1.getMarbles() / 2)) {
			System.out.println("You entered an invalid number.");
			System.out.println("Enter a number of marbles to remove: ");
			numberRemove = keyboard.nextInt();
		}
		System.out.println("You removed " + numberRemove
				+ " marble(s) from the pile.");
		int numberLeft = p1.getMarbles() - numberRemove;
		p1.removeMarbles(numberRemove);
		System.out.println("This is a valid move and the pile has "
				+ p1.getMarbles() + " marbles left.");

	}

	/*
	 * Precondition: a player object that is of player type 0 and
	 * a valid pile object. Postcondition: removes the number of marbles that 
	 * the beginner level computer player
	 * removes from the pile of marbles.
	 */
	private void beginnerRemoveMarbles(Pile p1) {
		int numberRemove = (int) (Math.random() * (p1.getMarbles() / 2) + 1);
		System.out.println("The computer removed " + numberRemove
				+ " marbles from the pile.");
		p1.removeMarbles(numberRemove);
		System.out.println("There are " + p1.getMarbles()
				+ " marbles left in the pile.");

	}

	/*
	 * Precondition: a player object that is of player type 1 and a valid
	 * pile object. Postcondition:
	 * removes the number of marbles that the expert level computer player
	 * removes from the pile of marbles.
	 */
	private void expertRemoveMarbles(Pile p1) {
		int removeMarbles;
		int marblesRemaining = p1.getMarbles() + 1;
		int marblesPower = 2;
		while (marblesRemaining > 1 && marblesRemaining % 2 == 0) {
			marblesRemaining /= 2;
		}
		if (marblesRemaining == 0)
			removeMarbles = (int) (Math.random() * (p1.getMarbles() / 2) + 1);
		else {
			while (marblesPower <= (double) p1.getMarbles() / 2) {
				marblesPower *= 2;
			}

			marblesPower -=1;
			removeMarbles = p1.getMarbles() - marblesPower;
			if (removeMarbles > p1.getMarbles() / 2)
				removeMarbles = (int) (Math.random() * (p1.getMarbles() / 2) + 1);
			
			p1.removeMarbles(removeMarbles);
			System.out.println(removeMarbles
					+ " marbles were removed from the pile by Expert Computer.");
		}
	}
}// end NimPlayer