package personnage;

public class Ronin extends Humain{
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int nouvelargent = (getArgent()/10);
		parler(beneficiaire.getNom() + " prend ces " + nouvelargent + " sous.");
		perdreArgent(nouvelargent);
		beneficiaire.recevoir(nouvelargent);
	}	
	
	public void provoquer (Yakuza adversaire) {
		int force = (honneur * 2);
		if (force >= adversaire.getReputation()) {
			parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand");
			gagnerArgent(adversaire.getArgent());
			honneur += 1;
			parler("Je t'ai eu petit yakusa !");
			adversaire.perdre();
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(getArgent());
		}
	}
}