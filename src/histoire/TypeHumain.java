package histoire;

public enum TypeHumain {
	COMMERCANT("Commercant"),
	RONIN("Ronin"),
	SAMOURAI("Samourai"),
	HABITANT("Habitant"),
	YAKUZA("Yakuza"),
	GRANDEMERE("Grand-mère");

	private final String type;
	
	public String getType() {
		return type;
	}

	TypeHumain(String type) {
		this.type = type;
	}
}
