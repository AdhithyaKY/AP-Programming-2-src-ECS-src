import info.gridworld.actor.Bug;
public class DancingBug extends Bug {
	private int didTurn = 0;
	private int[] turns;
	
	public DancingBug(int[] turns){
		this.turns = turns;
	}
	
    public void act()
    {
        if(canMove())
        {
        	for(int i=0; i<turns[didTurn]; i++)
        		turn();
            move();
            didTurn++;
        }
        if(didTurn >= turns.length){
        	

        	didTurn = 0;
        }
    }
	
}
