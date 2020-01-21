package persistence;

import java.util.List;

import model.Utente;

public class UtenteDao {

	public void save(Utente utente);
	public Utente findByPrimaryKey(String nickname);
	public List<Utente> findAll();
	public void update(Utente utente); 
	public void delete(Utente utente); 
	public void setPassword(Utente utente, String password);
	
}
