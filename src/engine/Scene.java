package engine;

import java.util.ArrayList;
import java.util.List;

import util.euclidiangeometry.Coordinate;
import util.euclidiangeometry.Dimention;

public abstract class Scene {
	
	protected Hitbox boundaries;
	
	protected List<Prop> props = new ArrayList<Prop>();
	protected List<Actor> actors = new ArrayList<Actor>();
	
	/**
	 * Constructor
	 * 
	 * @param dimentions
	 */
	public Scene(Dimention dimentions) {
		boundaries = new Hitbox(new Coordinate(0, 0), dimentions);
	}
	
}
