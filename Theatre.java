package sujet1;

public class Theatre extends Evenement{
	private String acteur ;

	public Theatre(String titre, int duree, String[] nomAct, String realisateur, String acteur) {
		super(titre, duree, nomAct, realisateur);
		this.acteur = acteur;
	}

	@Override
	public String toString() {
		return "Theatre [acteur=" + acteur + "]";
	}

	public String getActeur() {
		return acteur;
	}

	
}
