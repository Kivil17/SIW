package model;

import java.util.Date;

public class Ordinazione {
	
	private int idOrdinazione;
	private Date dataOrdinazione;
	private Utente idUtente;
	private Prodotto idProdotto;
	
	public Ordinazione() {}

	public Ordinazione(int idOrdinazione, Date dataOrdinazione, Utente idUtente, Prodotto idProdotto) {
		super();
		this.idOrdinazione = idOrdinazione;
		this.dataOrdinazione = dataOrdinazione;
		this.idUtente = idUtente;
		this.idProdotto = idProdotto;
	}

	public int getIdOrdinazione() {
		return idOrdinazione;
	}

	public void setIdOrdinazione(int idOrdinazione) {
		this.idOrdinazione = idOrdinazione;
	}

	public Date getDataOrdinazione() {
		return dataOrdinazione;
	}

	public void setDataOrdinazione(Date dataOrdinazione) {
		this.dataOrdinazione = dataOrdinazione;
	}

	public Utente getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Utente idUtente) {
		this.idUtente = idUtente;
	}

	public Prodotto getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(Prodotto idProdotto) {
		this.idProdotto = idProdotto;
	}

	@Override
	public String toString() {
		return "Ordinazione [idOrdinazione=" + idOrdinazione + ", dataOrdinazione=" + dataOrdinazione + ", idUtente="
				+ idUtente + ", idProdotto=" + idProdotto + "]";
	}
	
	
}
