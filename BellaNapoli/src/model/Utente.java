package model;

import java.util.Date;


public class Utente {
	private String nickname;
	private String password;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private String email;
	private String cittaResidenza;
	private String provincia;
	
	public Utente() {}
	
	public Utente(String nickname,String nome, String cognome, Date dataNascita, String email, String cittaResidenza,String provincia, String password) {
		this.nickname=nickname;
		this.nome=nome;
		this.cognome=cognome;
		this.dataNascita=dataNascita;
		this.email=email;
		this.cittaResidenza=cittaResidenza;
		this.provincia=provincia;
		this.password= password;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
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

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCittaResidenza() {
		return cittaResidenza;
	}

	public void setCittaResidenza(String cittaResidenza) {
		this.cittaResidenza = cittaResidenza;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "Utente [nickname=" + nickname + ", password=" + password + ", nome=" + nome + ", cognome=" + cognome
				+ ", dataNascita=" + dataNascita + ", email=" + email + ", cittaResidenza=" + cittaResidenza
				+ ", provincia=" + provincia + "]";
	}

	
	
}
