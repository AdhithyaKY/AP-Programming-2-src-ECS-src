/*
 * Adhithya Kondalsamy
 * 11/15/16
 * Period: 6
 * Represents a pair of dice with faces showing values between 1 and 
 * the number of faces.
 */
public class PairOfDice {

	// instance fields
	private Die d1;
	private Die d2;

	// constructors
	// defaults to 6 sides face value of 1
	public PairOfDice() {

		d1 = new Die();
		d2 = new Die();

	}

	// sets number of sides of both dice to integer s.
	public PairOfDice(int s) {
		d1 = new Die(s);
		d2 = new Die(s);
	}

	/*
	 * sets number of sides of first die to 
	 * integer a and sets number of sides of
	 * 2nd die to integer b.
	 */
	public PairOfDice(int a, int b) {
		d1 = new Die(a);
		d2 = new Die(b);

	}

	/*
	 * Modifier method Precondition: 2 dice objects 
	 * Postcondition: sets faceValue to a random value from
	 * 1 - numFaces, inclusive.
	 */
	public void roll() {
		d1.roll();
		d2.roll();
	}

	// accessor methods
	/*
	 * Precondition: one die object 
	 * PostCondition: returns current faceValue of
	 * this die
	 */
	public int getFaceValue1() {
		return d1.getFaceValue();
	}

	/*
	 * Precondition: one die object 
	 * PostCondition: returns current faceValue of
	 * this die
	 */
	public int getFaceValue2() {
		return d2.getFaceValue();
	}

	/*
	 * Precondition: faceValues of 2 dice objects 
	 * PostCondition: returns the sum
	 * of both faceValues
	 */
	public int getTotalValue() {
		return d1.getFaceValue() + d2.getFaceValue();
	}

	/*
	 * Precondition: none
	 * Postcondition: returns a string representing the
	 * faceValue of 2 dice
	 */
	public String toString() {
		return "[" + d1.getFaceValue() + "," + d2.getFaceValue() + "]";
	}

}// end PairOfDice

