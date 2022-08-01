package challenges.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();
	
	public void printBills() {
		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.repairCost());
		}
	}
	
	public void add(Vehicle vehicle) {
		vehicles.add(vehicle);
	}
	
	public void removeById(int id) {
		for (Vehicle vehicle : vehicles) {
			if(vehicle.getId() == id) {
				vehicles.remove(vehicle);
			}
		}
	}
	
	public void emptyGarage() {
		vehicles.clear();
	}
	
	public void removeByType(String type) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car && type=="Car") {
				vehicles.remove(vehicle);
			}
			if (vehicle instanceof Motorbike && type=="Motorbike") {
				vehicles.remove(vehicle);
			}
		}
	}

}
