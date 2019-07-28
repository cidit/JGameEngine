package engine;

public abstract class GameObject {

	private static long game_object_count = 0;
	public final long objectID;
	
	protected Hitbox hitbox;
	protected Vector movement;
	
	public GameObject(Hitbox hitbox) {
		objectID = game_object_count++;
		this.hitbox = hitbox;
		movement = new Vector(0, 0, 0);
	}
	
	public static long getGameObjectCount() {
		return game_object_count;
	}
	
}