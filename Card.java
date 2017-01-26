/*
 * Adhithya Kondalsamy
 * Period: 6
 * 11/28/16
 * Amberg
 * Represents a card that has a face value and a suit name.  
 */
public class Card {
	// constants for face cards and ace
	public final static int ACE = 1;
	public final static int TWO = 2;
	public final static int THREE = 3;
	public final static int FOUR = 4;
	public final static int FIVE = 5;
	public final static int SIX = 6;
	public final static int SEVEN = 7;
	public final static int EIGHT = 8;
	public final static int NINE = 9;
	public final static int TEN = 10;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	// constants for suits
	public final static int CLUBS = 1;
	public final static int DIAMONDS = 2;
	public final static int HEARTS = 3;
	public final static int SPADES = 4;
	// instance variables
	private int faceValue;
	private int suitValue;
	private String suitName;
	private String faceName;

	// constructor - constructs a random card.
	public Card() {
		faceValue = (int) ((Math.random() * 13) + 1);
		suitValue = (int) ((Math.random() * 4) + 1);
		setFaceName();
		setSuitName();

	}

	/*
	 * precondition: assumes faceValue and suitValue are valid values
	 * postcondition: constructs a card of the specified suit and face value.
	 */
	public Card(int faceValue, int suitValue) {
		this.faceValue = faceValue;
		this.suitValue = suitValue;
		setFaceName();
		setSuitName();
	}

	// sets string representation of the face using its stored numeric value.
	private void setFaceName() {
		if (faceValue == ACE) {
			faceName = "ACE";
		} else if (faceValue == TWO) {
			faceName = "TWO";
		} else if (faceValue == THREE) {
			faceName = "THREE";
		} else if (faceValue == FOUR) {
			faceName = "FOUR";
		} else if (faceValue == FIVE) {
			faceName = "FIVE";
		} else if (faceValue == SIX) {
			faceName = "SIX";
		} else if (faceValue == SEVEN) {
			faceName = "SEVEN";
		} else if (faceValue == EIGHT) {
			faceName = "EIGHT";
		} else if (faceValue == NINE) {
			faceName = "NINE";
		} else if (faceValue == TEN) {
			faceName = "TEN";
		} else if (faceValue == JACK) {
			faceName = "JACK";
		} else if (faceValue == QUEEN) {
			faceName = "QUEEN";
		} else if (faceValue == KING) {
			faceName = "KING";
		}
	}

	// sets the string representation of the suit using its stored numeric
	// value.
	public void setSuitName() {
		if (suitValue == CLUBS) {
			suitName = "CLUBS";
		} else if (suitValue == DIAMONDS) {
			suitName = "DIAMONDS";
		} else if (suitValue == HEARTS) {
			suitName = "HEARTS";
		} else if (suitValue == SPADES) {
			suitName = "SPADES";
		}
	}

	/*
	 * Precondition: none Postcondition: returns the string representation of
	 * this card, including both face and suit.
	 */
	public String toString() {
		return faceName + " of " + suitName;
	}

	// accessors
	/*
	 * preconditions: c is a valid card object. postconditions: returns true if
	 * this card is higher than c. determines if this card is higher than the
	 * passed card, assuming that aces should be considered high. Uses the suit
	 * if both cards have the same face.
	 */
	public boolean isHigherThan(Card card2) {
		if (this.faceValue == card2.faceValue) {
			if (this.suitValue > card2.suitValue) {
				return true;
			} else
				return false;
		} else if ((this.faceValue > card2.faceValue && card2.faceValue != 1)
				|| (this.faceValue == 1)) {
			return true;

		} else
			return false;
	}

	/*
	 * preconditions: none postconditions: returns true if this card is higher
	 * than c. Determines if this card is higher than the passed card. The
	 * second parameter determines if aces should be considered high (beats a
	 * King) or low(lowest of all faces). Uses the suit if both cards have the
	 * same face.
	 */
	public boolean isHigherThan(Card card2, boolean aceHigh) {
		if (aceHigh == true || this.faceValue == card2.faceValue) {
			return this.isHigherThan(card2);
		} else {
			if (this.faceValue > card2.faceValue)
				return true;
			else
				return false;
		}
	}

	/*
	 * preconditions: none postconditions: returns the face(numeric value) of
	 * this card.
	 */
	public int getFace() {
		return faceValue;
	}

	/*
	 * preconditions: none postconditions: returns the suit(numeric value) of
	 * this card.
	 */
	public int getSuit() {
		return suitValue;
	}

	/*
	 * preconditions: none postconditions: returns the face(string value) of
	 * this card.
	 */
	public String getFaceName() {
		return faceName;
	}

	/*
	 * preconditions: none postconditions: returns the suit(string value) of
	 * this card.
	 */
	public String getSuitName() {
		return suitName;
	}

}// end of Card
