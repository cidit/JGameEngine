package engine.geom;

/**
 * This class represents a tri-dimensional area using floating points numbers.
 * 
 * @author cidit
 *
 */
public final class Dimension {

	final float width, height, depth;

	/**
	 * Constructor for an immutable rectangle.
	 * 
	 * @param width
	 * @param height
	 */
	public Dimension(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public Dimension(float width, float height) {
		this(width, height, 0);
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public float getDepth() {
		return depth;
	}

	@Override
	public String toString() {
		return width + ";" + height + ";" + depth;
	}

}
