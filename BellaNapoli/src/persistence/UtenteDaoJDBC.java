package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;



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
		connection = this.dataSource.getConnection();
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
		Connection connection=null;
		connection = this.dataSource.getConnection();
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
	public UtenteCredenziali findByPrimaryKeyCredential(String nickname) {
		Utente utente = findByPrimaryKey(nickname);
		UtenteCredenziali utenteCred = null;
		if (utente != null){
			utenteCred = new UtenteCredenziali(dataSource);
			utenteCred.setCf(utente.getCf());
			utenteCred.setCognome(utente.getCognome());
			utenteCred.setNome(utente.getNome());
			utenteCred.setProvincia(utente.getProvincia());
			utenteCred.setDataNascita(utente.getDataNascita());
			utenteCred.setCittaResidenza(utente.getCittaResidenza());
			utenteCred.setEmail(utente.getEmail());
		}
		return utenteCred;
	}

	
	@Override
	public List<Utente> findAll() {
		Connection connection = this.dataSource.getConnection();
		List<Utente> utenti = new LinkedList<>();
		try {
			Utente utente;
			PreparedStatement statement;
			String query = "select * from utente";
			statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				utente = new Utente();
				utente.setCittaResidenza("cittaResidenza");
				utente.setEmail("email");
				utente.setProvincia("provincia");
				utente.setCf(result.getString("cf"));				
				utente.setNome(result.getString("nome"));
				utente.setCognome(result.getString("cognome"));
				long secs = result.getDate("data_nascita").getTime();
				utente.setDataNascita(new java.util.Date(secs));
				
				
				utenti.add(utente);
			}
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		}	 finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}
		return utenti;
	}


	@Override
	public void update(Utente utente) {
		Connection connection = this.dataSource.getConnection();
		try {
			String update = "update utente SET nome = ?, cognome = ?, data_nascita = ?, provincia = ?, email = ?, cittaResidenza = ?, WHERE cf=?";
			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, utente.getNome());
			statement.setString(2, utente.getCognome());
			long secs = utente.getDataNascita().getTime();
			statement.setDate(3, new java.sql.Date(secs));
			statement.setString(5, utente.getCf());
			statement.setString(4, utente.getEmail());
			statement.setString(6, utente.getProvincia());
			statement.setString(7, utente.getCittaResidenza());
			statement.executeUpdate();
		
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}
	}

	@Override
	public void delete(Utente utente) {
		Connection connection = this.dataSource.getConnection();
		try {
			String delete = "delete FROM utente WHERE cf = ? ";
			PreparedStatement statement = connection.prepareStatement(delete);
			statement.setString(1, utente.getCf());
			statement.executeUpdate();
		
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}

	}

	@Override
	public void setPassword(Utente utente, String password) {
		Connection connection = this.dataSource.getConnection();
		try {
			String update = "update studente SET password = ? WHERE matricola=?";
			PreparedStatement statement = connection.prepareStatement(update);
			statement.setString(1, password);
			statement.setString(2, utente.getCf());
			statement.executeUpdate();
		} catch (SQLException e) {
			throw new PersistenceException(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new PersistenceException(e.getMessage());
			}
		}
		
	}
	
}
