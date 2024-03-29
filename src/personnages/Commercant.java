package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer(int quantite) {
		perdreArgent(quantite);
		if (argent == 0) {
			parler("J'ai tout perdu!Le monde est trop injuste..");
		}
		return quantite;

	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie généreux donateur!");
	}

}
