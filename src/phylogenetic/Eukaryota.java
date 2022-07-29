package phylogenetic;

public class Eukaryota {
	
	
 	private String name;

	public Eukaryota() {
 		System.out.println("Eukaryota constructor");
	}
 	
 	public Eukaryota(String name) {
 		this.name = name;
 	}

	public double numberOfSpecies() {
		return 1e7;
	}

	public String getName() {
		return name;
	}
}
