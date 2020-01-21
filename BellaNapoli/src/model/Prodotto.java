package model;

public class Prodotto {
	
	private int codice;
	private float prezzo;
	
	public Prodotto() {}

	public Prodotto(int codice, float prezzo) {
		super();
		this.codice = codice;
		this.prezzo = prezzo;
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	@Override
	public String toString() {
		return "prodotto [codice=" + codice + ", prezzo=" + prezzo + "]";
	}
	
	
	
}
