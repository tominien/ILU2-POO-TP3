package produit;

public enum Unite {
	KILOGRAMME("kg"), GRAMME("g"), LITRE("l"), CENTILITRE("cl"), MILLILITRE("ml"), PIECE("piece");

	private String symbole;

	private Unite(String symbole) {
		this.symbole = symbole;
	}

	public String getSymbole() {
		return symbole;
	}

}
