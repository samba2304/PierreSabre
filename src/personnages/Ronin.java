package personnages;

public class Ronin extends Humain {
	public int reputation = 0;
	

	public Ronin(String nom, String boissonPref, int argent) {
		super(nom, boissonPref, argent);
	}

	
	public void donner( Commercant beneficiare) {
		parler(beneficiare.getNom()+" prends ces "+ argent/10 + "  sous");
		beneficiare.recevoir(argent/10);
		perdreArgent(argent/10);
	}
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = 2*reputation;
		if (force>=adversaire.reputation) {
			parler("Je t’ai eu petit yakusa!");
			gagnerArgent(adversaire.argent);
			adversaire.perdre();
			reputation++;
		}else {
			adversaire.gagner(argent);
			perdreArgent(argent);
			reputation-=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un cou");
		}
	}
}
