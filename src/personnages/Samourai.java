package personnages;

public class Samourai extends Humain {
	public String seigneur;
	
	public Samourai(String seigneur,String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
		this.seigneur = seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}

	@Override
	
	public String direBonjour() {
		parler("Bonjour ! je m'appelle " + getNom() + " et j'aime boire " + boissonPref);
		return "Je suis fier de servir " + getSeigneur();
	}

	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " +boisson);
	}
	
}
