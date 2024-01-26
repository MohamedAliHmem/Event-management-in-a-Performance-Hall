package sujet1;

public class ThemeArtiste implements ThemeEvt{
	private String x ;
	
	public ThemeArtiste(String x) {
		this.x = x;
	}

	public boolean theme(Evenement Evt) {
		if(Evt instanceof Theatre) {
			if(((Theatre) Evt).getActeur().equals(x) || Evt.getRealisateur().equals(x))
				return true;
		}else if(Evt instanceof Film) {
			if(((Film) Evt).getProducteur().equals(x) || Evt.getRealisateur().equals(x))
				return true;
		}
		return false ;
	}
}
