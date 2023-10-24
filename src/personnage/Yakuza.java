package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()
				+ " , si tu tiens à la vie, donne moi ta bourse !");
		gagnerArgent(victime.getArgent());
		victime.seFaireExtorquer();
		parler("J'ai pique les "
				+ victime.getArgent()+ " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " "
						+ "sous dans ma poche. Ha Ha !!");
	}
	
	public int perdre() {
		reputation -= 1;
		parler("J'ai perdu mon duel et mes " +  getArgent() + " sous, snif... J'ai deshonore le clan de " + clan);
		perdreArgent(getArgent());
		return reputation;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation += 1;
		parler("Ce ronin pensait vraiment battre " + nom + " du clan de "+ clan+ " ? Je l'ai depouille de ses "
		+ gain + " sous.");
	}

	public int getReputation() {
		return reputation;
	}
}
