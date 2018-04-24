package army;

public interface Soldier {
	String TYPE = "infantry";
	int fight();

	void takeDamaged(Soldier s);
	
	boolean isAlive();
	
	String getName();

	default void sayGoodbye() {
		System.out.println("Farewell my friend");
	}
}
