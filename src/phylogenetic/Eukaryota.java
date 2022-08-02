package phylogenetic;


/**
 * @author Simon Dineen
 * Top of the phylogenetic tree
 */
public class Eukaryota {
	
	
 	/**
 	 * String representation of the object
 	 * @return
 	 * name and number of species
 	 */
 	@Override
	public String toString() {
	 return	name + " has " + numberOfSpecies() + " species";
	}

	private String name;
	private long id;

	public Eukaryota() {
 		System.out.println("Eukaryota constructor");
	}
 	
 	/**
 	 * @param name of the element in the tree
 	 */
 	public Eukaryota(String name) {
 		this.name = name;
 	}

	/**
	 * @return
	 */
	public double numberOfSpecies() {
		//explanation visible only in the code
		/*
		 * 
		 */
		return 1e7;
	}

	public String getName() {
		return name;
	}
}
