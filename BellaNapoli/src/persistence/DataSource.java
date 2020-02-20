package persistence;

import java.sql.*;
import java.util.Properties;

public class DataSource {
	
	final private String dbURI;
	final private String nickname;
	final private String password;
	
	
	public DataSource() {
		this.dbURI="jdbc:postgresql://localhost:5432/bellanapoli";
		this.nickname="postgres";
		this.password="postgres";
	}

	public Connection getConnection()  {
		//String url = "jdbc:postgresql://localhost/BellaNapoli?user=postgres&password=Hamsik-17&ssl=true";		
		Connection conn=null;
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(dbURI,nickname, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return conn;
	}

}
