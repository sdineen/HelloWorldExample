package challenges.garage;

import java.util.Random;

public class Motorbike extends Vehicle {

	public Motorbike(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double repairCost() {
		// TODO Auto-generated method stub
		return 50 + new Random().nextInt(200);
	}

}
