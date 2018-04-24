package army;

public class Archer implements Soldier {
	private int m_damage;
	private int m_health;
	private String m_name;

	public Archer(String name) {
		m_damage = 3;
		m_health = 100;
		m_name = name;
	}

	@Override
	public int fight() {
		return m_damage;
	};
	
	@Override
	public boolean isAlive() {
		return m_health > 0;
	}
	
	@Override
	public String getName() {
		return m_name;
	}

	@Override
	public void takeDamaged(Soldier s) {
		m_health -= s.fight();

		System.out.println(m_name + " is attacked by " + s.getName());
		if (!isAlive()) {
			this.sayGoodbye();
		}
	}
}
