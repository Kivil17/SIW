package persistence.dao;

import java.util.List;

import model.Prodotto;

public interface ProdottoDao {

	public void save(Prodotto prodotto); //create
	public Prodotto findByPrimaryKey(int codice);// retrive
	public List<Prodotto> findAll();
	public void update(Prodotto prodotto); 
	public void delete(Prodotto prodotto); 
}
