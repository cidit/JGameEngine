package engine.phys;

import engine.geom.Coordinate;
import engine.geom.Dimension;

/**
 * This class represents a rectangular area at a position using integers.
 * 
 * @author cid
 *
 */
public class HitBox {

	Coordinate coordinate;
	Dimension dimension;

	int left, right, bottom, top;

	/**
	 * Constructor for a mutable hit box.
	 * 
	 * @param coordinate inferior left corner
	 * @param dimension
	 */
	public HitBox(Coordinate coordinate, Dimension dimension) {
		this.coordinate = coordinate;
		this.dimension = dimension;
		updateSides();
	}

	public Coordinate getCoordinate() {
		return coordinate;
	}

	public Dimension getDimension() {
		return dimension;
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public int getBottom() {
		return bottom;
	}

	public int getTop() {
		return top;
	}

	public void move(Coordinate coordinate) {
		this.coordinate = coordinate;
		updateSides();
	}

	public void resize(Dimension dimention) {
		this.dimension = dimention;
		updateSides();
	}

	private void updateSides() {
		right = coordinate.getX() + dimension.getWidth();
		left = coordinate.getX();
		top = coordinate.getY() + dimension.getHeight();
		bottom = coordinate.getY();
	}

	public boolean intersects(HitBox other) {
		boolean c1, c2, c3, c4;
		c1 = this.right >= other.left;
		c2 = this.bottom <= other.top;
		c3 = this.left <= other.right;
		c4 = this.top >= other.bottom;
		return (c1 && c2) || (c2 && c3) || (c3 && c4) || (c4 && c1);
	}

	public boolean contains(HitBox other) {
		boolean c1, c2, c3, c4;
		c1 = this.right >= other.left;
		c2 = this.bottom <= other.top;
		c3 = this.left <= other.right;
		c4 = this.top >= other.bottom;
		return c1 && c2 && c3 && c4;
	}

}
