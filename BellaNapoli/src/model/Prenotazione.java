package model;

import java.util.Date;

public class Prenotazione {
		private int idPrenotazione;
		private Date dataPrenotazione;
		private Utente idUtente;
		private Tavolo idTavolo;
		
		public Prenotazione() {}

		public Prenotazione(int idPrenotazione, Date dataPrenotazione, Utente idUtente, Tavolo idTavolo) {
			super();
			this.idPrenotazione = idPrenotazione;
			this.dataPrenotazione = dataPrenotazione;
			this.idUtente = idUtente;
			this.idTavolo = idTavolo;
		}

		public int getIdPrenotazione() {
			return idPrenotazione;
		}

		public void setIdPrenotazione(int idPrenotazione) {
			this.idPrenotazione = idPrenotazione;
		}

		public Date getDataPrenotazione() {
			return dataPrenotazione;
		}

		public void setDataPrenotazione(Date dataPrenotazione) {
			this.dataPrenotazione = dataPrenotazione;
		}

		public Utente getIdUtente() {
			return idUtente;
		}

		public void setIdUtente(Utente idUtente) {
			this.idUtente = idUtente;
		}

		public Tavolo getIdTavolo() {
			return idTavolo;
		}

		public void setIdTavolo(Tavolo idTavolo) {
			this.idTavolo = idTavolo;
		}

		@Override
		public String toString() {
			return "Prenotazione [idPrenotazione=" + idPrenotazione + ", dataPrenotazione=" + dataPrenotazione
					+ ", idUtente=" + idUtente + ", idTavolo=" + idTavolo + "]";
		}
		
}
