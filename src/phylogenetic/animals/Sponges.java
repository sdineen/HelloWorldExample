package phylogenetic.animals;

public class Sponges extends Animals {

	
	public Sponges() {
		System.out.println("Sponges constructor");
	}
	
	public Sponges(String name) {
		super(name);
	}

	@Override
	public double numberOfSpecies() {
		return 10800;
	}
	
}
