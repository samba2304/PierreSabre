package histoire;

import java.util.Random;

import personnages.Humain;

public class GrandMere extends Humain {
	int i=0;
	
	public GrandMere(String nom, int argent) {
		super(nom, "", argent);
		// TODO Auto-generated constructor stub
	}

	public static final int TAILLE_TABGRANDMERERE = 5;
	Random random = new Random();
	

@Override
public void memoriser(Humain humain) {
	if (nbConnaisances==5) {
		parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");

	}else {
		int tableaumodifie = 0; // tableau pas modifie
		if (plusrecent == TAILLE_TABGRANDMERERE) {
			plusrecent = 0;
		}
		if (nbConnaisances == TAILLE_TABGRANDMERERE) {
			nbConnaisances = TAILLE_TABGRANDMERERE;
		}
		if (memoire[plusrecent] == null) {
			memoire[plusrecent] = humain;
			plusrecent++;
			nbConnaisances++;
			tableaumodifie = 1;
		}
		
	}
}

private String humainHasard() {
	TypeHumain[] types = TypeHumain.values();
	int indiceAleatoire= random.nextInt(types.length);
	String type=types[indiceAleatoire].getType();
	return type ;
	
}

public void ragoter() {
	for (Humain humain : memoire) {
		if (i==nbConnaisances) {
			break;
		}
		if (humain instanceof Traitre) {
			parler("Je sais que " + humain.getNom() + " est un traître. Petit chenapan !");
			i++;
		}else {
			parler("Je crois que " + humain.getNom() +" est un "+ humainHasard());
			i++;
		}
	
	}
}
}

