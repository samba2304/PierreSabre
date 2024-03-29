package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.parler(prof.direBonjour());
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);

		Commercant marco = new Commercant("Marco", 20);
		// marco.parler(marco.direBonjour());
		// marco.seFaireExtorquer();
		// marco.recevoir(15);
		// marco.boire();

		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 0);
		yaku.parler(yaku.direBonjour());
		yaku.extorquer(marco);
	}

}
