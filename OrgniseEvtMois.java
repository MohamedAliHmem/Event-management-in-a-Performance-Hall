package sujet1;

import java.util.Arrays;

public class OrgniseEvtMois {
	private int mois ;
	private ThemeEvt theme ;
	private Evenement [] tabEvt ;
	
	public OrgniseEvtMois(int mois, ThemeEvt theme) {
		this.mois = mois;
		this.theme = theme;
		this.tabEvt =new Evenement[this.nbMax(mois)+1];
	}

	public int nbMax(int mois) {
		if(mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 11)
			return 31;
		else if(mois == 2)
			return 28;
		else
			return 30;
	}
	
	void ajouter(Evenement Evt, int jour) throws EvtException{
		int bool = 0 ;
		if(jour<1 || jour>31) {
			throw new EvtException("Jour Incorrecte");
		}else {
			if (this.tabEvt[jour] == null) {
				this.tabEvt[jour] = Evt ;
			}else {
				for(int i=1; i<=this.tabEvt.length ; i++) {
					if(this.tabEvt[i]==null) {
						this.tabEvt[i]=Evt;
						bool = 1;
						break;
					}
				}
			}
		}
		if(bool == 1) {
			throw new EvtException("Complet");
		}
	}
	

	void afficheCalendrierEvts() {
		System.out.println("OrgniseEvtMois [tabEvt=" + Arrays.toString(tabEvt) + "]");
	}
	
	public static void main(String[] args) throws EvtException {
		ThemeArtiste ta=new ThemeArtiste("Mohamed");
		String tArtistes1[]= {"Ahmed","Salah","Mohamed"};
		String tArtistes2[]= {"Sana","Imene","Mouna"};
		OrgniseEvtMois MJuillet=new OrgniseEvtMois(7,ta);
		Evenement e1= new Film("Film1",2 , tArtistes1, "Sami", "Youssef", "action");
		Evenement e2= new Film("Film2",1 , tArtistes2, "Dalel", "Asma", "Drame");
		Evenement e3=new Theatre("theatre1", 3, null, "Nour", "Mohamed");
		MJuillet.ajouter(e3, 1);
		MJuillet.afficheCalendrierEvts();
	}

}
