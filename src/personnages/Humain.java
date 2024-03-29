package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	public int argent;

	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
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
