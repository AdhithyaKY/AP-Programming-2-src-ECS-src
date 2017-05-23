
public class Coin {
	//instance variables 
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;
	//constructor
	
	
	//sets up my coin with face set to HEADS 
	
	//constructor receives value for face
	public Coin (int f){
		if(f==HEADS)
			face = HEADS;
		else
			face = TAILS;
	}
	public Coin(){
		flip();
	}
	//mutator methods 
	public void flip(){
		face =(int)(Math.random()*2);
	}
	//accessor methods allow you to view the state of your object
	public boolean isHeads(){
		return face == HEADS;
	}
	//override inherited toString method
	public String toString(){
		if(face == HEADS)
			return "HEADS";
		else
			return "TAILS";
		
	}
	
}
