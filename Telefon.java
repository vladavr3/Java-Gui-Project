package ZavrsniZadatak;

public class Telefon extends Artikal {

	private boolean naPretplatu;
	
	public Telefon(String naziv, int cena) {
		super(naziv, cena);
		
	}
	
	public Telefon(boolean naPretplatu) {
		this.naPretplatu = naPretplatu;
	}
	
	public Telefon() {
		
	}

	public boolean getNaPretplatu() {
		return naPretplatu;
	}

	public void setNaPretplatu(boolean naPretplatu) {
		this.naPretplatu = naPretplatu;
	}

	@Override
	public int Cena() {
		if (naPretplatu) {
			return cena = 1;
		}
		return cena;
	}

	
	

	
	
		
}
