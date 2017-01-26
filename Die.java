/*
 * Adhithya Kondalsamy
 * 11/14/16
 * Period: 6
 * Represents one die with faces showing values between 1 and the number of faces.
 * 
 *  
 */
public class Die {
	private int numFaces;// number of sides
	private int faceValue;//current value showing on the die
	public final int MIN_FACES = 4;
	//constructors
	//defaults to 6 sides face value of 1
	public Die(){
		numFaces = 6;
		faceValue = 1;
	}
	//sets numFaces to s if s>=MIN_FACES otherwise sets numFaces to MIN_FACES, sets faceValue to 1
	public Die(int s){
		if(s >= MIN_FACES)
			numFaces = s;
		else 
			numFaces = MIN_FACES;
		faceValue = 1;
	}
	//accessor
	/*
	 * Precondition: none
	 * postcondition: returns current faceValue of this die
	 */
	public int getFaceValue(){
		return faceValue;
		
	}
	/*
	 *Precondition: none
	 *Postcondition: returns a string representing the faceValue of this die
	 */
	public String toString(){
		return ""+faceValue;
	}
	/*
	 * Precondition: obj is a Die object
	 * Postcondition: returns true if this faceValue is equal to obj's faceValue
	 * otherwise false
	 */
	public boolean equals(Object obj){
		Die d = (Die)obj;
		return faceValue == d.faceValue;
	}
	//modifier methods
	/*
	 * Precondition:none
	 * Postcondition:sets faceValue to a random value from 1 - numFaces, inclusive.
	 */
	public void roll(){
		faceValue=(int)(Math.random()*(numFaces)+1);
	}
	
	
}//end of Die
