/*
 * Adhithya Kondalsamy
 * Period: 6
 * 12/21/16
 * Period: 6
 * Represents a Coin object that has a face and a isLocked state.   
 */
public class Coin implements Lockable, Comparable <Coin>{
	//instance variables 
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;
	private boolean isLocked;
	private int key;
	private double faceValue;
	//constructor
	
	
	//sets up my coin with face set to HEADS 
	
	//constructor receives value for face
	public Coin (int f, int key, double value){
		if(f==HEADS)
			face = HEADS;
		else
			face = TAILS;
		this.key = key;
		isLocked = false;
		faceValue = value;
	}
	//constructor: randomly sets the face of the coin to heads or tails
	// inLocked is false and key is 0.
	public Coin(){
		flip();
		isLocked = false;
		faceValue = 0.01;
		key = 0;
	}
	//mutator methods 
	//precondition: none
	//postcondition: if coin is unlocked randomly sets face to heads or tails.
	public void flip(){
		if(isLocked == false){
			face =(int)(Math.random()*2);
		}else{
			System.out.println("The coin is locked.");
		}
		
	}
	//accessor methods allow you to view the state of your object.
	//precondition: none.
	//postcondition: if coin is locked, displays a message saying coin is locked 
	//returning false by default else return the face == HEADS.
	public boolean isHeads(){
		if(isLocked == false){
			return face == HEADS;
		}else{
			System.out.println("The coin is locked.");
			return false;
		}	
	}
	
	//override inherited toString method
	//precondition: none.
	//postcondition: if the coin is not locked, returns the face
	//value in string form, otherwise returns the string 
	//"This coin is locked."
	public String toString(){
		if(isLocked == false){
			if(face == HEADS){
				return "HEADS";
			}else{
				return "TAILS";
			}
		}else{
			return "This coin is locked.";
		}
		
		
	}
	//precondition: none
	//postcondition: if this coin is unlocked, set the this key to key.
	public void setKey(int key) {
		this.key = key;
		
	}
	//precondition:none
	//postcondition: if the key is correct, the object is locked.
	public void lock(int key) {
		if(this.key == key){
			isLocked = true;
			System.out.println("Coin is locked.");
		}
		
	}
	//precondition: none
	//postcondition: if the key is correct, unlock this coin.
	public void unlock(int key) {
		if(this.key == key){
			isLocked = false;
			System.out.println("Coin is unlocked.");
		}
		
	}
	//precondition: none
	//postcondition: returns the value of isLocked.
	public boolean locked() {
		return isLocked;
	}
	public int compareTo (Coin c){
		return (int)((this.faceValue - c.faceValue)*100);
	}
	
}//end class
