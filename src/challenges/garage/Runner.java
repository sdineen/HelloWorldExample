package challenges.garage;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		Car car1 = new Car(1, "Ford Mondeo");
		Motorbike bike1 = new Motorbike(2, "Ducati");		
		
		List<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(car1);
		vehicles.add(bike1);
		
		
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.repairCost());
		}
		

	}

}
