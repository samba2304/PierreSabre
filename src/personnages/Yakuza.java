package personnages;

public class Yakuza extends Humain {
	public String clan;
	public int reputation = 0;

	public Yakuza(String nom, String boissonPref, int argent, String clan, int reputation) {
		super(nom, boissonPref, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	public void extorquer(Commercant victime) {
		int argentgangne = victime.getArgent();
		parler("Tiens , tiens , ne serait-ce pas un faible marchand qui passe par la?");
		parler(victime.getNom() + " si tu tiens a la vie donne moi ta bourse!");
		gagnerArgent(argentgangne);
		victime.seFaireExtorquer();
		parler("J'ai piqué les " + argentgangne + " sous de " + victime.getNom() + " , ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi!Hi!");

	}

}
