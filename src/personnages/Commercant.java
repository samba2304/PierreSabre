package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "the", argent);
	}

	public int seFaireExtorquer() {
		perdreArgent(argent);
		parler("J'ai tout perdu!Le monde est trop injuste..");
		return argent;

	}

	public void recevoir(int argent) {
		gagnerArgent(argent);
		parler(argent + " sous! Je te remercie g�n�reux donateur!");
	}

}
