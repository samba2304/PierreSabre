package personnages;

public class Yakuza extends Humain {
	public String clan;
	public int reputation = 4;

	public Yakuza(String nom, String boissonPref, int argent, String clan) {
		super(nom, boissonPref, argent);
		this.clan = clan;
		}
	
	 @Override
	public String direBonjour() {
		 parler("Bonjour ! je m'appelle " + getNom() + " et j'aime boire " + boissonPref);
		 return "Mon clan est celui de " + clan;
		
	}

	public void extorquer(Commercant victime) {
		int argentgangne = victime.getArgent();
		parler("Tiens , tiens , ne serait-ce pas un faible marchand qui passe par la?");
		parler(victime.getNom() + " si tu tiens a la vie donne moi ta bourse!");
		gagnerArgent(argentgangne);
		victime.seFaireExtorquer();
		parler("J'ai piqu� les " + argentgangne + " sous de " + victime.getNom() + " , ce qui me fait " + getArgent()
				+ " sous dans ma poche. Hi!Hi!");

	}
	
	public int perdre() {
		parler("J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan);
		perdreArgent(argent);
		return reputation-=1;
	}
	
	public int gagner (int gain) {
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + " ? Je l'ai dépouillé de ses " +gain+ " sous.");
		gagnerArgent(gain);
		return reputation +=1;
	}
}
