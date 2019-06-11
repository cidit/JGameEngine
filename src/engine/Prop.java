package engine;

import util.euclidiangeometry.Coordinate;
import util.euclidiangeometry.Dimention;

/**
 * Prop
 * 
 * @author cidit
 *
 */
public abstract class Prop {

	protected static long prop_count = 0;
	public final long ID;
	protected Hitbox hitbox;

	/**
	 * Constructor
	 * 
	 * @param hitbox
	 */
	protected Prop(Hitbox hitbox) {
		this.hitbox = hitbox;
		ID = prop_count++;
	}
	
	/* GETTERS */
	public final Coordinate coordinate() {
		return hitbox.coordinate();
	}

	public final Dimention dimention() {
		return hitbox.dimention();
	}

	/* STATIC */
	public final static int getPropCount() {
		return prop_count;
	}
}
