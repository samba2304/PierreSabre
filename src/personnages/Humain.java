package personnages;

public class Humain {
	protected String nom;
	protected String boissonPref;
	protected int argent;
	private static final int TAILLE_TAB = 30;
	private int nbHumain = 0;
	protected Humain[] memoire = new Humain[TAILLE_TAB];
	protected int plusancien = 0; // Humain plus ancien stockéé
	protected int plusrecent = 0; // Humain plus recent stockéé

	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}

	public void faireConnaissanceAvec(Humain homme2) {
		parler(direBonjour());
		homme2.repondre(this);
		memoriser(homme2);
	}

	public void repondre(Humain homme1) {
		parler(direBonjour());
		memoriser(homme1);
	}

	public void memoriser(Humain humain) {
		int tableaumodifie = 0; // tableau pas modifie
		if (plusrecent == TAILLE_TAB) {
			plusrecent = 0;
		}
		if (nbHumain == TAILLE_TAB) {
			nbHumain = TAILLE_TAB;
		}
		if (memoire[plusrecent] == null) {
			memoire[plusrecent] = humain;
			plusrecent++;
			nbHumain++;
			tableaumodifie = 1;
		}

		if (tableaumodifie == 0) {
			if (plusancien == TAILLE_TAB) {
				plusancien = 0;
			}
			memoire[plusancien] = humain;
			plusancien++;
		}
	}

	public void listerConnaissance() {
		String reponse = "";
		System.out.println(nbHumain);
		for (int i = 0; i < nbHumain; i++) {
			if (i == nbHumain-1) {
				reponse += memoire[i].getNom();

			} else {
				reponse += memoire[i].getNom() + ",";
			}
		}
		parler("Je connais beaucoup de monde dont :" + reponse);

	}

	public void parler(String phrase) {
		System.out.println("(" + getNom() + ")- " + phrase);

	}

	public String direBonjour() {
		return "Bonjour ! je m'appelle " + getNom() + " et j'aime boire " + boissonPref;
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonPref + " GLOUPS ! ");
	}

	public void acheter(String bien, int prix) {
		if (argent < prix) {
			parler("Je n'ai plus que " + argent + " en pouche. Je ne peux meme plus m'offfir un " + bien + " " + prix
					+ " sous");

		} else {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " " + prix + " sous");
			perdreArgent(prix);
		}
	}

	public void gagnerArgent(int gain) {
		argent += gain;
	}

	public void perdreArgent(int perte) {
		argent -= perte;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

}
