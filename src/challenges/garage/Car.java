package challenges.garage;

import java.util.Random;

public class Car extends Vehicle {

	public Car(int id, String name) {
		super(id, name);
	}

	@Override
	public double repairCost() {
		return 100 + new Random().nextInt(400);
	}

}
