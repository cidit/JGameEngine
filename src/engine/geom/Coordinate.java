package engine.geom;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * This class represents a position on a three-dimensional plane using floating points numbers.
 * 
 * @author cidit
 *
 */
public final class Coordinate {

	final float x, y, z;

	/**
	 * Constructor for an immutable position.
	 * 
	 */
	public Coordinate(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Coordinate(float x, float y) {
		this(x, y, 0);
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}

	public static float distance(Coordinate a, Coordinate b) {
		return (float) sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2) + pow(a.z - b.z, 2));
	}

	@Override
	public String toString() {
		return x + ";" + y + ";" + z;
	}

}
