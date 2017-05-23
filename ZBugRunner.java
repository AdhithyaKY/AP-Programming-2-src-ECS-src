import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.awt.Color;


public class ZBugRunner {

	public static void main(String[] args) {
		UnboundedGrid g = new UnboundedGrid<Actor>();
		ActorWorld world = new ActorWorld(g);
        ZBug shaq = new ZBug(6);
        shaq.setColor(Color.RED);
        world.add(new Location(7, 8), shaq);
        world.show();
        
	}

}
