package engine;

import java.util.ArrayList;
import java.util.List;

import collision.Hitbox;
import props.Prop;
import util.euclidiangeometry.Coordinate;
import util.euclidiangeometry.Dimention;

public abstract class VirtualSandbox {
	
	protected Hitbox boundaries;
	protected List<Prop> props = new ArrayList<Prop>();

	public VirtualSandbox(Dimention dimentions) {
		boundaries = new Hitbox(new Coordinate(0, 0), dimentions);
	}
	
	public final List<Prop> getProps() {
		return props;
	}
	
	public final void update() {
		for (Prop prop : props) {
			prop.update();
		}
	}
	
//	public final void setInputScheme(InputScheme scheme) {
//		
//	}
	
}
