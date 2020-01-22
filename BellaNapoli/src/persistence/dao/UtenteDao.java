package persistence.dao;

import java.util.List;

import model.Utente;

public interface UtenteDao  {

	public void save(Utente utente);
	public Utente findByPrimaryKey(String cf);
	public List<Utente> findAll();
	public void update(Utente utente); 
	public void delete(Utente utente); 
	public void setPassword(Utente utente, String password);
	//public utenteCredenziali (findByPrimaryKeyCredential(String nickname);
	
}
