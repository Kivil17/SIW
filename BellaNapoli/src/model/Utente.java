package model;

import java.util.Date;


public class Utente {
	
	private String user;
	private String password;
	private String nome;
	private String cognome;
	private String dataNascita;
	private String email;
	
	
	public Utente() {}

	

	public Utente(String user, String password, String nome, String cognome, String dataNascita, String email) {
		super();
		this.user = user;
		this.password = password;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.email = email;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	@Override
	public String toString() {
		return "Utente [user=" + user + ", password=" + password + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataNascita=" + dataNascita + ", email=" + email + "]";
	}

	

	
	
	
}
