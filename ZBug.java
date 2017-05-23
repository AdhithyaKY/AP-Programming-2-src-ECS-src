import info.gridworld.actor.Bug;

public class ZBug extends Bug {

	private int length = 0;
	private int steps = 0;
	private int numTurns = 0;

	public ZBug(int length) {
		setDirection(90);
		this.length = length;
	}

	public void act() {
		if (steps < length && canMove()) {
			move();
			steps++;
		} else if (steps == length && numTurns == 0) { 
			setDirection(225);
			steps = 0;
			numTurns++;
		} else if (steps == length && numTurns == 1) {
			setDirection(90);
			steps = 0;
			numTurns++;
		} else if ((steps == length && numTurns == 2) || !canMove()) {

		}

	}
}
