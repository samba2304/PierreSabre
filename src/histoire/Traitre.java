package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Samourai;
import java.util.Random;

public class Traitre extends Samourai {
	Random random = new Random();
	int niveauTraitrise = 0;

	public Traitre(String seigneur, String nom, String boissonPref, int argent) {
		super(seigneur, nom, boissonPref, argent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String direBonjour() {
		parler("Bonjour ! je m'appelle " + getNom() + " et j'aime boire " + boissonPref);
		parler("Je suis fier de servir " + getSeigneur());
		return "Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !";

	}

	public void faireLeGentil() {
		Humain ami = null;
		String nomAmi = null;

		if (nbConnaisances != 0) {
			int indiceAleatoire = random.nextInt(nbConnaisances);
			System.out.println(indiceAleatoire);
			ami = memoire[indiceAleatoire];
			nomAmi = ami.getNom();
		}

		if (nbConnaisances < 1) {
			parler("Je ne peux faire ami ami avec personne car je connais personne ! Snif");

		} else {
			int don = getArgent() * 1 / 20;
			parler("Il faut absolument remonter ma cote de confiance. je vais faire ami ami avec " + nomAmi + " ");
			parler("Bonjour l'ami ! je voudrais vous aides en vous donnant " + don + " sous");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + getNom() + ". Vous etes quelq'un de bien.");
			if (niveauTraitrise > 1) {
				niveauTraitrise--;
			}

		}

	}

	public void raconner(Commercant commercant) {
		int argentRaconner;
		if (niveauTraitrise < 3) {
			argentRaconner = commercant.getArgent() * 2 / 10;
			commercant.perdreArgent(argentRaconner);
			gagnerArgent(argentRaconner);
			niveauTraitrise++;
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne moi " + argentRaconner
					+ " sous ou gare à toi ");
			commercant.parler("Tout de suite grand " + getNom() + " ");

		} else {
			parler("Mince je ne peux plus raconner personne sinon un samourai risque de me demasquer ");
		}
	}

}
