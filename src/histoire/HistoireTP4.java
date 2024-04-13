package histoire;

import java.awt.Robot;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akitomo = new Samourai("Miyamoto","Akitomo","saké",80);
		Traitre masoko = new Traitre("Miyamoto", "Masako", "whisky", 100);
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);

		grandMere.faireConnaissanceAvec(akitomo);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masoko);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.listerConnaissance();
		grandMere.ragoter();
	}

}
