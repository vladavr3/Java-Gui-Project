package ZavrsniZadatak;

public abstract class Artikal {

	
	protected String naziv;
	protected int cena;
	
	public Artikal() {
		
	}
	
	
	public Artikal(String naziv, int cena) {
		this.naziv = naziv;
		this.cena = cena;
	}

	public int Cena() {
		
		return cena;
	}


	@Override
	public String toString() {
		return " " + naziv + " sa cenom od: " + cena + " evra.";
	}


	public int getCena() {
		return cena;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public void setCena(int cena) {
		this.cena = cena;
	}
	
	
	
	
	



	
}

