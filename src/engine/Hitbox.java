package engine;

import util.euclidiangeometry.Coordinate;
import util.euclidiangeometry.Dimention;

public class Hitbox {

	private Coordinate coordinate;
	private Dimention dimention;

	/**
	 * 
	 * @param coordinate superior left corner
	 * @param dimention
	 */
	public Hitbox(Coordinate coordinate, Dimention dimention) {
		this.coordinate = coordinate;
		this.dimention = dimention;
	}

	public Coordinate coordinate() {
		return coordinate;
	}
	
	public Dimention dimention() {
		return dimention;
	}
	
	public void move(Coordinate coordinate) {
		this.coordinate = coordinate;
	}
	
	public void resize(Dimention dimention) {
		this.dimention = dimention;
	}
	
	public boolean intersects(Hitbox other) {
		// TODO
		return false;
	}
	
	public boolean contains(Hitbox other) {
		// TODO
		return false;
	}
}
