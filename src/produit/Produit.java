package produit;

public abstract class Produit {
	protected String nom;
	protected Unite unite;

	public Produit(String nom, Unite unite) {
		super();
		this.nom = nom;
		this.unite = unite;
	}

	public String getNom() {
		return nom;
	}

	public Unite getUnite() {
		return unite;
	}

	public abstract String decrireProduit();
}
