package personnages;

public class Ronin extends Humain {
	public int reputation = 1;

	public Ronin(String nom, String boissonPref, int argent, int reputation) {
		super(nom, boissonPref, argent);
		this.reputation = reputation;
	}

	
	public void donner( Commercant beneficiare) {
		parler(beneficiare.getNom()+" prends ces "+ argent/10 + "  sous");
		beneficiare.recevoir(argent/10);
		perdreArgent(argent/10);
	}
}
