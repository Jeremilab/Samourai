package personnage;

public class Commercant extends Humain{

	public Commercant(String nom, String boisson, int argent) {
		super(nom, "the", argent);
	}
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu ! Le monde est trop injuste... ");
		return getArgent();
	}
	
	public void recevoir(int argentrecu) {
		parler(argentrecu + " sous ! Je te remercie genereux donateur !");
	}
}
