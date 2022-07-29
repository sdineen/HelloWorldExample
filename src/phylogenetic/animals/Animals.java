package phylogenetic.animals;

import phylogenetic.Eukaryota;

public class Animals extends Eukaryota {

	public Animals() {
		System.out.println("Animals constructor");
	}

	public Animals(String name) {
		super(name);
	}

	@Override
	public double numberOfSpecies() {
		return 7e6;
	}
	
}
