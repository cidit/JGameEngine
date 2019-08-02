package engine.phys;

import engine.geom.Coordinate;
import engine.geom.Dimension;

/**
 * This class represents a rectangular area at a position using integers.
 * 
 * @author cid
 *
 */
public class HitBox2D {

	Coordinate center;
	Dimension surface;

	float left, right, bottom, top;

	/**
	 * Constructor for a mutable hit box.
	 * 
	 * @param coordinate inferior left corner
	 * @param dimension
	 */
	public HitBox2D(Coordinate coordinate, Dimension dimension) {
		this.center = coordinate;
		this.surface = dimension;
		updateSides();
	}

	public Coordinate getCenter() {
		return center;
	}

	public Dimension getSurface() {
		return surface;
	}
	
	public float getRight() {
		return right;
	}

	public float getLeft() {
		return left;
	}
	
	public float getTop() {
		return top;
	}

	public float getBottom() {
		return bottom;
	}

	public void move(Coordinate coordinate) {
		this.center = coordinate;
		updateSides();
	}

	public void resize(Dimension dimention) {
		this.surface = dimention;
		updateSides();
	}

	private void updateSides() {
		right = center.getX() + surface.getWidth() / 2;
		left = center.getX() - surface.getWidth() / 2;
		top = center.getY() + surface.getHeight() / 2;
		bottom = center.getY() - surface.getHeight() / 2;
	}

	public boolean intersects(HitBox2D other) {
		boolean c1, c2, c3, c4;
		c1 = this.right >= other.left;
		c2 = this.bottom <= other.top;
		c3 = this.left <= other.right;
		c4 = this.top >= other.bottom;
		return (c1 && c2) || (c2 && c3) || (c3 && c4) || (c4 && c1);
	}
	
	public boolean contains(HitBox2D other) {
		boolean c1, c2, c3, c4;
		c1 = this.right >= other.left;
		c2 = this.bottom <= other.top;
		c3 = this.left <= other.right;
		c4 = this.top >= other.bottom;
		return c1 && c2 && c3 && c4;
	}

}
