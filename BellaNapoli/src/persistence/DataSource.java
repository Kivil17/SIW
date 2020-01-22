package persistence;

import java.sql.*;

public class DataSource {
	
	final private String dbURI;// = "jdbc:postgresql://localhost/test";
	final private String nickname;// = "postgres";
	final private String password;// = "postgres";
	
	

	public DataSource(String dbURI, String userName, String password) {
		this.dbURI=dbURI;
		this.nickname=userName;
		this.password=password;
	}

	public Connection getConnection() throws PersistenceException {
		Connection connection = null;
		try {
		    connection = DriverManager.getConnection(dbURI,nickname, password);
			
		
		} catch(SQLException e) {
			throw new PersistenceException(e.getMessage());
		}
		return connection;
	}

}
