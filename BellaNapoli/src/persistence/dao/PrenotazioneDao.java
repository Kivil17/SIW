package persistence.dao;

import java.util.List;

import model.Prenotazione;

public interface PrenotazioneDao {
	
	public void save(Prenotazione prenotazione);  // Create
	public Prenotazione findByPrimaryKey(int idPrenotazione);     // Retrieve
	public List<Prenotazione> findAll();
	
	public Prenotazione findByPrimaryKeyJoin(int idPrenotazione);
	
	public void update(Prenotazione prenotazione); //Update
	public void delete(Prenotazione prenotazione); //Delete
	
}
