package model;

public class Prodotto {
	
	private int codice;
	private float prezzo;
	private String descrizione;
	private int nome;
	
	public Prodotto() {}

	public Prodotto(int codice, float prezzo, String descrizione, int nome) {
		this.codice = codice;
		this.prezzo = prezzo;
		this.descrizione= descrizione;
		this.nome = nome;
		
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getNome() {
		return nome;
	}

	public void setNome(int nome) {
		this.nome = nome;
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
		return "Prodotto [codice=" + codice + ", prezzo=" + prezzo + ", descrizione=" + descrizione + ", nome=" + nome
				+ "]";
	}

	
	
	
	
}
