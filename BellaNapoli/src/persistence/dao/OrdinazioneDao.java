package persistence.dao;

import java.util.List;

import model.Ordinazione;

public interface OrdinazioneDao {
	
	public void save(Ordinazione ordinazione);  // Create
	public Ordinazione findByPrimaryKey(int codice);     // Retrieve
	public List<Ordinazione> findAll();
	
	public Ordinazione findByPrimaryKeyJoin(int codice);
	
	public void update(Ordinazione ordinazione); //Update
	public void delete(Ordinazione ordinazione); //Delete
	
}
