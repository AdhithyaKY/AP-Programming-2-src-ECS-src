import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;


public class SpiralBugRunner {

	public static void main(String[] args) {

		UnboundedGrid g = new UnboundedGrid<Actor>();
		ActorWorld world = new ActorWorld(g);
        SpiralBug kobe = new SpiralBug(6);
        kobe.setColor(Color.CYAN);
        world.add(new Location(7, 8), kobe);
        world.show();

	}

}
