package field;

import java.util.concurrent.ThreadLocalRandom;

import army.Archer;

public class MainField {

	public static void main(String[] args) {
		Archer mrA = new Archer("A");
		Archer mrB = new Archer("B");

		System.out.println("Let's start....");
		while (mrA.isAlive() && mrB.isAlive()) {
			int turn = ThreadLocalRandom.current().nextInt(1, 10);
			if (turn <= 5)
				mrB.takeDamaged(mrA);
			else
				mrA.takeDamaged(mrB);
		}
	}

}
