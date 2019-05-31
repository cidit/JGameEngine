package props;

import collision.Hitbox;

public abstract class Prop {
	
	private static int propCount = 0;
	
	public final int ID;
	protected Hitbox surface;
	
	protected Prop(Hitbox surface) {
		ID = propCount++;
		this.surface = surface;
	}
	
	public static int getPropCount() {
		return propCount;
	}

	public abstract void update();
	
}

