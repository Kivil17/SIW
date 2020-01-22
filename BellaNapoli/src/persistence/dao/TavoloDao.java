package persistence.dao;

import java.util.List;

import model.Tavolo;

public interface TavoloDao {
	
	public void save(Tavolo tavolo); //create
	public Tavolo findByPrimaryKey(int numeroTavolo );// retrive
	public List<Tavolo> findAll();
	public void update(Tavolo tavolo); 
	public void delete(Tavolo tavolo); 
	
}
