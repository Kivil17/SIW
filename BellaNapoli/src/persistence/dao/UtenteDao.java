package persistence.dao;

import java.util.List;

import model.Utente;
import persistence.UtenteCredenziali;

public interface UtenteDao  {

	public void save(Utente utente); //create
	/*public Utente findByPrimaryKey(String cf); //retrive
	public List<Utente> findAll(); 
	public void update(Utente utente); 
	public void delete(Utente utente); 
	public void setPassword(Utente utente, String password); 
	public UtenteCredenziali findByPrimaryKeyCredential(String nickname); //retrive*/
	
}
