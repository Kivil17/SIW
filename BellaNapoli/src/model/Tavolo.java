package model;

public class Tavolo {
	

	private int numeroTavolo;
	private int posti;
	private boolean prenotato;
	
	
	public Tavolo() {prenotato=false;}

	public Tavolo(int numeroTavolo, int posti, boolean prenotato) {
		this.numeroTavolo = numeroTavolo;
		this.posti = posti;
		this.prenotato = prenotato;
	}

	public int getNumeroTavolo() {
		return numeroTavolo;
	}

	public void setNumeroTavolo(int numeroTavolo) {
		this.numeroTavolo = numeroTavolo;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public boolean isPrenotato() {
		return prenotato;
	}

	public void setPrenotato(boolean prenotato) {
		this.prenotato = prenotato;
	}
	
	@Override
	public String toString() {
		return "Tavolo [numeroTavolo=" + numeroTavolo + ", posti=" + posti + ", prenotato=" + prenotato + "]";
	}
	
}
