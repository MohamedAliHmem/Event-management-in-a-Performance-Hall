package sujet1;

public class Evenement {
	private String titre;
	private int duree ;
	private String [] nomAct ;
	private String realisateur ;

	public Evenement(String titre, int duree, String[] nomAct, String realisateur) {
		this.titre = titre;
		this.duree = duree;
		this.nomAct = nomAct;
		this.realisateur = realisateur;
	}


	@Override
	public String toString() {
		return "Evenement [titre=" + titre + ", duree=" + duree + ", realisateur=" + realisateur + "]";
	}

	public String getTitre() {
		return titre;
	}


	public int getDuree() {
		return duree;
	}

	public String getRealisateur() {
		return realisateur;
	}

	boolean acteurIn(String s) {
		for(String element : this.nomAct) {
			if(element.equals(s))
				return true;
		}
		return false ;
	}
	
}
