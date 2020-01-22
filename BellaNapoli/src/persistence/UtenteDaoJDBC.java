package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import model.Utente;
import persistence.dao.UtenteDao;

public class UtenteDaoJDBC implements UtenteDao {
	
	private DataSource dataSource;

	public UtenteDaoJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}


	
	@Override
	public void save(Utente utente) {
		
		Connection connection = null;
		try {
			connection = this.dataSource.getConnection();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
			try {
				String insert= "insert into utente(nome, cognome, data_nascita, cf, cittaResidenza, provincia, email) values (?,?,?,?,?,?,?)"; 
				PreparedStatement statement = connection.prepareStatement(insert);
				statement.setString(1, utente.getCf());
				statement.setString(2, utente.getNome());
				statement.setString(3, utente.getCognome());
				long secs = utente.getDataNascita().getTime();
				statement.setDate(4, new java.sql.Date(secs));
				statement.setString(5, utente.getProvincia());
				statement.setString(6, utente.getCittaResidenza());
				statement.setString(7, utente.getEmail());
				statement.executeUpdate();
			
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			} finally {
				try {
					connection.close();
				}catch (SQLException e) {
					throw new PersistenceException(e.getMessage());
				}
			}
		}

	@Override
	public Utente findByPrimaryKey(String cf) {
		Connection connection = this.dataSource.getConnection();
		Utente utente = null;
		try {
			PreparedStatement statement;
			String query = "select * from studente where cf = ?";
			statement = connection.prepareStatement(query);
			statement.setString(1, cf);
			ResultSet result = statement.executeQuery();
			if (result.next()) {
				utente = new Utente();
				utente.setCf(result.getString("cf"));				
				utente.setNome(result.getString("nome"));
				utente.setCognome(result.getString("cognome"));
				utente.setCittaResidenza("cittaResidenza");
				utente.setEmail("email");
				utente.setProvincia("provincia");
				long secs = result.getDate("data_nascita").getTime();
				utente.setDataNascita(new java.util.Date(secs));
			
			}
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}	
		return utente;

	}

	@Override
	public List<Utente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Utente utente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Utente utente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPassword(Utente utente, String password) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
