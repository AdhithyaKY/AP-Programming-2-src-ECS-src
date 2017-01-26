/*
 * Adhithya Kondalsamy
 * Period: 6
 * 12/8/16
 * Amberg
 * Represents a pile of marbles that has the number of marbles in the pile.
 */
public class Pile {
	// instance variables
	private int marbles;

	// constructor - constructs a pile of marbles.
	public Pile(int marbles) {
		this.marbles = marbles;
	}

	// accessor method
	/*
	 * preconditions: a pile of marbles 
	 * postconditions: returns the number of marbles in the pile.
	 */
	public int getMarbles() {
		return marbles;
	}
	/*
	 * Preconditions: the number of marbles to remove.
	 * Postconditions: removes the number of marbles the user or computer
	 * wants to remove from the pile.
	 */
	public boolean removeMarbles(int numberRemove) {
		if (numberRemove < marbles) {
			marbles -= numberRemove;
			return true;
		} else {
			System.out.println();
			return false;
		}
	}
	/*
	 * Precondition: a pile of marbles.
	 * Postcondition: returns the string representation of the pile of marbles
	 * ,including the number of marbles in the pile.
	 */
	public String toString() {
		return "Pile has " + marbles + " marbles";
	}
}//end Pile
